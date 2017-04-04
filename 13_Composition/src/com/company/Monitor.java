package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int screenSize;
    private Resolution nativeNesolution;

    public Monitor(String model, String manufacturer, int screenSize, Resolution nativeNesolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.nativeNesolution = nativeNesolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Resolution getNativeNesolution() {
        return nativeNesolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format("Drawing pixel at (%d,%d) in color %s", x, y, color));

    }
}
