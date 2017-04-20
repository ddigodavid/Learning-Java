package com.company;

public class Addition {
    private double price;
    protected boolean added;

    public Addition(double price, boolean added) {
        this.price = price;
        this.added = added;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean wasAdded() {
        return this.added;
    }

}
