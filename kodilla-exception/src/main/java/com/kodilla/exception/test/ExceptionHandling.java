package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;

import java.nio.file.Files;
import java.nio.file.Path;

public class ExceptionHandling {

    public void exceptionHandler(double x, double y) throws SecondChallengeException {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(x,y);
        } catch (Exception e){
            throw new SecondChallengeException();
        } finally {
            System.out.println("Final line");
        }
    }
}