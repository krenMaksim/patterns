package com.kren.pattern.state.prototype;

public class Rectangle extends Shape {

	private final int width;
	private final int height;

	public Rectangle() {
		height = 0;
		width = 0;
	}

	public Rectangle(int x, int y, String color, int width, int height) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	private Rectangle(Rectangle r) {
		super(r);
		width = r.width;
		height = r.height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
}