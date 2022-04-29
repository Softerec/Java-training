package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;
import com.kodilla.patterns.strategy.social.SocialPublisher;

import java.util.concurrent.Flow;

public class User {
    private String userName;
    protected SocialPublisher publisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
