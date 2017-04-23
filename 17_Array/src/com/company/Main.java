package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntArray = new int[10]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.printf("The average of %d number was %.2f", myIntegers.length, getAverage(myIntegers));
    }

    public static void printArray(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.printf("Element %d, value is %d\n", i, myIntArray[i]);
        }
    }

    public static int[] getIntegers(int numberOfIndexes) {
        int[] values = new int[numberOfIndexes];

        for (int i = 0; i < numberOfIndexes; i++) {
            System.out.printf("Enter the integer number %d: ", i + 1);
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sumTotal = 0;

        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }

        return ((double) sumTotal / array.length);
    }
}
