package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for showing shapes and getting shape")
    class TestShowFiguresAndGetFigure {
        @Test
        void testShowFigures() {
            //Given
            Triangle triangle = new Triangle();
            Square square = new Square();
            Circle circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals("TriangleSquareCircle", shapeCollector.showFigures());
        }

        @Test
        void testGetFigure() {
            //Given
            Triangle triangle = new Triangle();
            Square square = new Square();
            Circle circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
            Assertions.assertEquals(square, shapeCollector.getFigure(1));
            Assertions.assertEquals(circle, shapeCollector.getFigure(2));
            Assertions.assertEquals(null, shapeCollector.getFigure(3));
        }
    }

    @Nested
    @DisplayName("Tests for adding and removing shapes")
    class TestAddRemoveShape {
        @Test
        void testAddFigure() {
            //Given
            Triangle triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Given
            Triangle triangle = new Triangle();
            Square square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigureFromEmptyCollection() {
            //Given
            Square square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveOneFigureFromCollectionHavingMultipleFiguresOfTheSameShapes() {
            //Given
            Square circle = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
            Assertions.assertEquals(circle, shapeCollector.getFigure(1));
        }
    }
}
