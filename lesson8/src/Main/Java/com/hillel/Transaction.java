package com.hillel;


public class Transaction {

    int transactionDate;
    String transactionMonth;
    int transactionYear;
    Bank bank;


    public Transaction(int transactionDate, String transactionMonth, int transactionYear, Bank bank) {
        this.transactionDate = transactionDate;
        this.transactionMonth = transactionMonth;
        this.transactionYear = transactionYear;
        this.bank = bank;
    }

    public Transaction(int transactionDate, String transactionMonth, int transactionYear) {
        this.transactionDate = transactionDate;
        this.transactionMonth = transactionMonth;
        this.transactionYear = transactionYear;
    }

    public Transaction(int transactionDate, String transactionMonth) {
        this.transactionDate = transactionDate;
        this.transactionMonth = transactionMonth;
    }

    public Transaction(int transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Transaction(Bank bank) {
        this.bank = bank;
    }

    public void printTransaction() {
        System.out.println(bank.printBank() + "; Transaction Date: " + transactionDate + "; Transaction Month: "
                + transactionMonth + "; Transaction Year: " + transactionYear + ".");

    }



}
