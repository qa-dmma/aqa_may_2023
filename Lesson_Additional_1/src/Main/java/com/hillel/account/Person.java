package com.hillel.account;

import com.hillel.abs.AbstractBank;

public class Person extends AbstractBank {

    public Person(String name, String lastName, String mail, String telephoneNumber) {
        super(name, lastName, mail, telephoneNumber);
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Current User: " + name + " " + lastName + ", Mail: " + mail + ", Phone Number: " + telephoneNumber + ".";
    }
}
