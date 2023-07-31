package com.hillel.inheritance.cities;

import com.hillel.inheritance.regions.Regions;

public class Cities extends Regions {
    boolean undergound;
    boolean elbus;
    boolean tram;

    public Cities(String place, int foundationDate, int square, int population, boolean undergound, boolean elbus, boolean tram) {
        super(place, foundationDate, square, population);
        this.undergound = undergound;
        this.elbus = elbus;
        this.tram = tram;
    }

    protected String isUndergound() {
        if (undergound == true) {
            return "This city has underground transport";
        } else {
            return "This city hasn't underground transport";
        }
    }

    protected String isElbus() {
        if (undergound == true) {
            return "This city has electo bus transport";
        } else {
            return "This city hasn't electo bus transport";
        }
    }

    protected String isTram() {
        if (undergound == true) {
            return "This city has tram transport";
        } else {
            return "This city hasn't tram transport";
        }
    }

    public String cityInfo() {
        return "\n" + "City - " + getPlace() +
                "\n" + "Founded in - " + getFoundationDate() +
                "\n" + "Square - " + getSquare() +
                "\n" + "Population - " + getPopulation() +
                "\n" + "Public transport: " +
                "\n" + isUndergound() +
                "\n" + isElbus() +
                "\n" + isTram();
    }
}

