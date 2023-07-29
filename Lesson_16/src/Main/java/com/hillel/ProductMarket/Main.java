package com.hillel.ProductMarket;

import com.hillel.ProductMarket.foodShelf.Product;
import com.hillel.ProductMarket.foodShelf.ProductMarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("orange", 15));
        productList.add(new Product("apple", 7));
        productList.add(new Product("cucumber", 2));
        productList.add(new Product("banana", 11));
        productList.add(new Product("strawberry", 4));
        productList.add(new Product("coconut", 19));
        ProductMarket productMarket = new ProductMarket("Shelf", productList);
        System.out.println(productMarket.returnProductName());
        System.out.println(productMarket.sortProductName());
        System.out.println(productMarket.sortByHightPrice());
        System.out.println(productMarket.sortByLowerPrice());
        System.out.println(productMarket.priceToString());
    }
}
