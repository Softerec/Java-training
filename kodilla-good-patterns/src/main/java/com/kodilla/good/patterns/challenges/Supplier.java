package com.kodilla.good.patterns.challenges;

import java.util.Map;

abstract class Supplier {
    private String name;
    private Map<FoodProduct, Integer> foodProductHashMap;

    public Supplier(String name, Map<FoodProduct, Integer> foodProductHashMap) {
        this.name = name;
        this.foodProductHashMap = foodProductHashMap;
    }

    public String getName() {
        return name;
    }

    public boolean process(FoodProduct product, Integer quantity) {
        if (foodProductHashMap.containsKey(product) & (foodProductHashMap.get(product) >= quantity)) {
            int newQuantity = foodProductHashMap.get(product) - quantity;
            foodProductHashMap.put(product, newQuantity);
            return true;
        } else {
            return false;
        }
    };
}
