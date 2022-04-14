package com.kodilla.kodillaspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        assertEquals(3, calculator.add(1,2));
        assertEquals(2, calculator.div(4,2));
        assertEquals(16, calculator.mul(4,4));
        assertEquals(10, calculator.sub(14,4));
    }
}
