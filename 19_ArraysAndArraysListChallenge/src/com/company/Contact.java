package com.company;

public class Contact {
    private String number;
    private String name;

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Contact() {
        this.number = null;
        this.name = null;
    }

    public String getNumber() {
        return number;
    }

    public Contact setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

}