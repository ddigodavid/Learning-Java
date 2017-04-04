package com.company;

public class SuperCar extends Car{
    private int airfoil;
    private boolean flex;
    private boolean hasTurbo;
    private boolean turboOn = false;

    public SuperCar(
        int mileage,
        int maxSpeed,
        String model,
        int airfoil,
        boolean flex
    ) {
        super(mileage, maxSpeed, model, 2, "4x2");
        this.airfoil = airfoil;
        this.flex = flex;
        this.hasTurbo = true;
    }

    public void activateTurboMode() {
        this.turboOn = true;
    }

    public void deactivateTurboMode() {
        this.turboOn = false;
    }
}
