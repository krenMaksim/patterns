package com.kren.pattern.bridge.shape.color;

import java.util.Objects;

public class NullColor extends Color {
    private static final NullColor nullColor = new NullColor();

    public static NullColor newInstance() {
        return nullColor;
    }

    private NullColor() {
        if (Objects.nonNull(nullColor)) throw new AssertionError();
    }

}
