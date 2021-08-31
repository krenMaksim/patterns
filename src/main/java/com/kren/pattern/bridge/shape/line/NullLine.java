package com.kren.pattern.bridge.shape.line;

import java.util.Objects;

public class NullLine extends Line {
    private static final NullLine nullLine = new NullLine();

    public static NullLine newInstance() {
        return nullLine;
    }

    private NullLine() {
        if (Objects.nonNull(nullLine)) throw new AssertionError();
    }

}
