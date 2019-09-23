package com.kren.pattern.flyweight;

import com.kren.pattern.flyweight.shape.Shape;
import com.kren.pattern.flyweight.shape.ShapeColor;
import com.kren.pattern.flyweight.shape.ShapeFactory;

public class FlyweightMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        for (int i = 0; i < 100_000; i++) {
            Shape circle = factory.createCircle(5, 10, 10, ShapeColor.BLUE);
            circle.draw();
        }
    }
}
