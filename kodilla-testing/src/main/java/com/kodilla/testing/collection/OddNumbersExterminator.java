package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        LinkedList<Integer> onlyEvenNumbers = new LinkedList<>();
        for (Integer number: numbers){
            if (number % 2 == 0) {
                onlyEvenNumbers.add(number);
            }
        }
        return onlyEvenNumbers;
    }
}
