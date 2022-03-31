package com.kodilla.good.patterns.challenges;

public class EmailMessage implements Message{
    private String message;

    public void setMessage(String emailMessage) {
        this.message = emailMessage;
    }

    public String getMessage() {
        return message;
    }
}
