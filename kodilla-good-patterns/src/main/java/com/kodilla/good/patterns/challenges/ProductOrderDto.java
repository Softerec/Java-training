package com.kodilla.good.patterns.challenges;

public class ProductOrderDto {
    private ProductOrder productOrder;
    private boolean ordered;

    public ProductOrderDto(ProductOrder productOrder, boolean ordered) {
        this.productOrder = productOrder;
        this.ordered = ordered;
    }
}
