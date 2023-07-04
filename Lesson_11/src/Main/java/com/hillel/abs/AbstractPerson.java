package com.hillel.abs;

import com.hillel.account.Account;

public abstract class AbstractPerson {
    protected String name, lastName, mail, telephoneNumber;


    protected AbstractPerson(String name, String lastName, String mail, String telephoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
    }

    protected AbstractPerson(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "AbstractPerson{}";
    }

    protected AbstractPerson() {

    }


}
