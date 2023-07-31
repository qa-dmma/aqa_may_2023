package com.hillel.productmarket.foodshelf;

import com.hillel.productmarket.comparators.ProductComparatorByName;
import com.hillel.productmarket.comparators.ProductComparatorByPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;


public class ProductMarket {
    private String name;
    private List<Product> productList;

    public ProductMarket(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public List<String> returnProductName() {
        List<String> result = new ArrayList<>();
        for (Product s : productList) {
            result.add(s.getName());
        }
        return result;
    }

    public List<String> sortProductName() {
        List<String> result = new ArrayList<>();
        for (Product s : productList) {
            result.add(s.getName());
        }
        Collections.sort(result);
        return result;
    }

    public List<Integer> sortByHightPrice() {
        List<Integer> result = new ArrayList<>();
        for (Product s : productList) {
            if (s.getPrice() > 10) {
                result.add(s.getPrice());
            }
        }
        return result;
    }

    public List<Integer> sortByLowerPrice() {
        List<Integer> result = new ArrayList<>();
        for (Product s : productList) {
            if (s.getPrice() < 5) {
                result.add(s.getPrice());
            }
        }
        return result;
    }

    public String priceToString() {
        List<Integer> result = new ArrayList<>();
        String delim = ",";
        for (Product s : productList) {
            result.add(s.getPrice());
        }
        StringJoiner joiner = new StringJoiner(delim);
        for (Integer integer : result) {
            joiner.add(integer.toString());
        }
        String res = joiner.toString();
        return res;
    }


    public List<Product> sortByPrice() {
        List<Product> price = new ArrayList<>(productList);
        Collections.sort(price);
        return price;
    }

    public List<Product> sortByPriceWithComparator() {
        List<Product> price = new ArrayList<>(productList);
        Collections.sort(price, new ProductComparatorByPrice());
        return price;
    }

    public List<Product> sortByNameWithComparator() {
        List<Product> price = new ArrayList<>(productList);
        Collections.sort(price, new ProductComparatorByName());
        return price;
    }

}
