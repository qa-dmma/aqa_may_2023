package com.hillel.inheritance;

import com.hillel.inheritance.cities.Cities;
import com.hillel.inheritance.country.Country;
import com.hillel.inheritance.regions.Regions;

public class DemoInheritance {
    public static void main(String[] args) {
        Country ukraine = new Country("Ukraine", 1991, 603549, 40997699);
        System.out.println(ukraine.countryInfo());
        Cities kharkiv = new Cities("Lviv", 1256, 149, 1141119, false, false, true);
        System.out.println(kharkiv.cityInfo());
        Regions izum = new Regions("Kharkiv district", "Kharkiv", "Izum", 1681, 41, 44979);
        System.out.println(izum.cityInfo());


    }
}