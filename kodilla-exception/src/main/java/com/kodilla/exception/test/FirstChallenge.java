package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Return 0. Arithmetic exception occured: " + e);
        } finally {
            System.out.println("Divide result: " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
    }
}