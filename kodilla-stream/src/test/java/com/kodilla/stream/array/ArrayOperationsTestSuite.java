package com.kodilla.stream.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 0;
        numbers[4] = 2;

        //When
        double average = ArrayOperations.getAverage(numbers);
        double expectedAverage = 0.6;

        //Then
        Assertions.assertEquals(expectedAverage, average);
    }
}
