package com.kren.pattern.abstr.factory.shape;

class Rectangle extends Shape {

    private final double height;
    private final double weight;

    public Rectangle(ShapeBuilder triangleBuilder) {
	this.weight = triangleBuilder.weight;
	this.height = triangleBuilder.height;
    }

    @Override
    public double square() {
	return height * weight;
    }

    public static class RectangleBuilder extends ShapeBuilder {

	@Override
	public Shape build() {
	    return new Rectangle(this);
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
