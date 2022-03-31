package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {

    @Override
    public void sendMessage(Message message, User user) {
        System.out.println(message.getMessage() + " sent to " + user);
    }
}
