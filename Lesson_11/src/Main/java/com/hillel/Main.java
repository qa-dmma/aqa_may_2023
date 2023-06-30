package com.hillel;

import com.hillel.account.Account;
import com.hillel.account.Bill;
import com.hillel.account.Person;
import com.hillel.services.DepositService;
import com.hillel.services.PaymentService;
import com.hillel.services.TransfertPayment;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Maksim", "Sharman", "sharmak@gmil.com",
                "+380972323656");
        Bill firstBill = new Bill(100.49);
        Account firstAccount = new Account(firstPerson, firstBill);
        Person secondPerson = new Person("Iryna", "Ryban", "rybir@yahoo.com", "+3880505900695");
        Bill secondBill = new Bill(123.12);
        Account secondAccount = new Account(secondPerson, secondBill);
        PaymentService paymentServiceFirstAccount = new PaymentService();
        PaymentService paymentServiceSecondAccount = new PaymentService();
        System.out.println(paymentServiceFirstAccount.Pay(firstAccount, 20.10));
        System.out.println(paymentServiceSecondAccount.Pay(secondAccount, 75.15));
        DepositService depositServiceFirstAccount = new DepositService();
        DepositService depositServiceSecondAccount = new DepositService();
        System.out.println(depositServiceFirstAccount.Depo(firstAccount, 132.13));
        System.out.println(depositServiceSecondAccount.Depo(secondAccount, 51.32));
        TransfertPayment transfertPaymentFromFirstUser = new TransfertPayment();
        System.out.println(transfertPaymentFromFirstUser.Transfer(firstAccount, secondAccount, 13.86));
    }
}