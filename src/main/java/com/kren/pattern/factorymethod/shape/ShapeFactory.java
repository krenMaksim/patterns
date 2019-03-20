package com.kren.pattern.factorymethod.shape;

import com.kren.pattern.factorymethod.shape.Circle.CircleBuilder;
import com.kren.pattern.factorymethod.shape.Rectangle.RectangleBuilder;
import com.kren.pattern.factorymethod.shape.Shape.ShapeBuilder;
import com.kren.pattern.factorymethod.shape.Triangle.TriangleBuilder;

import java.util.function.Supplier;

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
