package com.kren.pattern.factory.method.shape;

import com.kren.pattern.factory.method.shape.Circle.CircleBuilder;
import com.kren.pattern.factory.method.shape.Rectangle.RectangleBuilder;
import com.kren.pattern.factory.method.shape.Shape.ShapeBuilder;
import com.kren.pattern.factory.method.shape.Triangle.TriangleBuilder;

import java.util.function.Supplier;

class ShapeFactory {

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
