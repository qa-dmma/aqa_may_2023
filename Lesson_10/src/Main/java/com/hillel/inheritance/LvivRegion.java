package com.hillel.inheritance;

public class LvivRegion extends KyivRegion {

    public LvivRegion(String city, int foundationDate, int square, int population) {
        super(city, foundationDate, square, population);
    }

    public LvivRegion(String city, int foundationDate, int square, int population, String transport) {
        super(city, foundationDate, square, population, transport);
    }
}
