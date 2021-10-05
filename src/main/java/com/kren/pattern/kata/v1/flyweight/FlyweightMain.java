package com.kren.pattern.kata.v1.flyweight;

class FlyweightMain {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                new CircleFlyweight(i, i / 5, "GREEN").draw();
            } else if ((i % 3 == 0)) {
                new CircleFlyweight(i, i * 3, "BLACK").draw();
            } else {
                new CircleFlyweight(i, i - 42, "RED").draw();
            }
        }
    }

}
