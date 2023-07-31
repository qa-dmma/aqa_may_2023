package com.hillel.inheritance.country;

import com.hillel.inheritance.abs.aCountry;

public class Country extends aCountry {
    public Country(String place, int foundationDate, int square, int population) {
        super(place, foundationDate, square, population);
    }

    public String countryInfo() {
        return "\n" + "Country - " + getPlace() +
                "\n" + "Founded in - " + getFoundationDate() +
                "\n" + "Square - " + getSquare() +
                "\n" + "Population - " + getPopulation();
    }
}
