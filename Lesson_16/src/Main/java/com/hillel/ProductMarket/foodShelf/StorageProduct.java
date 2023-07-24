package com.hillel.ProductMarket.foodShelf;

import com.hillel.ProductMarket.services.ArrayServices;

import java.util.ArrayList;

public class StorageProduct {
    public static ArrayList<String> product = new ArrayList<>();


    public static String ArrayProduct(String name, int price) {
        product.add(name);
        product.add(String.valueOf(price));
        return null;
    }

    public static void getProductNames() {
        System.out.println("Sout all product:");
        System.out.println(ArrayServices.getProductNames());
        System.out.println("__________________");
    }

    public static void getSortedProductNames() {
        System.out.println("Sout all sorted product:");
        System.out.println(ArrayServices.getSortedProductNames());
        System.out.println("__________________");
    }

    public static void getPriceMoreThen(int count, char symbol) {
        System.out.println("Sout all prices more than " + count + ":");
        System.out.println(ArrayServices.getPriceMoreOrLess(count, symbol));
        System.out.println("__________________");
    }

    public static void getPriceLessThen(int count, char symbol) {
        System.out.println("Sout all prices less than " + count + ":");
        System.out.println(ArrayServices.getPriceMoreOrLess(count, symbol));
        System.out.println("__________________");
    }

    public static void getPriceString() {
        System.out.println(ArrayServices.priceToString());
        System.out.println("__________________");
    }
}


