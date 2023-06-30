package com.hillel.services;

import com.hillel.account.Account;

public class PaymentService {
    private Account account;
    private double result;

    public String Pay(Account account, double sum) {
        this.account = account;
        result = account.getBill().setAmount(account.getBill().getAmount() - sum);
        Rounded rounded = new Rounded();
        System.out.println(sum + " has been transfered from user " + account.getPerson());
        System.out.println("Total balance is: " + (rounded.Round(result)));
        return "_____________________";

    }
}







