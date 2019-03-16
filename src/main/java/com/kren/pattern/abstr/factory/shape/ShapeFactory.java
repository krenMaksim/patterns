package com.kren.pattern.abstr.factory.shape;

import java.util.function.Supplier;

import com.kren.pattern.abstr.factory.shape.Circle.CircleBuilder;
import com.kren.pattern.abstr.factory.shape.Rectangle.RectangleBuilder;
import com.kren.pattern.abstr.factory.shape.Shape.ShapeBuilder;
import com.kren.pattern.abstr.factory.shape.Triangle.TriangleBuilder;

public class ShapeFactory {

    public static ShapeBuilder newShape(Kind kindShape) {
	return kindShape.newBuilderInstance();
    }

    public static enum Kind {
	TRINAGLE(() -> new TriangleBuilder()),

	CIRCLE(() -> new CircleBuilder()),

	RECTANGLE(() -> new RectangleBuilder());

	private Supplier<ShapeBuilder> builder;

	private Kind(Supplier<ShapeBuilder> shapeSize) {
	    this.builder = shapeSize;
	}

	ShapeBuilder newBuilderInstance() {
	    return builder.get();
	}
    }
}
