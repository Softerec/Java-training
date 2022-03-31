package com.kodilla.good.patterns.challenges;

public class AllegroApplication {
    public static void main(String[] args) {
        Product productSocks = new Product("socks");
        Product productNikeShoes = new Product("Nike shoes");

        User user1 = new User("Joe");

        ProductOrder user1order = new ProductOrder(user1, productSocks, "Cracow, Krakowska 1", 2);

        ProductOrderProcessor productOrder1Processor = new ProductOrderProcessor(new EmailService(),
                new ProductOrderService(), new ProductRepository());

        productOrder1Processor.process(user1order);
    }
}
