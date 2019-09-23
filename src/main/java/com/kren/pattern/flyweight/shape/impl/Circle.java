package com.kren.pattern.flyweight.shape.impl;

import com.kren.pattern.flyweight.shape.Shape;
import com.kren.pattern.flyweight.shape.ShapeColor;

public class Circle implements Shape {
    private final int coordinateX;
    private final int coordinateY;
    private final int radius;
    private final ShapeColor color;

    public Circle(int coordinateX, int coordinateY, int radius, ShapeColor color) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle [coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + ", radius=" + radius + ", color=" + color + "]");
    }
}
