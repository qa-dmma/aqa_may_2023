package com.hillel.account;

public class Bill {
    protected double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }

    public double getAmount() {
        return this.amount;
    }

}
