package com.company;

public class Addition {
    protected double price;
    private boolean added;

    public Addition(double price, boolean added) {
        this.price = price;
        this.added = added;
    }

    public double getPrice() {
        if (wasAdded()) {
            return this.price;
        }

        return 0.0;
    }

    public boolean wasAdded() {
        return this.added;
    }

    public boolean add() {
        if (! this.wasAdded()) {
            System.out.println(String.format("%s added.", this.getClass().getSimpleName()));
            this.added = true;
            return true;
        }

        System.out.println("Mayonnaise already added");
        return false;
    }
}
