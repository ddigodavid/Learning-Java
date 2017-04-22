package com.company;

public class Hamburger {
    private String meat;
    private Tomato tomato;
    private String rollType;
    private Lettuce lettuce;
    private Pickles pickles;
    private double basePrice;
    private Mayonnaise mayonnaise;

    public Hamburger(String meat, String rollType, double basePrice) {
        this.meat = meat;
        this.rollType = rollType;
        this.basePrice = basePrice;

        this.tomato = new Tomato(2.5, 0);
        this.pickles = new Pickles(3.0, 0);
        this.lettuce = new Lettuce(3.0, false);
        this.mayonnaise = new Mayonnaise(5.0, false);
    }

    public Hamburger addPickles(int units) {
        this.pickles.add(units);
        return this;
    }

    public Hamburger addTomato(int units) {
        this.tomato.add(units);
        return this;
    }

    public Hamburger addMayonnaise() {
        this.mayonnaise.add();
        return this;
    }

    public Hamburger addLettuce() {
        this.lettuce.add();
        return this;
    }

    public double getPrice() {
        System.out.println(String.format("Hamburger base price: R$%.2f", this.basePrice));

        if (this.lettuce.wasAdded()) {
            System.out.println(String.format("Lettuce - R$%.2f", this.lettuce.getPrice()));
        }

        if (this.mayonnaise.wasAdded()) {
            System.out.println(String.format("Mayonnaise - R$%.2f", this.mayonnaise.getPrice()));
        }

        if (this.tomato.wasAdded()) {
            System.out.println(String.format("Tomato x%d - R$%.2f", this.tomato.getUnits(), this.tomato.getPrice()));
        }

        if (this.pickles.wasAdded()) {
            System.out.println(String.format("Pickles x%d - R$%.2f", this.pickles.getUnits(), this.pickles.getPrice()));
        }

        return
            this.basePrice +
                this.tomato.getPrice() +
                this.lettuce.getPrice() +
                this.pickles.getPrice() +
                this.mayonnaise.getPrice();
    }
}