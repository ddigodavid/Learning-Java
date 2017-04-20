package com.company;

public class AudiTT extends Car {
    public AudiTT(int maxSpeed, int doors) {
        super(maxSpeed, "AudiTT", doors);
    }

    public boolean accelerate(int speed) {
        if (this.getCurrentSpeed() + speed > this.getMaxSpeed()) {
            System.out.println(String.format("You have an AudiTT but you can't go faster than %d...", this.getMaxSpeed()));
            return false;
        }

        this.currentSpeed += speed;
        System.out.println(String.format("WOW! That Audi is going at %d km/h", this.getCurrentSpeed()));
        return true;
    }

    public void startEngine() {
        System.out.println("Starting Audi engines. And niiice Audi!");
    }
}
