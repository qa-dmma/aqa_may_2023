package com.hillel.productmarket.comparators;

import com.hillel.productmarket.foodshelf.Product;

import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
