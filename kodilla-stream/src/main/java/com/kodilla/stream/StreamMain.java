package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Task 7.1 - Text decorator");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AnyText", (text) -> ("ABC" + text + "ABC"));
        poemBeautifier.beautify("AnyText", (text) -> (text.toUpperCase()));
        poemBeautifier.beautify("AnyText", (text) -> (" * " + text + " * "));
        poemBeautifier.beautify("AnyText", (text) -> ("_" + text.toLowerCase() + "_"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
