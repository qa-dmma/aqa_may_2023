package com.hillel.services;

import com.hillel.abs.AbstractServices;
import com.hillel.account.Account;

public class DepositService extends AbstractServices {


    public DepositService(Account account, double sum) {
        super(account, sum);

    }

/*
    private String DepositServiceCount() {
        result = account.getBill().setAmount(account.getBill().getAmount() + sum);
        Rounded rounded = new Rounded();
        System.out.println("The paycheck '" + sum + "' went into the user '" + account.getPerson() + "' account. Total balance is: '"
                + (rounded.Round(result)) + "'");
        return null;
    }
*/

    @Override
    protected String bankOperation() {
        result = account.getBill().setAmount(account.getBill().getAmount() + sum);
        Rounded rounded = new Rounded();
        System.out.println("The paycheck '" + sum + "' went into the user '" + account.getPerson() + "' account. Total balance is: '"
                + (rounded.Round(result)) + "'");
        return null;
    }

    public String toString() {
        return bankOperation();
    }


}

