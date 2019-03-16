package com.kren.pattern.abstr.factory.shape;

public abstract class Shape {

    Shape() {
    }

    public void show() {
	System.out.println(this.getClass()
	                       .getName());
    }

    abstract public double square();

    public static abstract class Size {

	double height;
	double weight;
	double radius;

	Size() {
	}

	abstract public Shape build();

	public Size setHeight(double height) {
	    throw new BadSizeDefinitionExeption();
	}

	public Size setWeight(double weight) {
	    throw new BadSizeDefinitionExeption();
	}

	public Size setRadius(double radius) {
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
