package com.kren.pattern.kata.v1.bridge;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

class BridgeMain {

    public static void main(String[] args) {
        // TODO read about this pattern in HeardFirst book
        // Shapes differentiated by color, type etc.

        var red = new Color("RED");
        var blue = new Color("BLUE");
        var green = new Color("GREEN");

        var sh1 = new Shape(red, Type.RECTANGLE);
        var sh2 = new Shape(blue, Type.RECTANGLE);
        var sh3 = new Shape(green, Type.CIRCLE);
        var sh4 = new Shape(red, Type.TRIANGLE);

        List.of(sh1, sh2, sh3, sh4)
            .forEach(System.out::println);
    }

    @Getter
    @ToString
    @RequiredArgsConstructor
    private static class Shape {

        private final Color color;
        private final Type type;
    }

    @Getter
    @ToString
    @RequiredArgsConstructor
    private static class Color {

        private final String name;
    }

    private static enum Type {

        RECTANGLE, TRIANGLE, CIRCLE;
    }
}
