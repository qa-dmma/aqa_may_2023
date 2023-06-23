package com.hillel.inheritance;

public class KharkivRegion extends KyivRegion{
    public KharkivRegion(String city, int foundationDate, int square, int population) {
        super(city, foundationDate, square, population);
    }

    public KharkivRegion(String city, int foundationDate, int square, int population, String transport) {
        super(city, foundationDate, square, population, transport);
    }
}
