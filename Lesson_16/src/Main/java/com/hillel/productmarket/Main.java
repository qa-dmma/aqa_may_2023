package com.hillel.productmarket;

import com.hillel.productmarket.foodshelf.Product;
import com.hillel.productmarket.foodshelf.ProductMarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("orange", 15.14f));
        productList.add(new Product("apple", 7.12f));
        productList.add(new Product("cucumber", 0.75f));
        productList.add(new Product("banana", 11.11f));
        productList.add(new Product("strawberry", 4.21f));
        productList.add(new Product("coconut", 19.13f));
        productList.add(new Product("pineapple", -1.09f));
        ProductMarket product = new ProductMarket("Shelf", productList);
        System.out.println(product.returnProductName());
        System.out.println(product.sortProductName());
        System.out.println(product.sortByHightPrice());
        System.out.println(product.sortByLowerPrice());
        System.out.println(product.priceToString());
    }
}
