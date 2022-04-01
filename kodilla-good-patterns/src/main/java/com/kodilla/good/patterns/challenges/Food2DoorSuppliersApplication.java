package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class Food2DoorSuppliersApplication {
    public static void main(String[] args) {
        FoodProduct product1 = new FoodProduct("carrot");
        FoodProduct product2 = new FoodProduct("milk");
        FoodProduct product3 = new FoodProduct("orange");

        Map<FoodProduct, Integer> foodProductHashMap1 = new HashMap<FoodProduct, Integer>();
        foodProductHashMap1.put(product1, 10);
        foodProductHashMap1.put(product2, 10);
        foodProductHashMap1.put(product3, 10);

        Supplier supplier1 = new FoodSupplier("ExtraFoodShop", foodProductHashMap1);

        boolean orderStatus1 = supplier1.process(product1, 2);
        boolean orderStatus2 = supplier1.process(product2, 15);
        boolean orderStatus3 = supplier1.process(product2, 10);
        boolean orderStatus4 = supplier1.process(product1, 9);

        System.out.println("Order "+ product1 +" from " + supplier1.toString() + " status is " + orderStatus1);
        System.out.println("Order "+ product2 +" from " + supplier1.toString() + " status is " + orderStatus2);
        System.out.println("Order "+ product3 +" from " + supplier1.toString() + " status is " + orderStatus3);
        System.out.println("Order "+ product1 +" from " + supplier1.toString() + " status is " + orderStatus4);
    }
}
