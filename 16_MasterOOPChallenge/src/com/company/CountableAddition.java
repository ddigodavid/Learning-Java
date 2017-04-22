package com.company;

public class CountableAddition extends Addition {
    private int units;

    public CountableAddition(double price, int units) {
        super(price, false);
        this.units = units;
    }

    public boolean add(int units) {
        if (units > 0) {
            this.units += units;

            System.out.println(
                String.format(
                    "%d unit(s) of %s added. New quantity in hamburger: %d",
                    units, this.getClass().getSimpleName(), this.getUnits()
                )
            );

            return true;
        }

        System.out.println(
            String.format(
                "Sorry, we can not add %d units of %s.",
                units, this.getClass().getSimpleName()
            )
        );

        return false;
    }

    @Override
    public double getPrice() {
        if (this.wasAdded()) {
            return this.units * super.price;
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