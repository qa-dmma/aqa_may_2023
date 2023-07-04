package com.hillel.abs;

import com.hillel.account.Account;

public abstract class AbstractServices {

    protected double result, sum, amount;
    protected Account account;
    protected Account firstUser;
    protected Account secondUser;


    protected AbstractServices(Account account, double sum) {
        this.account = account;
        this.sum = sum;
    }

    public AbstractServices(Account firstUser, Account secondUser, double amount) {
        this.firstUser = firstUser;
        this.secondUser = secondUser;
        this.amount = amount;
    }

    protected AbstractServices() {

    }

    protected abstract String bankOperation();
}


