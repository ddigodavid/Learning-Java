package com.company;

public class Car {
    protected int currentSpeed;
    private boolean engine;
    private int cylinders;
    private int maxSpeed;
    private String name;
    private int wheels;
    private int doors;

    public Car(int maxSpeed, String name, int doors) {
        this.cylinders = 4;
        this.maxSpeed = maxSpeed;
        this.doors = doors;
        this.name = name;

        this.currentSpeed = 0;
        this.engine = true;
        this.wheels= 4;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean haveEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean accelerate(int speed) {
        if (this.getCurrentSpeed() + speed > this.getMaxSpeed()) {
            System.out.println(String.format("You can't go faster than %d!!", this.getMaxSpeed()));
            return false;
        }

        this.currentSpeed += speed;
        System.out.println(String.format("Going at %d km/h", this.getCurrentSpeed()));
        return true;
    }

    public void startEngine() {
        System.out.println("Starting default car engines.");
    }

}
