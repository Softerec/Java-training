package com.kodilla.good.patterns.challenges;

public class ProductRepository {
    public void createOrder(ProductOrder productOrder) {
        System.out.println(productOrder.getUser() + " has ordered " + productOrder.getProduct() +
                " in quantity " + productOrder.getQuantity() + ", to be sent to " + productOrder.getSendTo());
    }
}
