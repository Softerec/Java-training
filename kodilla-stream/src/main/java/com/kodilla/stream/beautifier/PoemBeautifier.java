package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator decorator) {
        String outputText = decorator.decorate(text);
        System.out.println(outputText);
    }
}
