package com.kren.pattern.abstr.factory.shape;

class Circle extends Shape {

    private final double radius;

    public Circle(Size circleSize) {
	this.radius = circleSize.radius;
    }

    @Override
    public double square() {
	return Math.PI * radius * radius;
    }

    public static class CircleSize extends Size {

	@Override
	public Shape build() {
	    return new Circle(this);
	}

	@Override
	public Size setRadius(double radius) {
	    this.radius = radius;
	    return this;
	}
    }
}
