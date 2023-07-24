package com.hillel.ProductMarket.services;

import com.hillel.ProductMarket.foodShelf.StorageProduct;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayServices {
    private static String getProductNames(ArrayList<String> arrayOfValues) {
        for (int i = 1; i < arrayOfValues.size(); ) {
            arrayOfValues.remove(i);
            i++;
        }
        return null;
    }

    private static String getProductValues(ArrayList<String> arrayOfValues) {
        for (int i = 0; i < arrayOfValues.size(); ) {
            arrayOfValues.remove(i);
            i++;
        }
        return null;
    }

    public static ArrayList<String> getProductNames() {
        ArrayList<String> productNames = new ArrayList<>(StorageProduct.product);
        getProductNames(productNames);
        return productNames;
    }

    public static ArrayList<String> getSortedProductNames() {
        ArrayList<String> productNamesSorted = new ArrayList<>(StorageProduct.product);
        getProductNames(productNamesSorted);
        Collections.sort(productNamesSorted);
        return productNamesSorted;
    }


    public static ArrayList<String> getPriceMoreOrLess(int count, char symbol) {
        ArrayList<String> arrayOfValues = new ArrayList<>(StorageProduct.product);
        getProductValues(arrayOfValues);
        if (symbol == '>') {
            ArrayList<String> getPriceMoreThan = new ArrayList<>();
            int[] ArrIntValuesMore = new int[arrayOfValues.size()];
            int i = 0;
            for (String s : arrayOfValues) {
                ArrIntValuesMore[i] = Integer.parseInt(s);
                if (Integer.parseInt(s) > count) {
                    getPriceMoreThan.add(String.valueOf(ArrIntValuesMore[i]));
                }
                i++;
            }
            return getPriceMoreThan;
        } else if (symbol == '<') {
            ArrayList<String> getPriceLessThan = new ArrayList<>();
            int[] ArrIntValuesLess = new int[arrayOfValues.size()];
            int j = 0;
            for (String r : arrayOfValues) {
                ArrIntValuesLess[j] = Integer.parseInt(r);
                if (Integer.parseInt(r) < count) {
                    getPriceLessThan.add(String.valueOf(ArrIntValuesLess[j]));
                }
                j++;
            }
            return getPriceLessThan;
        } else {
            System.out.println("Choose one of available options: '<' - Less OR '>'- More");
            return null;
        }
    }

    public static String priceToString() {
        ArrayList<String> valuesToString = new ArrayList<>(StorageProduct.product);
        getProductValues(valuesToString);
        String listString = String.join(", ", valuesToString);
        return listString;
    }
}



