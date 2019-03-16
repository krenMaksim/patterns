package com.kren.pattern.abstr.factory.shape;

class Rectangle extends Shape {

    private final double height;
    private final double weight;

    public Rectangle(Size triangleSize) {
	this.weight = triangleSize.weight;
	this.height = triangleSize.height;
    }

    @Override
    public double square() {
	return height * weight;
    }

    public static class RectangleSize extends Size {

	@Override
	public Shape build() {
	    return new Rectangle(this);
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
