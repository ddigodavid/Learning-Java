package com.company;

public class JeepCompass extends Car{
    public JeepCompass(int maxSpeed, int doors) {
        super(maxSpeed, "Jeep Compass", doors);
    }

    @Override
    public boolean accelerate(int speed) {
        if (this.getCurrentSpeed() + speed > this.getMaxSpeed()) {
            System.out.println(String.format("You can't go faster than %d, but you Compass is amazing!!", this.getMaxSpeed()));
            return false;
        }

        this.currentSpeed += speed;
        System.out.println(String.format("WOW! That Jeep Compass is at %d km/h", super.getCurrentSpeed()));
        return true;
    }

    public void startEngine() {
        System.out.println("Starting Compass engines. And niiice Compass!");
    }
}
