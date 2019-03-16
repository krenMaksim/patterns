package com.kren.pattern.abstr.factory.shape;

class Circle extends Shape {

    private final double radius;

    public Circle(ShapeBuilder circleBuilder) {
	this.radius = circleBuilder.radius;
    }

    @Override
    public double square() {
	return Math.PI * radius * radius;
    }

    public static class CircleBuilder extends ShapeBuilder {

	@Override
	public Shape build() {
	    return new Circle(this);
	}

	@Override
	public ShapeBuilder setRadius(double radius) {
	    this.radius = radius;
	    return this;
	}
    }
}
