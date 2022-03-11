package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create empty LinkedList of Integer type , " +
            "then exterminate should return also empty LinkedList of Integer type"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyListNumbers = new LinkedList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> testListNumbers;
        System.out.println("Testing " + emptyListNumbers);
        testListNumbers = oddNumbersExterminator.exterminate(emptyListNumbers);
        //Then
        Assertions.assertEquals(testListNumbers, emptyListNumbers);
    }

    @DisplayName("when create LinkedList of Integer type with values 1,2,3,4, " +
            "then exterminate should return LinkedList of Integer type with values 2,4"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer integersArray[] = new Integer[] { 1, 2, 3, 4 };
        List<Integer> integerList = Arrays.asList(integersArray);

        Integer evenIntegersArray[] = new Integer[] { 2, 4 };
        List<Integer> evenIntegerList = Arrays.asList(evenIntegersArray);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        System.out.println("Testing " + integerList);
        List<Integer> expectedListNumbers;
        expectedListNumbers = oddNumbersExterminator.exterminate(integerList);

        //Then
        Assertions.assertEquals(expectedListNumbers, evenIntegerList);
    }
}
