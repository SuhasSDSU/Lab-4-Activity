package org.example;

import org.example.shapes.IShapes;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

public class ShapeFactory {
    public IShapes getShape(String shapeName){
        if(shapeName.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shapeName.equalsIgnoreCase("Square")){
            return new Square();
        } else {
            return null;
        }
    }
}
