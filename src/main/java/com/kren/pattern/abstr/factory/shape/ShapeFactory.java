package com.kren.pattern.abstr.factory.shape;

import java.util.function.Supplier;

import com.kren.pattern.abstr.factory.shape.Circle.CircleSize;
import com.kren.pattern.abstr.factory.shape.Rectangle.RectangleSize;
import com.kren.pattern.abstr.factory.shape.Shape.Size;
import com.kren.pattern.abstr.factory.shape.Triangle.TriangleSize;

public class ShapeFactory {

    public static Size newShape(Kind kindShape) {
	return kindShape.getShapeSize();
    }

    public static enum Kind {
	TRINAGLE(() -> new TriangleSize()),

	CIRCLE(() -> new CircleSize()),

	RECTANGLE(() -> new RectangleSize());

	private Supplier<Size> shapeSize;

	private Kind(Supplier<Size> shapeSize) {
	    this.shapeSize = shapeSize;
	}

	Size getShapeSize() {
	    return shapeSize.get();
	}
    }
}
