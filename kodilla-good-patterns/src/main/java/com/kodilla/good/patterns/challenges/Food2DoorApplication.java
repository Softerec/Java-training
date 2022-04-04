package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class Food2DoorApplication {

    public static void main(String[] args) {
        FoodProduct product1 = new FoodProduct("carrot");
        FoodProduct product2 = new FoodProduct("milk");
        FoodProduct product3 = new FoodProduct("orange");

        Map<FoodProduct, Integer> productsList1 = new HashMap<FoodProduct, Integer>();
        productsList1.put(product1, 10);

        Map<FoodProduct, Integer> productsList2 = new HashMap<FoodProduct, Integer>();
        productsList2.put(product1, 20);
        productsList2.put(product2, 20);

        Map<FoodProduct, Integer> productsList3 = new HashMap<FoodProduct, Integer>();
        productsList3.put(product1, 30);
        productsList3.put(product2, 30);
        productsList3.put(product3, 30);

        Food2DoorWholesaler wholesaler = new Food2DoorWholesaler();

        Food2DoorOrder order1 = new Food2DoorOrder("ExtraFoodShop", productsList1);
        Food2DoorOrder order2 = new Food2DoorOrder("HealthyShop", productsList2);
        Food2DoorOrder order3 = new Food2DoorOrder("GlutenFreeShop", productsList3);

        wholesaler.order(order1);
        wholesaler.order(order2);
        wholesaler.order(order3);
    }
}
