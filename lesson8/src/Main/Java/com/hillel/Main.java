package com.hillel;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Ukraine", 25.5, "USD");
        Transaction transaction = new Transaction(13, "June", 2023, bank);
        transaction.printTransaction();

    }
}