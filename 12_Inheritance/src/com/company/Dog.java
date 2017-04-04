package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        super.move(5);
    }
    public void run() {
        System.out.println("Dog.run() called.");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public Dog setEyes(int eyes) {
        this.eyes = eyes;
        return this;
    }

    public int getLegs() {
        return legs;
    }

    public Dog setLegs(int legs) {
        this.legs = legs;
        return this;
    }

    public int getTail() {
        return tail;
    }

    public Dog setTail(int tail) {
        this.tail = tail;
        return this;
    }

    public int getTeeth() {
        return teeth;
    }

    public Dog setTeeth(int teeth) {
        this.teeth = teeth;
        return this;
    }

    public String getCoat() {
        return coat;
    }

    public Dog setCoat(String coat) {
        this.coat = coat;
        return this;
    }
}
