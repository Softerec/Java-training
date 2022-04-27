package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void loggerSet() {
        logger = Logger.LOG;
    }

    @Test
    void testLastLog() {
        Logger logger = Logger.LOG;
        logger.log("First log");
        logger.log("Not last log");
        logger.log("Last log");
        assertEquals("Last log", logger.getLastLog());
    }

    @Test
    void testLastLogWhenNoNewLogsAndNewLogObjectCreated() {
        assertEquals("Last log", logger.getLastLog());
    }
}
