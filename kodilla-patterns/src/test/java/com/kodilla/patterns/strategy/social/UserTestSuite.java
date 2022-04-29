package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User milosz = new Millenials("Milosz");
        User yeti = new YGeneration( "Yeti");
        User zbigniew = new ZGeneration("Zbigniew");

        //When
        System.out.println();

        //Then
        assertEquals("Snapchat", milosz.sharePost());
        assertEquals("Facebook", yeti.sharePost());
        assertEquals("Twitter", zbigniew.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User milena = new Millenials("Milena");

        //When
        System.out.println("Default publisher: " + milena.sharePost());
        milena.setPublisher(new TwitterPublisher());

        //Then
        System.out.print("Newly set publisher: " );
        assertEquals("Twitter", milena.sharePost());
    }
}
