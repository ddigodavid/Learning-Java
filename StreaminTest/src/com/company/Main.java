package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[]args)
    {
        System.out.println("Enter a sequence of numbers");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s+|,");
        while(scanner.hasNextInt())
        {
            System.out.println("Entered: " + scanner.nextInt());
        }
        System.out.println("DONE!");
    }
}
