package com.company;

public class Bed {
    private int width;
    private int length;
    private String size;

    public Bed(int width, int length, String size) {
        this.width = width;
        this.length = length;
        this.size = size;
    }

    public void makeBed() {
        System.out.println("Bed -> Making");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getSize() {
        return size;
    }
}
