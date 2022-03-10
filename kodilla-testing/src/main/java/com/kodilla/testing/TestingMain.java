package com.kodilla.testing;

import com.kodilla.testing.calulator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // next test ->
        Calculator calc = new Calculator();

        int calcResult;
        calcResult = calc.add(16, 100);

        if (calcResult == 116) {
            System.out.println("test OK");
        } else {
            System.out.println("Error! add method in Calc");
        }

        calcResult = calc.subtract(16, 100);

        if (calcResult == -84) {
            System.out.println("test OK");
        } else {
            System.out.println("Error! subtract method in Calc");
        }

    }
}