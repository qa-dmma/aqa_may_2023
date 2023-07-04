package com.hillel.account;

public class Account {
    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill) {
        this.person = person;
        this.bill = bill;
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

    public String toString() {
        return "User: " + getPerson() + "; Balance: " + bill + ";";
    }

}





