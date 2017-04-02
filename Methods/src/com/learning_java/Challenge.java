package com.learning_java;

public class Challenge {
    public static void main(String[] args) {
        displayHighScorePosition("Rodrigo", calculateHighScorePosition(1500));
        displayHighScorePosition("Camila", calculateHighScorePosition(900));
        displayHighScorePosition("Dean", calculateHighScorePosition(400));
        displayHighScorePosition("Sam", calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score < 1000 && score >= 500) {
            return 2;
        } else if (score < 500 && score >= 100) {
            return 3;
        }

        return 4;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }
}
