package com.company;

public class Main {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10,000 with the interestRate of 2, 3, 4, 5, 6, 7 and 8
        // and print the results to the console window
        for (double i = 2.0; i < 9; i++) {
            System.out.println(String.format("10,000 at %.2f per cent interest is equal to %.2f", i, calculateInterest(10000, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        System.out.println("And the backwards loop");
        for (double i = 8.0; i > 1.0; i--) {
            System.out.println(String.format("10,000 at %.2f per cent interest is equal to %.2f", i, calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }


}