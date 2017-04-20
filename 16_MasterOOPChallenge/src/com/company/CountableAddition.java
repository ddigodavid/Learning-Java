package com.company;

public class CountableAddition extends Addition {
    private int units;

    public CountableAddition(double price, int units) {
        super(price, false);
        this.units = units;
    }

    public void add(int units) {
        if (units > 0) {
            this.added = true;
            this.units += units;
        }
    }

    @Override
    public double getPrice() {
        if (super.wasAdded()) {
            return this.units * super.getPrice();
        }

        return 0.0;
    }

    @Override
    public boolean wasAdded() {
        return this.units > 0;
    }

    public int getUnits() {
        return units;
    }
}