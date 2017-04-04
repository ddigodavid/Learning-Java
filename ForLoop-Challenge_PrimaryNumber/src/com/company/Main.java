package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Enter a number so we can analyze if it is a prime number or not: ");
        number = reader.nextInt();

        if (isPrime(number)) {
            System.out.println(String.format("%d is a prime number", number));
        } else {
            System.out.println(String.format("Sorry... %d is not a prime number", number));
        }

        System.out.println("\nSearching for other prime numbers...\n");

        // Udemy Challenge - Tim Buchalka
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the "isPrime" method
        // if it is a prime number, print it put AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        int primesFound = 0;
        for (number = randomGenerator.nextInt(1000); number < 1000; number++) {
            if (isPrime(number)) {
                System.out.println(String.format("%d is a prime number.", number));
                primesFound++;
                if (primesFound == 3) {
                    break;
                }
            }
        }

        System.out.println("\n3 primes was found. See you~");

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
