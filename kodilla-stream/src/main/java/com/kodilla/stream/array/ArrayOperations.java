package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        System.out.println("Table values are:");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                //.map()
                .mapToDouble(n -> numbers[n])
                .average().getAsDouble();

        System.out.println("Average table value is: " + average);
        return average;
    }
}
