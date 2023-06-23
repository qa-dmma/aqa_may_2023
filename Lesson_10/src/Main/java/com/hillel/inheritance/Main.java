package com.hillel.inheritance;

public class Main {
    public static void main(String[] args) {
        LvivRegion lviv = new LvivRegion("Lviv", 1256, 149, 1141119, "Tram and Busses");
        System.out.println(AbstractRegion.sCity + lviv.city);
        System.out.println(AbstractRegion.sFound + lviv.foundationDate);
        System.out.println(AbstractRegion.sSquare + lviv.square);
        System.out.println(AbstractRegion.sPopulation + lviv.population);
        System.out.println(AbstractRegion.sTransport + lviv.transport);


    }
}