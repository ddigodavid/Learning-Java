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

        this.tomato = new Tomato(2.5, false, 0);
        this.lettuce = new Lettuce(3.0, false);
        this.pickles = new Pickles(3.0, false, 0);
        this.mayonnaise = new Mayonnaise(5.0, false);
    }

    public Hamburger(
            String meat,
            Tomato tomato,
            String rollType,
            Lettuce lettuce,
            Pickles pickles,
            Mayonnaise mayonnaise
    ) {
        this.meat = meat;
        this.tomato = tomato;
        this.rollType = rollType;
        this.lettuce = lettuce;
        this.pickles = pickles;
        this.mayonnaise = mayonnaise;
    }

    public double getPrice() {
        System.out.println();

        return
            this.basePrice +
            this.tomato.getPrice() +
            this.lettuce.getPrice() +
            this.pickles.getPrice() +
            this.mayonnaise.getPrice();
    }

    public Hamburger addTomato(int units) {
        if (units > 0) {
            this.tomato.add(units);

            System.out.println(
                    String.format(
                            "%d units of tomato added. New quantity of tomatoes in the hamburger: %d",
                            units, this.tomato.getUnits()
                    )
            );

            return this;
        }

        System.out.println(String.format("Sorry, we can not add %d units of tomatoes.", units));
        return this;
    }

    public Hamburger addLettuce() {
        if (! this.lettuce.wasAdded()) {
            this.lettuce.added = true;
            System.out.println("Lettuce was added");
            return this;
        }

        System.out.println("Lettuce already added");
        return this;
    }

    public Hamburger addPickles(int units) {
        if (units > 0) {
            this.pickles.add(units);

            System.out.println(
                    String.format(
                            "%d units of pickles added. New quantity of pickles in the hamburger: %d",
                            units, this.pickles.getUnits()
                    )
            );

            return this;
        }

        System.out.println(String.format("Sorry, we can not add %d units of pickles.", units));
        return this;
    }

    public Hamburger addMayonnaise() {
        if (! this.mayonnaise.wasAdded()) {
            this.mayonnaise.added = true;
            System.out.println("Mayonnaise was added");
            return this;
        }

        System.out.println("Mayonnaise already added");
        return this;
    }
}