package com.company;

import java.util.Scanner;

public class Main {
    private static MobilePhoneService mobilePhone = new MobilePhoneService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
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
                    mobilePhone.listContacts();
                    break;
                case 2:
                    mobilePhone.addContact();
                    break;
                case 3:
                    mobilePhone.modifyContact();
                    break;
                case 4:
                    mobilePhone.removeContact();
                    break;
                case 5:
                    Contact contact = mobilePhone.searchForContact();
                    System.out.printf("\n\tContact found! %s - %s", contact.getName(), contact.getNumber());
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
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an contact in the list.");
        System.out.println("\t 6 - To quit the application");
    }
}
