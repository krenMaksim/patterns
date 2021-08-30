package com.kren.pattern.prototype;

class Circle extends Shape {

    private final int radius;

    public Circle() {
        radius = 0;
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    private Circle(Circle c) {
        super(c);
        radius = c.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}
