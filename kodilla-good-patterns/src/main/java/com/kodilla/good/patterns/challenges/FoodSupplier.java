package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class FoodSupplier extends Supplier {

    public FoodSupplier(String name, Map<FoodProduct, Integer> foodProductHashMap) {
        super(name, foodProductHashMap);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
