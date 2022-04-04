package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class Food2DoorWholesaler {
    public boolean order(Food2DoorOrder orderDetails) {
        if (orderDetails.getFoodSupplier() == "ExtraFoodShop") {
            Food2DoorSupplier supplier = new Food2DoorSupplierExtraFoodShop(orderDetails.getProductsList());
            return supplier.process();
        } else if (orderDetails.getFoodSupplier() == "HealthyShop") {
            Food2DoorSupplier supplier = new Food2DoorSupplierHealthyShop(orderDetails.getProductsList());
            return supplier.process();
        } else if (orderDetails.getFoodSupplier() == "GlutenFreeShop") {
            Food2DoorSupplier supplier = new Food2DoorSupplierGlutenFreeShop(orderDetails.getProductsList());
            return supplier.process();
        } else {
            return false;
        }
    }
}
