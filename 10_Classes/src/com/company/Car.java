package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public int getDoors() {
        return doors;
    }

    public Car setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getWheels() {
        return wheels;
    }

    public Car setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public Car setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }
}
