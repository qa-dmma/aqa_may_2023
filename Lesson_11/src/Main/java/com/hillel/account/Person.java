package com.hillel.account;

import com.hillel.abs.AbstractPerson;

public class Person extends AbstractPerson {

    public Person(String name, String lastName, String mail, String telephoneNumber) {
        super(name, lastName, mail, telephoneNumber);
    }


    public String toString() {
        return "Current User: " + name + " " + lastName + ", Mail: " + mail + ", Phone Number: " + telephoneNumber + ".";
    }
}
