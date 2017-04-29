package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public boolean hasContacts() {
        return ! contacts.isEmpty();
    }

    public boolean contains(Contact contact) {
        return contacts.contains(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void modify(Contact currentContact, Contact newContact) {
        if (contacts.contains(currentContact)) {
            contacts.set(contacts.indexOf(currentContact), newContact);
        }
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }

}
