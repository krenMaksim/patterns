package com.kren.pattern.genericfactorymethod.shape;

public class Rectangle extends Shape {

    private final double height;
    private final double weight;

    private Rectangle(double height, double weight) {
	this.height = height;
	this.weight = weight;
    }

    @Override
    public double square() {
	return height * weight;
    }

    public static class Builder implements ShapeBuilder {

	private double height;
	private double weight;

	Builder() {
	}

	@Override
	public Rectangle build() {
	    return new Rectangle(this.height, this.weight);
	}

	public Builder setHeight(double height) {
	    this.height = height;
	    return this;
	}

	public Builder setWeight(double weight) {
	    this.weight = weight;
	    return this;
	}
    }
}
