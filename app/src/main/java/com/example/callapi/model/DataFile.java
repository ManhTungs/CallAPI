package com.example.callapi.model;

public class DataFile {
    private String path;

    private String type;

    private String url;

    public DataFile(String path, String type, String url) {
        this.path = path;
        this.type = type;
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
