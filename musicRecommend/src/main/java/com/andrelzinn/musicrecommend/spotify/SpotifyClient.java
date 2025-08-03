package com.andrelzinn.musicrecommend.spotify;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ConnectionPool;

import java.util.concurrent.TimeUnit;

public class SpotifyClient {
  private final OkHttpClient client = new OkHttpClient();
  private static final Gson gson = new Gson();

  public String getMusicFromApi(String url) throws Exception {
    SpotifyAuth auth = new SpotifyAuth();
    String token = auth.getAccessToken();
    if (token == null) {
      throw new IllegalStateException("Token de acesso nulo. Verifique suas credenciais.");
    }

    Request request =
        new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token).build();

    try (Response response = client.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        throw new RuntimeException("Requisition Error: " + response);
      }
      return response.body().string();
    }
  }

  
  public void shutdown() {
    try {
      client.dispatcher().executorService().shutdown();

      if (!client.dispatcher().executorService().awaitTermination(5, TimeUnit.SECONDS)) {
        client.dispatcher().executorService().shutdownNow();
      }

      client.connectionPool().evictAll();

      if (client.cache() != null) {
        client.cache().close();
      }
    } catch (InterruptedException e) {
      client.dispatcher().executorService().shutdownNow();
      Thread.currentThread().interrupt();
    } catch (Exception e) {
      System.err.println("Error ao finalizar OkHttpClient: " + e.getMessage());
    }
  }

}
