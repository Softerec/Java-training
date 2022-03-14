package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeCollector.add(shape);
    };

    public boolean removeFigure(Shape shape){
        for (Shape existingShape : shapeCollector){
            if (existingShape.equals(shape)) {
                shapeCollector.remove(shape);
                return true;
            }
        }
        return false;
    };

    public Shape getFigure(int n){
        if (n >= 0 && n < shapeCollector.size()) {
            return shapeCollector.get(n);
        }
        return null;
    };

    public String showFigures(){
        String result = "";
        for (Shape shape : shapeCollector){
            result += shape.getShapeName();
        }
        return result;
    };
}
