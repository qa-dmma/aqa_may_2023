package com.hillel;

import com.hillel.account.Account;
import com.hillel.account.Bill;
import com.hillel.account.Person;
import com.hillel.services.DepositService;
import com.hillel.services.PaymentService;
import com.hillel.services.TransfertPayment;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Maksim", "Sharman", "sharmak@gmail.com",
                "+380972323656");

        Bill firstBill = new Bill(100.49);
        Account firstAccount = new Account(firstPerson, firstBill);
        Person secondPerson = new Person("Iryna", "Ryban", "rybir@yahoo.com", "+3880505900695");
        Bill secondBill = new Bill(123.12);
        Account secondAccount = new Account(secondPerson, secondBill);
        PaymentService paymentServiceFirstAccount = new PaymentService(firstAccount, 23.14);
        PaymentService paymentServiceSecondAccount = new PaymentService(secondAccount, 45.41);
        paymentServiceFirstAccount.toString();
        paymentServiceSecondAccount.toString();
        DepositService depositServiceFirstAccount = new DepositService(firstAccount, 132.13);
        DepositService depositServiceSecondAccount = new DepositService(secondAccount, 54.21);
        depositServiceFirstAccount.toString();
        depositServiceSecondAccount.toString();
        TransfertPayment transfertPaymentFromFirstUser = new TransfertPayment(firstAccount, secondAccount, 14.88);
        transfertPaymentFromFirstUser.toString();
    }
}