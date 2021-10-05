package com.kren.pattern.kata.v1.flyweight;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
class Circle {

    private final int x;
    private final int y;

    private final String color;

    public void draw() {
        System.out.println(String.format("x = %d, y = %d, color = %s", x, y, getColor()));
    }
}
