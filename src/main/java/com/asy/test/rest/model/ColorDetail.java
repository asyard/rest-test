package com.asy.test.rest.model;

/**
 * Created by Asy
 */
public class ColorDetail {

    private String a;
    private String b;

    public ColorDetail(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a: " + a + ", b:" + b;
    }
}
