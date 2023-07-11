package com.hillel.account;

import com.hillel.enums.AccStatus;

public class Account {
    private Person person;
    private Bill bill;
    private AccStatus AccountStatus;

    public Account(Person person, Bill bill, AccStatus AccountStatus) {
        this.person = person;
        this.bill = bill;
        this.AccountStatus = AccountStatus;
    }

    public StringBuilder getPerson() {
        StringBuilder userName = new StringBuilder(person.toString());
        int indexCharStartPosition = userName.indexOf(":");
        userName.delete(0, indexCharStartPosition + 2);
        int indexCharEndPotision = userName.indexOf(",");
        int indexCharLastChar = userName.length();
        userName.delete(indexCharEndPotision, indexCharLastChar);
        return userName;
    }

    public Bill getBill() {
        return this.bill;
    }


    @Override
    public String toString() {
        return "User: " + getPerson() + ";\n" +
                "Balance: " + bill.getAmount() + ";\n" +
                "Account Status: " + AccountStatus.getAccountStatus() + ";";
    }

    public void userAccount() {
        System.out.println(toString());
    }

}





