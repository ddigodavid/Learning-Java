package com.company;

public class HealthyBurger extends Hamburger {
    private Egg egg;
    private Carrot carrot;

    public HealthyBurger(String meat, double basePrice) {
        super(meat, "Brown Rye", basePrice);
        this.egg = new Egg(5, 0);
        this.carrot = new Carrot(4, 0);
    }

    @Override
    public HealthyBurger addPickles(int units) {
        super.addPickles(units);
        return this;
    }

    @Override
    public HealthyBurger addTomato(int units) {
        super.addTomato(units);
        return this;
    }

    @Override
    public HealthyBurger addMayonnaise() {
        super.addMayonnaise();
        return this;
    }

    @Override
    public HealthyBurger addLettuce() {
        super.addLettuce();
        return this;
    }

    public HealthyBurger addEgg(int units) {
        this.egg.add(units);
        return this;
    }

    public HealthyBurger addCarrot(int units) {
        this.carrot.add(units);
        return this;
    }

    @Override
    public double getPrice() {
        double price =
            super.getPrice() +
                this.egg.getPrice() +
                this.carrot.getPrice();

        System.out.println(String.format("Egg x%d - R$%.2f", this.egg.getUnits(), this.egg.getPrice()));
        System.out.println(String.format("Carrot x%d - R$%.2f", this.carrot.getUnits(), this.carrot.getPrice()));

        return price;
    }
}
