package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class Food2DoorSupplierGlutenFreeShop implements Food2DoorSupplier {
    private Map<FoodProduct, Integer> productsList;

    public Food2DoorSupplierGlutenFreeShop(Map<FoodProduct, Integer> productsList) {
        this.productsList = productsList;
    }

    public boolean process() {
        System.out.println("Processed in GlutenFreeShop, product list:");
        for(Map.Entry<FoodProduct, Integer> entry : productsList.entrySet()){
            System.out.println(" - " + entry.getKey() + ", quantity " + entry.getValue());
        };
        return false;
    }
}
