package com.company;

public class LightFixture {
    private int lamps;
    private int intensity;
    private boolean turnedOn;

    public LightFixture(int lamps, int intensity) {
        this.lamps = lamps;
        this.intensity = intensity;
        this.turnedOn = false;
    }

    public LightFixture(int lamps, int intensity, boolean turnedOn) {
        this.lamps = lamps;
        this.intensity = intensity;
        this.turnedOn = turnedOn;
    }

    public String toggleState() {
        if (this.turnedOn) {
            this.turnedOn = false;
            return "Turned light off";
        }

        this.turnedOn = true;
        return "Turned light on";
    }

    public int getLamps() {
        return lamps;
    }

    public int getIntensity() {
        return intensity;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
