package com.kren.pattern.bridge.shape.line;

public class NullLine extends Line {
    private static final NullLine nullLine = new NullLine();

    public static NullLine newInstance() {
        return nullLine;
    }

    private NullLine() {}

}
