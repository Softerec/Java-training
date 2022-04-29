package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    String publisher = "Twitter";

    @Override
    public String share(){
        System.out.println(publisher);
        return publisher;
    }
}
