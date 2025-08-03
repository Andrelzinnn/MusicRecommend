package com.andrelzinn.musicrecommend.music;

import java.util.List;
import java.util.Map;

public class Album {
    private String id;
    private String name;
    private String album_type;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private String type;
    private String uri;
    private String href;
    private Map<String, String> external_urls;
    private List<String> available_markets;
    private List<Artist> artists;
    private List<Image> images;

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlbumType() {
        return album_type;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public String getReleaseDatePrecision() {
        return release_date_precision;
    }

    public int getTotalTracks() {
        return total_tracks;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public String getHref() {
        return href;
    }

    public Map<String, String> getExternalUrls() {
        return external_urls;
    }

    public List<String> getAvailableMarkets() {
        return available_markets;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public List<Image> getImages() {
        return images;
    }

    public static class Image {
        private String url;
        private int width;
        private int height;

        public String getUrl() {
            return url;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
}
