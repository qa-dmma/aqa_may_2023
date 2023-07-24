package com.hillel.ProductMarket;

import com.hillel.ProductMarket.foodShelf.ProductMarket;
import com.hillel.ProductMarket.foodShelf.StorageProduct;

public class Main {
    public static void main(String[] args) {
        ProductMarket product0 = new ProductMarket("orange", 15);
        ProductMarket product1 = new ProductMarket("apple", 7);
        ProductMarket product2 = new ProductMarket("cucumber", 2);
        ProductMarket product3 = new ProductMarket("banana", 11);
        ProductMarket product4 = new ProductMarket("strawberry", 4);
        ProductMarket product5 = new ProductMarket("coconut", 19);
        StorageProduct.getProductNames();
        StorageProduct.getSortedProductNames();
        StorageProduct.getPriceMoreThen(10, '>');
        StorageProduct.getPriceLessThen(5, '<');
        StorageProduct.getPriceString();
    }
}