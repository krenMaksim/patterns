package com.kren.pattern.bridge.kata.v1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

class BridgeMain {

    public static void main(String[] args) {
        // TODO read about this pattern in HeardFirst book
        // Shapes differentiated by color, type etc.
    }

    @Getter
    @RequiredArgsConstructor
    private static class Shape {

        private final Color color;
        private final Type type;
    }

    @Getter
    @RequiredArgsConstructor
    private static class Color {

        private final String name;
    }

    private static enum Type {

        RECTANGLE, TRIANGLE, CIRCLE;
    }
}
