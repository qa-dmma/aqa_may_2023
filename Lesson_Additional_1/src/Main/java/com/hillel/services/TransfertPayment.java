package com.hillel.services;

import com.hillel.account.Account;

public class TransfertPayment {
    private Account firstUser;
    private Account secondUser;

    public String Transfer(Account firstUser, Account secondUser, double amount) {
        this.firstUser = firstUser;
        this.secondUser = secondUser;
        Rounded rounded = new Rounded();
        firstUser.getBill().setAmount(firstUser.getBill().getAmount() - amount);
        secondUser.getBill().setAmount(secondUser.getBill().getAmount() + amount);
        System.out.println(amount + " was transfered from " + firstUser.getPerson() + " to " + secondUser.getPerson());
        System.out.println("Current balance " + firstUser.getPerson() + " " + rounded.Round(firstUser.getBill().getAmount()));
        System.out.println("Current balance " + secondUser.getPerson() + " " + rounded.Round(secondUser.getBill().getAmount()));
        return "_____________________";
    }
}
