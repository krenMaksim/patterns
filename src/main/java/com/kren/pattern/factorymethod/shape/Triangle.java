package com.kren.pattern.factorymethod.shape;

class Triangle extends Shape {

    private final double height;
    private final double weight;

    public Triangle(ShapeBuilder triangleBuilder) {
	this.weight = triangleBuilder.weight;
	this.height = triangleBuilder.height;
    }

    @Override
    public double square() {
	return 0.5 * height * weight;
    }

    public static class TriangleBuilder extends ShapeBuilder {

	@Override
	public Shape build() {
	    return new Triangle(this);
	}

	@Override
	public ShapeBuilder setHeight(double height) {
	    this.height = height;
	    return this;
	}

	@Override
	public ShapeBuilder setWeight(double weight) {
	    this.weight = weight;
	    return this;
	}
    }
}
