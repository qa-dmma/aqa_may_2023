package com.hillel.services;

import com.hillel.abs.AbstractServices;
import com.hillel.account.Account;

public class PaymentService extends AbstractServices {

    public PaymentService(Account account, double sum) {
        super(account, sum);
    }

    @Override
    protected String bankOperation() {
        result = account.getBill().setAmount(account.getBill().getAmount() - sum);
        Rounded rounded = new Rounded();
        System.out.println("The amount '" + sum + "' has been transfered from user '" + account.getPerson() + "'. Total balance is: '"
                + (rounded.Round(result)) + "'");
        return null;
    }

//    private String PaymentServiceCount() {
//        result = account.getBill().setAmount(account.getBill().getAmount() - sum);
//        Rounded rounded = new Rounded();
//        System.out.println("The amount '" + sum + "' has been transfered from user '" + account.getPerson() + "'. Total balance is: '"
//                + (rounded.Round(result)) + "'");
//        return null;
//    }

    public String toString() {
        return bankOperation();
    }
}






