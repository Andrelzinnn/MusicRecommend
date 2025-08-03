
package com.andrelzinn.musicrecommend.music;

import java.util.List;
import java.util.Map;

public class Music {
    private String id;
    private String name;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private Map<String, String> external_ids;
    private Map<String, String> external_urls;
    private String href;
    private boolean is_local;
    private int popularity;
    private String preview_url;
    private int track_number;
    private String type;
    private String uri;
    private List<String> available_markets;
    private List<Artist> artists;
    private Album album;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscNumber() {
        return disc_number;
    }

    public int getDurationMs() {
        return duration_ms;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public Map<String, String> getExternalIds() {
        return external_ids;
    }

    public Map<String, String> getExternalUrls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public boolean isLocal() {
        return is_local;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getPreviewUrl() {
        return preview_url;
    }

    public int getTrackNumber() {
        return track_number;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public List<String> getAvailableMarkets() {
        return available_markets;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("🎵 Música: ").append(name).append("\n");
        sb.append("🎤 Artista(s): ");
        if (artists != null && !artists.isEmpty()) {
            for (int i = 0; i < artists.size(); i++) {
                sb.append(artists.get(i).getName());
                if (i < artists.size() - 1) sb.append(", ");
            }
        } else {
            sb.append("N/A");
        }
        sb.append("\n");
        sb.append("💽 Álbum: ").append(album != null ? album.getName() : "N/A").append("\n");
        sb.append("📅 Lançamento: ").append(album != null ? album.getReleaseDate() : "N/A").append("\n");
        sb.append("⏱️ Duração: ").append(duration_ms / 1000).append(" segundos\n");
        sb.append("🔥 Popularidade: ").append(popularity).append("/100\n");
        sb.append("🔗 Link: ").append(external_urls != null ? external_urls.get("spotify") : "N/A");
        return sb.toString();
    }
}

