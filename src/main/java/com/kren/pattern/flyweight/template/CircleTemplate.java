package com.kren.pattern.flyweight.template;

import com.kren.pattern.flyweight.shape.ShapeColor;

public class CircleTemplate {
    private final int radius;
    private final ShapeColor color;

    CircleTemplate(int radius, ShapeColor color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public ShapeColor getColor() {
        return color;
    }
}
