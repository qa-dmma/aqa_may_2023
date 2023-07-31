package com.hillel.productmarket;

import com.hillel.productmarket.foodshelf.Product;
import com.hillel.productmarket.foodshelf.ProductMarket;

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
        ProductMarket product = new ProductMarket("Shelf", productList);
        System.out.println(product.sortByPrice());
        System.out.println(product.sortByNameWithComparator());
        System.out.println(product.sortByPriceWithComparator());
    }
}
