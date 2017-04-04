package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("31254", 120_000, "Rodrigo David", "everusseverus@gmail.com", "+55 (11) 98293-2039");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public BankAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public BankAccount setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public BankAccount setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BankAccount setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println(String.format("%.2f amount is not allowed.", this.balance));
            return false;
        }

        this.balance += amount;
        System.out.println(String.format("Deposit successfully made. Current balance: R$%.2f", this.balance));
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println(String.format("Only R$%.2f available. Withdraw not processed.", this.balance));
            return false;
        }

        this.balance -= amount;
        System.out.println(String.format("Withdraw successfully made. Current balance: R$%.2f", this.balance));
        return true;
    }
}
