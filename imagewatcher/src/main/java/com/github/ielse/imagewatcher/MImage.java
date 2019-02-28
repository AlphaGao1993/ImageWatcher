package com.github.ielse.imagewatcher;

/**
 * Created by AlphaGao on 2019/2/27 5:43 PM
 */

public class MImage {

    private String id;
    private String url;
    private int width;
    private int height;
    private int rotation;

    public static MImage parse(String url) {
        return new MImage("", url, 0, 0, 0);
    }

    public MImage(String id, String url, int width, int height, int rotation) {
        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
        this.rotation = rotation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
}
