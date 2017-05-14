package com.company;

import com.company.Exceptions.ContactNotFound;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhoneService {
    private MobilePhone mobilePhone;
    private Scanner scanner = new Scanner(System.in);

    public MobilePhoneService() {
        this.mobilePhone = new MobilePhone();
    }

    public void listContacts() {
        ArrayList<Contact> contacts = mobilePhone.getContacts();

        System.out.printf("\tYou have %d contacts in your list\n", contacts.size());

        for (Contact contact : contacts) {
            System.out.printf("\t\t%d. %s - %s\n", contacts.indexOf(contact) + 1, contact.getName(), contact.getNumber());
        }
    }

    public void addContact() {
        Contact contact = new Contact();

        System.out.print("\n\tEnter the name of the contact: ");
        contact.setName(scanner.nextLine());

        System.out.print("\n\tEnter the number of the contact: ");
        contact.setNumber(scanner.nextLine());

        mobilePhone.add(contact);
        System.out.printf("\n\tContact add! \n\t\tName: %s \n\t\tNumber: %s\n", contact.getName(), contact.getNumber());
    }

    public void modifyContact() {

        Contact currentContact = searchForContact();

        if (mobilePhone.contains(currentContact)) {
            Contact newContact = new Contact();

            System.out.print("\n\tEnter the name of the new contact: ");
            newContact.setName(scanner.nextLine());

            System.out.print("\n\tEnter the number of the new contact: ");
            newContact.setNumber(scanner.nextLine());

            mobilePhone.modify(currentContact, newContact);

            System.out.printf(
                "\n\t\t%s - %s changed to %s - %s\n\n",
                currentContact.getName(),
                currentContact.getNumber(),
                newContact.getName(),
                newContact.getNumber()
            );
        }
    }

    public void removeContact() {
        Contact contact = searchForContact();

        if (mobilePhone.contains(contact)) {
            removeContactIfAgreed(contact);
        }
    }

    @Nullable
    public Contact searchForContact() {
        int choice = 1;

        while(choice == 1) {
            try {
                System.out.print("\n\tEnter the current name or the number of the contact: ");
                String searchTerm = scanner.nextLine();
                return find(searchTerm);
            } catch (ContactNotFound e) {
                System.out.println("\tNone contact not found... Want to try again?");
                System.out.println("\t\t1 - Yes");
                System.out.println("\t\t2 - No");
                choice = scanner.nextInt();
                scanner.nextLine();
            }
        }

        return null;
    }

    private void removeContactIfAgreed(Contact contact) {
        System.out.printf("\tContact found... Are you sure you want to remove %s?\n", contact.getName());
        System.out.println("\t\t1 - Yes");
        System.out.println("\t\t2 - No");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            mobilePhone.remove(contact);
            System.out.printf("\t%s was remove from your contacts\n", contact.getName());
        }
    }

    protected Contact find(String searchTerm) throws ContactNotFound {
        int indexOfContact = search(searchTerm);
        if (wasFound(indexOfContact)) {
            return mobilePhone.getContacts().get(indexOfContact);
        }

        throw new  ContactNotFound(searchTerm);
    }

    private int search(String searchTerm) {
        for (Contact contact : mobilePhone.getContacts()) {
            if (contact.getName().equals(searchTerm) || contact.getNumber().equals(searchTerm)) {
                return mobilePhone.getContacts().indexOf(contact);
            }
        }

        return -1;
    }

    private boolean wasFound(int indexOfContact) {
        return indexOfContact >= 0;
    }

}
