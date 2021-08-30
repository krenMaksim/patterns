package com.kren.pattern.flyweight.shape.impl;

import com.kren.pattern.flyweight.shape.Shape;
import com.kren.pattern.flyweight.shape.ShapeColor;
import com.kren.pattern.flyweight.template.CircleTemplate;

public class CircleFlyweight implements Shape {

    private final int coordinateX;
    private final int coordinateY;
    private final CircleTemplate template;

    public CircleFlyweight(int coordinateX, int coordinateY, CircleTemplate template) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.template = template;
    }

    @Override
    public void draw() {
        int radius = template.getRadius();
        ShapeColor color = template.getColor();
        System.out.println("Circle [coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + ", radius=" + radius + ", color=" + color + "]");
    }
}
