package com.company;

public class Main {

    public static void main(String[] args) {
	    // Create a class and demonstrate proper encapsulation techniques.
        // The class will be called Printer
        // It will simulate a real computer printer.
        // It should have fields for the toner level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the papers)
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer printer = new Printer(8, false);
        Printer duplexPrinter = new Printer(6, true);

        printer.print(3);
        printer.print(2);
        System.out.println("Default printer - Current toner level: " + printer.getTonerLevel());
        System.out.println("----------------------------------------");

        duplexPrinter.print(2);
        duplexPrinter.fillTonerLevel(80);

        int remaining = duplexPrinter.fillTonerLevel(30);

        System.out.printf(String.format("Toner available to fill later: %d - Current toner level: %d\n\n",
                remaining, duplexPrinter.getTonerLevel()));
    }
}
