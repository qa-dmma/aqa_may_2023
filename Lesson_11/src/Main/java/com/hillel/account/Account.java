package com.hillel.account;

public class Account {
    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill) {
        this.person = person;
        this.bill = bill;
    }

    //@Override
    public StringBuilder getPerson() {
        StringBuilder userName = new StringBuilder(person.toLine());
        int indexCharStartPosition = userName.indexOf(":");
        userName.delete(0, indexCharStartPosition + 2);
        int indexCharEndPotision = userName.indexOf(",");
        int indexCharLastChar = userName.length();
        userName.delete(indexCharEndPotision, indexCharLastChar);
        //System.out.println(userName);
        return userName;
    }

    public Bill getBill() {
        return this.bill;
    }

    private String userBill() {
        System.out.println("User: " + getPerson() + "; Balance: " + bill.getAmount() + ";");
        return null;
    }

    @Override
    public String toString() {
        return userBill();
    }

}





