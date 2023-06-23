package com.hillel.inheritance;

public abstract class AbstractRegion {
    String city;
    int foundationDate, square, population;
    static String sCity = "City - ";
    static String sFound = "Foundation Date - ";
    static String sSquare = "Square - ";
    static String sPopulation = "Population - ";
    static String sTransport = "Public transport - ";


    public AbstractRegion(String city, int foundationDate, int square, int population) {
        this.city = city;
        this.foundationDate = foundationDate;
        this.square = square;
        this.population = population;
    }
}
