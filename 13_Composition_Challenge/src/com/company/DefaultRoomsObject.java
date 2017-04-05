package com.company;

public class DefaultRoomsObject {
    private int width;
    private int height;
    private boolean isOpen;

    public DefaultRoomsObject(int width, int height) {
        this.width = width;
        this.height = height;
        this.isOpen = false;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
