package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field)
        // 2. To allow the customer to withdraw funds. This should reduce the balance field,
        // but not allow the withdraw to complete if their are insufficient founds
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount digosAccount =
                new BankAccount(
                        "12345",
                        100000.0,
                        "Rodrigo David de Oliveira",
                        "digo.david.oliveira@gmail.com",
                        "+55 (11) 98293-2039"
                );

        digosAccount.withdraw(1000.0);

        digosAccount.deposit(2000.0);
        digosAccount.withdraw(102500.0);

        digosAccount.deposit(2000.0);
        digosAccount.withdraw(280.0);

        BankAccount bobsAccount = new BankAccount();
        System.out.println(String.format("Bobs Account balance: R$%.2f", bobsAccount.getBalance()));


        System.out.println("\nTesting Vip Customer\n");

        VipCustomer vipRodrigo = new VipCustomer("Rodrigo David Oliveira", 20_000);
        System.out.println(String.format("%s - %s has %.2f of limit", vipRodrigo.getEmail(), vipRodrigo.getName(), vipRodrigo.getCreditLimit()));

        VipCustomer vipCamila = new VipCustomer("Camila", 200_000, "camiladoki1@gmail.com");
        System.out.println(String.format("%s - %s has %.2f of limit", vipCamila.getEmail(), vipCamila.getName(), vipCamila.getCreditLimit()));

        VipCustomer vipSam = new VipCustomer();
        System.out.println(String.format("%s - %s has %.2f of limit", vipSam.getEmail(), vipSam.getName(), vipSam.getCreditLimit()));
    }

}
