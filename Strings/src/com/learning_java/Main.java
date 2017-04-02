package com.learning_java;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";

        System.out.println("myString is equal to " + myString);
        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString += " \u00A9 2017";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        double doubleNumber = 49.95;
        numberString = numberString + doubleNumber;
        System.out.println("The result is " + numberString);
    }
}
