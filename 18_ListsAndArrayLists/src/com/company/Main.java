package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        int choice = 0;
        printInstructions();

        while (choice != 6) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice!!");
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress:");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");
    }

    private static void addItem() {
        System.out.print("Please, enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter the current item name: ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter the replacement item: ");
        groceryList.modifyGroceryItem(currentItem, scanner.nextLine());
    }

    private static void removeItem() {
        System.out.print("Enter the item name: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        System.out.println(groceryList.findItem(scanner.nextLine()));
    }
}
