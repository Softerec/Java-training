package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertFalse(drive.isTaskExecuted());
        assertEquals("Drive", drive.getTaskName());
        assertTrue(drive.executeTask());
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertFalse(drive.isTaskExecuted());
        assertEquals("Paint", drive.getTaskName());
        assertTrue(drive.executeTask());
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drive = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertFalse(drive.isTaskExecuted());
        assertEquals("Do shopping", drive.getTaskName());
        assertTrue(drive.executeTask());
        assertTrue(drive.isTaskExecuted());
    }
}
