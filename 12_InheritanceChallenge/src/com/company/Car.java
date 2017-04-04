package com.company;

public class Car extends Vehicle {
    private int doors;
    private String traction;

    public Car(int mileage, int maxSpeed, String model, int doors, String traction) {
        super(4, mileage, maxSpeed, model);
        this.doors = doors;
        this.traction = traction;
    }
}
