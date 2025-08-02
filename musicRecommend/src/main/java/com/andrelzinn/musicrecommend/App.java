package com.andrelzinn.musicrecommend;


public class App {
    public static void main(String[] args) {
        SpotifyClient spotify = new SpotifyClient();
        try {
            String music = spotify.getMusicFromApi("https://api.spotify.com/v1/tracks/3n3Ppam7vgaVa1iaRUc9Lp");
            System.out.println("Deu Bom");
            System.out.println(music);
            System.out.println("Cabou");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SpotifyClient.shutdown();
        }
    }
}

