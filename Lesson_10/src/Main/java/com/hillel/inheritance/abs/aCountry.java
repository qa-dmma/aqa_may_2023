package com.hillel.inheritance.abs;

public abstract class aCountry {
    String place;
    int foundationDate;
    int square;
    int population;

    protected aCountry(String place, int foundationDate, int square, int population) {
        this.place = place;
        this.foundationDate = foundationDate;
        this.square = square;
        this.population = population;
    }

    protected String getPlace() {
        return place;
    }

    protected int getFoundationDate() {
        return foundationDate;
    }

    protected int getSquare() {
        return square;
    }

    protected int getPopulation() {
        return population;
    }
}
