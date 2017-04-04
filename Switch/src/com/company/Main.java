package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 3;

	    switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, 4 or 5");
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char character = 'E';

	    switch (character) {
            case 'A':
                System.out.println("The character was A");
                break;
            case 'B':
                System.out.println("The character was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The character was " + character);
                break;
            default:
                System.out.println("Invalid character entered");
                break;
        }
    }
}
