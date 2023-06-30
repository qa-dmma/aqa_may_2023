package com.hillel.abs;

public abstract class AbstractBank {
    protected String name, lastName, mail, telephoneNumber;

    protected AbstractBank(String name, String lastName, String mail, String telephoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
    }

    protected AbstractBank(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public AbstractBank() {

    }

}
