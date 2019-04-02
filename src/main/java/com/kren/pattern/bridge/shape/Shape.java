package com.kren.pattern.bridge.shape;

import com.kren.pattern.bridge.shape.color.Color;
import com.kren.pattern.bridge.shape.color.NullColor;
import com.kren.pattern.bridge.shape.line.Line;
import com.kren.pattern.bridge.shape.line.NullLine;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Shape {

    private static final Color nullColor = NullColor.newInstance();
    private static final Line nullLine = NullLine.newInstance();

    public static <T extends Shape> Shape newInstance(Shape.Type shapeType) {
        return newInstance(nullLine, nullColor, shapeType);
    }

    public static <T extends Shape> Shape newInstance(Line line, Shape.Type shapeType) {
        return newInstance(line, nullColor, shapeType);
    }

    public static <T extends Shape> Shape newInstance(Color color, Shape.Type shapeType) {
        return newInstance(nullLine, color, shapeType);
    }

    public static <T extends Shape> Shape newInstance(Line line, Color color, Shape.Type shapeType) {
        Objects.requireNonNull(line);
        Objects.requireNonNull(color);
        Objects.requireNonNull(shapeType);

        try {
            return shapeType.getShapeClass()
                            .getDeclaredConstructor(Line.class, Color.class)
                            .newInstance(line, color);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }


    private final Line line;
    private final Color color;

    Shape(Line line, Color color) {
        this.line = line;
        this.color = color;
    }

    public void draw() {
        String shape = this.getClass()
                           .getName();

        String color = null;
        String line = null;

        if (this.line != nullLine) {
            line = this.line.getClass()
                            .getName();
        }

        if (this.color != nullColor) {
            color = this.color.getClass()
                              .getName();
        }

        System.out.println(Stream.of(shape, color, line)
                                 .filter(str -> Objects.nonNull(str))
                                 .collect(Collectors.joining("\n")));
    }

    public static enum Type {
        CIRCLE(Circle.class),

        RECTANGLE(Rectangle.class),

        TRIANGLE(Triangle.class);

        private Class<? extends Shape> shapeClass;

        private Type(Class<? extends Shape> shapeClass) {
            this.shapeClass = shapeClass;
        }

        Class<? extends Shape> getShapeClass() {
            return this.shapeClass;
        }
    }
}
