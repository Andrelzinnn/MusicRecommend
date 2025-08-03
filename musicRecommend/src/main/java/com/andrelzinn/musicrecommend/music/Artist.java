package com.andrelzinn.musicrecommend.music;

import java.util.Map;

public class Artist {
    private String id;
    private String name;
    private String type;
    private String uri;
    private String href;
    private Map<String, String> external_urls;

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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
}
