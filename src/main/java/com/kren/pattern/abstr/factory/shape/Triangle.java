package com.kren.pattern.abstr.factory.shape;

class Triangle extends Shape {

    private final double height;
    private final double weight;

    public Triangle(Size triangleSize) {
	this.weight = triangleSize.weight;
	this.height = triangleSize.height;
    }

    @Override
    public double square() {
	return 0.5 * height * weight;
    }

    public static class TriangleSize extends Size {

	@Override
	public Shape build() {
	    return new Triangle(this);
	}

	@Override
	public Size setHeight(double height) {
	    this.height = height;
	    return this;
	}

	@Override
	public Size setWeight(double weight) {
	    this.weight = weight;
	    return this;
	}
    }
}
