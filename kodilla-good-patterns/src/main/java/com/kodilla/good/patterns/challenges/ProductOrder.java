package com.kodilla.good.patterns.challenges;

public class ProductOrder {
    private User user;
    private Product product;
    private String sendTo;
    private int quantity;

    public ProductOrder(User user, Product product, String sendToo, int quantity) {
        this.user = user;
        this.product = product;
        this.sendTo = sendToo;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public String getSendTo() {
        return sendTo;
    }

    public int getQuantity() {
        return quantity;
    }
}
