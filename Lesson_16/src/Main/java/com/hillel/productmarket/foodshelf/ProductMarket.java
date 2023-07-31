package com.hillel.productmarket.foodshelf;

import java.util.*;
import java.util.stream.Collectors;


public class ProductMarket {
    private String name;
    private List<Product> productList;

    public ProductMarket(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public List<String> returnProductName() {
        List<String> result = productList.stream().map(n -> n.getName()).collect(Collectors.toList());
        return result;
    }

    public List<String> sortProductName() {
        List<String> result = new ArrayList<>();
        productList.stream().sorted(Comparator.comparing(Product::getName)).forEach(n -> result.add(n.getName()));
        return result;
    }

    public List<Float> sortByHightPrice() {
        List<Float> result = new ArrayList<>();
        productList.stream().filter(p -> p.getPrice() > 10).forEach(s -> result.add(s.getPrice()));
        return result;
    }

    public List<Float> sortByLowerPrice() {
        List<Float> result = new ArrayList<>();
        productList.stream().filter(p -> p.getPrice() < 0).forEach(s -> result.add(s.getPrice()));
        return result;
    }

    public String priceToString() {
        String result = productList.stream().map(p -> p.getPrice()).collect(Collectors.toList()).toString();
        return result;
    }


}
