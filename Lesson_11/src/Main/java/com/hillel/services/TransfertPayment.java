package com.hillel.services;

import com.hillel.abs.AbstractServices;
import com.hillel.account.Account;

public class TransfertPayment extends AbstractServices {

    public TransfertPayment(Account firstUser, Account secondUser, double amount) {
        super(firstUser, secondUser, amount);
    }

    @Override
    protected String bankOperation() {
        Rounded rounded = new Rounded();
        firstUser.getBill().setAmount(firstUser.getBill().getAmount() - amount);
        secondUser.getBill().setAmount(secondUser.getBill().getAmount() + amount);
        System.out.println("Transaction amount '" + amount + "' has been transfered from '" + firstUser.getPerson() + "' to '"
                + secondUser.getPerson() + "'");
        System.out.println("Current balance for '" + firstUser.getPerson() + "' is '"
                + rounded.Round(firstUser.getBill().getAmount()) + "'");
        System.out.println("Current balance for '" + secondUser.getPerson() + "' is '"
                + rounded.Round(secondUser.getBill().getAmount()) + "'");

        return null;
    }

    @Override
    public String toString() {
        return bankOperation();
    }
}
