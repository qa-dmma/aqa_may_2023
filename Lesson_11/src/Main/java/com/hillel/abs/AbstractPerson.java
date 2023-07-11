package com.hillel.abs;

public abstract class AbstractPerson {
    protected String name;
    protected String lastName;
    protected String mail;
    protected String telephoneNumber;


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
