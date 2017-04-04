package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore("Rodrigo", 500);
        calculateScore(75);
        calculateScore();

        calculateFeetAndInchesToCentimeters(100);
        calculateFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static int calculateFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

        calculateFeetAndInchesToCentimeters(feet, remainingInches);

        return 1;
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet and " + inches + " inches to centimeters is " + centimeters + " cm");

        return centimeters;
    }
}
