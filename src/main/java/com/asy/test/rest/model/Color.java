package com.asy.test.rest.model;

/**
 * Created by Asy
 */
public class Color {

    private String hex;
    private String text;
    private ColorDetail colorDetail;

    public Color(String text, String hex) {
        this.hex = hex;
        this.text = text;
    }

    public Color(String text, String hex, ColorDetail colorDetail) {
        this.hex = hex;
        this.text = text;
        this.colorDetail = colorDetail;
    }

    public String getHex() {
        return hex;
    }

    public String getText() {
        return text;
    }

    public ColorDetail getColorDetail() {
        return colorDetail;
    }

    // setter is necessary for genson to parse response. Otherwise null
    public void setColorDetail(ColorDetail colorDetail) {
        this.colorDetail = colorDetail;
    }

    @Override
    public String toString() {
        return text + ":" + hex;
    }
}
