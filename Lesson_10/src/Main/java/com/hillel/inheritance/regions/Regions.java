package com.hillel.inheritance.regions;

import com.hillel.inheritance.country.Country;

public class Regions extends Country {
    String district;
    String adCenter;

    public Regions(String district, String adCenter, String place, int foundationDate, int square, int population) {
        super(place, foundationDate, square, population);
        this.district = district;
        this.adCenter = adCenter;
    }

    protected Regions(String place, int foundationDate, int square, int population) {
        super(place, foundationDate, square, population);
    }

    protected String getDistrict() {
        return district;
    }

    protected String getAdCenter() {
        return adCenter;
    }

    public String cityInfo() {
        return "\n" + "District - " + getDistrict() +
                "\n" + "Adminitratice center - " + getAdCenter() +
                "\n" + "City - " + getPlace() +
                "\n" + "Founded in - " + getFoundationDate() +
                "\n" + "Square - " + getSquare() +
                "\n" + "Population - " + getPopulation();
    }
}
