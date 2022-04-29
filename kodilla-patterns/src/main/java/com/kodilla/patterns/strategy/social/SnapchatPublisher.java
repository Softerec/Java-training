package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    String publisher = "Snapchat";

    @Override
    public String share(){
        System.out.println(publisher);
        return publisher;
    }
}
