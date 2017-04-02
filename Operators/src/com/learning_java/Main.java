package com.learning_java;

public class Main {

    public static void main(String[] args) {
	    double doubleValue = 20;
	    double otherDoubleValue = 80;

	    double doubleResult = (doubleValue + otherDoubleValue) * 25;
	    double remainder = doubleResult % 40;

	    if (remainder > 20) {
            System.out.println(remainder + " is greater than 20");
        } else if (remainder < 20) {
            System.out.println(remainder + " is smaller than 20");
        } else {
            System.out.println(remainder + " is equal to 20");
        }
    }
}
