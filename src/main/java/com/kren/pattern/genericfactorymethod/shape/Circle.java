package com.kren.pattern.genericfactorymethod.shape;

public class Circle extends Shape {

    private final double radius;

    private Circle(double radius) {
	this.radius = radius;
    }

    @Override
    public double square() {
	return Math.PI * radius * radius;
    }

    public static class Builder implements ShapeBuilder {
	private double radius;

	Builder() {
	}

	@Override
	public Shape build() {
	    return new Circle(this.radius);
	}

	public Builder setRadius(double radius) {
	    this.radius = radius;
	    return this;
	}
    }
}
