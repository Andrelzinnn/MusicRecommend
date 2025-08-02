package com.andrelzinn.musicrecommend;

/**
 * Music
 */
public class Music {
  private String artist;
  private String album;
  private String name;
  private int duration;
  private int views;
  private int likes;

  public Music(){}

  public Music(String artist, String album, String name, int duration, int views, int likes){
    this.artist = artist;
    this.album = album;
    this.name = name;
    this.duration = duration;
    this.views = views;
    this.likes = likes;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  @Override
  public String toString() {
    return String.format("Music Name: %s%nAlbum: %s%nArtist: %s%nDuration: %s%nViews: %d%nLikes: %d%n", name, album, artist, duration, views, likes);
  }
}
