package com.company.Exceptions;

public class ContactNotFound extends Exception {
    private String searchTerm;

    public ContactNotFound(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String getMessage() {
        return String.format("%s not found in contacts name neither phone numbers", searchTerm);
    }
}
