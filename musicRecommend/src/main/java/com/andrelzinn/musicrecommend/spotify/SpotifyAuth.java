package com.andrelzinn.musicrecommend.spotify;


import java.io.IOException;

import io.github.cdimascio.dotenv.Dotenv;
import org.apache.hc.core5.http.ParseException;
import se.michaelthelin.spotify.exceptions.SpotifyWebApiException;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.model_objects.credentials.ClientCredentials;
import se.michaelthelin.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;


public class SpotifyAuth {
  private final SpotifyApi spotifyApi;

  public SpotifyAuth() {
    Dotenv dotenv = Dotenv.configure()
      .directory("src/main/resources")
      .load();
    String clientId = dotenv.get("CLIENT_ID");
    String clientSecret = dotenv.get("CLIENT_SECRET");

    this.spotifyApi = new SpotifyApi.Builder()
      .setClientId(clientId)
      .setClientSecret(clientSecret)
      .build();
  }

  public String getAccessToken() {
    try {
      ClientCredentialsRequest request = spotifyApi.clientCredentials().build();
      ClientCredentials credentials = request.execute();
      return credentials.getAccessToken();
    } catch (IOException | SpotifyWebApiException | ParseException e) {
      System.err.println("Erro ao obter token de acesso: " + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }
}




