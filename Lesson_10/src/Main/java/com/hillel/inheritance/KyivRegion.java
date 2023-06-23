package com.hillel.inheritance;

public class KyivRegion extends AbstractRegion {
    String transport;

    public KyivRegion(String city, int foundationDate, int square, int population) {
        super(city, foundationDate, square, population);
    }

    public KyivRegion(String city, int foundationDate, int square, int population, String transport) {
        super(city, foundationDate, square, population);
        this.transport = transport;
    }
}
