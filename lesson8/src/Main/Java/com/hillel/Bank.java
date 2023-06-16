package com.hillel;

public class Bank {
    String location;
    double amount;
    String currency;

    public Bank (String location, double amount, String currency){
        this.location = location;
        this.amount = amount;
        this.currency = currency;
    }
    public  String printBank(){
        return "Bank Location: " + location + "; Transaction Amount: " + amount + "; Transaction Currency: "
                + currency;
    }
}
