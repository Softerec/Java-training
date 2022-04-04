package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class Food2DoorOrder {
    private String foodSupplier;
    private Map<FoodProduct, Integer> productsList;

    public Food2DoorOrder(String foodSupplier, Map<FoodProduct, Integer> productsList3) {
        this.foodSupplier = foodSupplier;
        this.productsList = productsList3;
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }

    public Map<FoodProduct, Integer> getProductsList() {
        return productsList;
    }
}
