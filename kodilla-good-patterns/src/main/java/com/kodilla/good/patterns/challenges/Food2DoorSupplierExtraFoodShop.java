package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class Food2DoorSupplierExtraFoodShop implements Food2DoorSupplier {

    private Map<FoodProduct, Integer> productsList;

    public Food2DoorSupplierExtraFoodShop(Map<FoodProduct, Integer> productsList) {
        this.productsList = productsList;
    }

    public boolean process() {
        System.out.println("Processed in ExtraFoodShop.");
        return true;
    }
}
