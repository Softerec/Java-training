package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    double x = 0.0;
    double y = 0.0;

    @BeforeEach
    public void beforeEveryTest() {
        x = 1.1;
        y = 2.1;
    }

    @Test
    void testSecondChallenge() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when
        x = 1.1;
        y = 2.1;
        // then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    void whenXequalsTwo() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when
        x = 2.0;
        // then
        assertThrows(SecondChallengeException.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }

    @Test
    public void whenXYfulfillsIf() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(SecondChallengeException.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertThrows(SecondChallengeException.class, () -> secondChallenge.probablyIWillThrowException(0.9, 2.0))
        );
    }
}
