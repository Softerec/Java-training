package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductRepository productRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductRepository productRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productRepository = productRepository;
    }

    public ProductOrderDto process(final ProductOrder productOrder) {
        boolean isOrdered = productOrderService.order(productOrder);

        if (isOrdered) {
            Message emailMessage = new EmailMessage();
            emailMessage.setMessage("Email with ordered products");
            informationService.sendMessage(emailMessage, productOrder.getUser());
            productRepository.createOrder(productOrder);
            return new ProductOrderDto(productOrder, true);
        } else {
            return new ProductOrderDto(productOrder, false);
        }
    }

}
