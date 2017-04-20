package com.company;

public class Main {

    public static void main(String[] args) {
	    // We are going to go back to the car analogy
        // Create a base class called car.
        // It should have a few fields that would be appropriate for a generic car class.
        // Engine, cylinders, wheels, etc.
        // The constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and name would be passed as parameters.
        //
        // Create appropriate getters.
        // Create some methods like startEngine, and brake.
        //
        // Show message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.

        AudiTT audiTT = new AudiTT(260, 4);
        JeepCompass jeepCompass = new JeepCompass(2300, 4);
    }
}
