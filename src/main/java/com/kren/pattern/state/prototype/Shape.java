package com.kren.pattern.state.prototype;

public abstract class Shape {

	private final int x;
	private final int y;
	private final String color;

	Shape() {
		this(0, 0, null);
	}

	Shape(Shape s) {
		this(s.x, s.y, s.color);
	}

	Shape(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public abstract Shape clone();
}
