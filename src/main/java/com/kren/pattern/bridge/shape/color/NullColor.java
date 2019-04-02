package com.kren.pattern.bridge.shape.color;

public class NullColor extends Color {
    private static final NullColor nullColor = new NullColor();

    public static NullColor newInstance() {
        return nullColor;
    }

    private NullColor() {}

}
