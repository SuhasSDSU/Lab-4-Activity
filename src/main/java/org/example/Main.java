package org.example;

import org.example.operations.SubtractionOperation;
import org.example.shapes.IShapes;



public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShapes rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Calculator cal = new Calculator(new SubtractionOperation());
        cal.executeStrategy(10,5);
    }
}