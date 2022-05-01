package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Drive", "Chicago", "car");
            case PAINTING:
                return new PaintingTask("Paint","white", "wall");
            case SHOPPING:
                return new ShoppingTask("Do shopping","coffee", 1.0);
            default:
                return null;
        }
    }
}