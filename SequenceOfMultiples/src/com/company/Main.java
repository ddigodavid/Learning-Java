package com.company;

public class Main {

    public static void main(String[] args) {
        for (int number = 200; number >= 1; number--) {
            if (isMultipleOfThreeAndFive(number)) {
                System.out.println(String.format("%d is multiple of 3 (three) and 5 (five)!", number));
            } else if (isMultipleOfFive(number)) {
                System.out.println(String.format("%d is multiple of 5 (five)!", number));
            } else if (isMultipleOfThree(number)) {
                System.out.println(String.format("%d is multiple of 3 (three)!", number));
            }
        }
    }

    private static boolean isMultipleOfThreeAndFive(int number) {
        return isMultipleOfFive(number) && isMultipleOfThree(number);
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
