package com.company;

public class Vehicle {
    private int wheels;
    private int mileage;
    private int maxSpeed;
    private String model;

    private int currentVelocity;
    private String currentDirection;

    public Vehicle(int wheels, int mileage, int maxSpeed, String model) {
        this.wheels = wheels;
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
        this.model = model;

        this.currentVelocity = 0;
        this.currentDirection = "None";
    }
}
