package com.kren.pattern.kata.v1.flyweight;

import java.util.HashMap;
import java.util.Map;

class CircleFlyweight extends Circle {

    private static final Map<String, Circle> circles = new HashMap<>();

    private final Circle circle;

    public CircleFlyweight(int x, int y, String color) {
        super(x, y, null);
        circle = circles.computeIfAbsent(color, c -> new Circle(x, y, c));
    }

    @Override
    public String getColor() {
        System.out.println(String.format("Circle flyweight: %s", circle));
        return circle.getColor();
    }

}
