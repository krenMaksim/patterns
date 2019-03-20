package com.kren.pattern.facade.shape;

public class ShapeFacade {

    private Triangle triangle;
    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacade() {
        this.triangle = new Triangle();
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawTriangle() {
        triangle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawAll() {
        triangle.draw();
        rectangle.draw();
        circle.draw();
    }
}
