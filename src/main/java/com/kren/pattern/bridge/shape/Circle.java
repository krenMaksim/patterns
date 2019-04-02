package com.kren.pattern.bridge.shape;

import com.kren.pattern.bridge.shape.color.Color;
import com.kren.pattern.bridge.shape.line.Line;

class Circle extends Shape {

    Circle(Line line, Color color) {
        super(line, color);
    }
}