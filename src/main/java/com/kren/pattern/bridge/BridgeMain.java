package com.kren.pattern.bridge;

import com.kren.pattern.bridge.shape.Shape;
import com.kren.pattern.bridge.shape.color.GreenColor;
import com.kren.pattern.bridge.shape.color.RedColor;
import com.kren.pattern.bridge.shape.line.DotLine;

public class BridgeMain {

    public static void main(String[] args) {
        Shape shape = Shape.newInstance(new DotLine(), new RedColor(), Shape.Type.CIRCLE);
        shape.draw();

        shape = Shape.newInstance(new GreenColor(), Shape.Type.RECTANGLE);
        System.out.println();
        shape.draw();

        shape = Shape.newInstance(Shape.Type.TRIANGLE);
        System.out.println();
        shape.draw();
    }
}
