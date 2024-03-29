package com.kren.pattern.factory.method.generic.shape;

abstract class Shape {

    @SuppressWarnings("deprecation")
    public static <T> T defineBuilder(Class<T> builder) {
        try {
            return builder.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    Shape() {}

    public void show() {
        System.out.println(this.getClass().getName());
    }

    abstract public double square();

    static interface ShapeBuilder {
        public abstract Shape build();
    }
}
