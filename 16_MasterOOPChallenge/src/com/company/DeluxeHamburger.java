package com.company;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(String meat, String rollType, double basePrice) {
        super(meat, rollType, basePrice);
        super.addMayonnaise();
        super.addPickles(2);
        super.addLettuce();
        super.addTomato(2);
    }

    @Override
    public Hamburger addPickles(int units) {
        System.out.println("You can not add anymore additions");
        return this;
    }

    @Override
    public Hamburger addTomato(int units) {
        System.out.println("You can not add anymore additions");
        return this;
    }

    @Override
    public Hamburger addMayonnaise() {
        System.out.println("You can not add anymore additions");
        return this;
    }

    @Override
    public Hamburger addLettuce() {
        System.out.println("You can not add anymore additions");
        return this;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();

        System.out.printf("Chips - R$%.2f\n", 7.00);
        System.out.printf("Coca-Cola - R$%.2f", 13.00);

        return price + 7 + 13;
    }
}
