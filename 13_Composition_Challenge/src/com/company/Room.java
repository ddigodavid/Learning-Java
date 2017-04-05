package com.company;

public class Room {
    private Door door;
    private Window window;
    private Bed bed;
    private LightFixture lightFixture;
    private Wardrobe wardrobe;

    public Room(Door door, Window window, Bed bed, LightFixture lightFixture, Wardrobe wardrobe) {
        this.door = door;
        this.window = window;
        this.bed = bed;
        this.lightFixture = lightFixture;
        this.wardrobe = wardrobe;
    }

    public void pressLightSwitcher() {
        System.out.println(lightFixture.toggleState());
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
