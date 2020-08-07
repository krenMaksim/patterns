package com.kren.pattern.state.prototype;

public class Circle extends Shape {

	private final int radius;

	public Circle() {
		radius = 0;
	}

	public Circle(int x, int y, String color, int radius) {
		super(x, y, color);
		this.radius = radius;
	}

	private Circle(Circle c) {
		super(c);
		radius = c.radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}
}