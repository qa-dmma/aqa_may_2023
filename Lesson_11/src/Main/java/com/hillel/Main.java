package com.hillel;

import com.hillel.account.Account;
import com.hillel.account.Bill;
import com.hillel.account.Person;
import com.hillel.enums.AccStatus;
import com.hillel.services.DepositService;
import com.hillel.services.PaymentService;
import com.hillel.services.TransfertPayment;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Maksim", "Sharman", "sharmak@gmail.com",
                "+380972323656");
        Person secondPerson = new Person("Iryna", "Ryban", "rybir@yahoo.com", "+3880505900695");
        Person thirdPerson = new Person("Yana","Kotoyanc","kotya@gmail.com,","+38098870717465");
        Person fourthPerson = new Person("Masha","Narkon","narma@bing.com","+30734357543");
        Bill firstBill = new Bill(100.49);
        Bill secondBill = new Bill(123.12);
        Bill thirdBill = new Bill(478.12);
        Bill fourthBill = new Bill(673.31);
        Account firstAccount = new Account(firstPerson, firstBill, AccStatus.BLACK);
        Account secondAccount = new Account(secondPerson, secondBill, AccStatus.STANDARTGOLD);
        Account thirdAccount = new Account(thirdPerson,thirdBill,AccStatus.UNIVERSAL);
        Account fourthAccount = new Account(fourthPerson,fourthBill,AccStatus.STANDART);
        firstAccount.userAccount();
        secondAccount.userAccount();
        thirdAccount.userAccount();
        fourthAccount.userAccount();
    }
}