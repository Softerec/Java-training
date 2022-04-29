package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{
    String publisher = "Facebook";

    @Override
    public String share(){
        System.out.println(publisher);
        return publisher;
    }
}
