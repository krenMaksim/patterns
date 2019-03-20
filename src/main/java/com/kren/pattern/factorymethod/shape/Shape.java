package com.kren.pattern.factorymethod.shape;

public abstract class Shape {

    Shape() {
    }

    public void show() {
	System.out.println(this.getClass()
	                       .getName());
    }

    abstract public double square();

    public static abstract class ShapeBuilder {

	double height;
	double weight;
	double radius;

	ShapeBuilder() {
	}

	abstract public Shape build();

	public ShapeBuilder setHeight(double height) {
	    throw new BadSizeDefinitionExeption();
	}

	public ShapeBuilder setWeight(double weight) {
	    throw new BadSizeDefinitionExeption();
	}

	public ShapeBuilder setRadius(double radius) {
	    throw new BadSizeDefinitionExeption();
	}

	static class BadSizeDefinitionExeption extends UnsupportedOperationException {
	    private static final long serialVersionUID = 1L;

	    public BadSizeDefinitionExeption() {
		super("This size is not permissible for this shape!");
	    }
	}
    }
}
