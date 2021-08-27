package com.kren.pattern.factory.method.generic.shape;

public class FactoryMethodMain {

    public static void main(String[] args) {
        Shape shape = Shape.defineBuilder(Circle.Builder.class)
                           .setRadius(5)
                           .build();

        shape.show();
        System.out.println("shape.square() " + shape.square());

        shape = Shape.defineBuilder(Rectangle.Builder.class)
                     .setHeight(55)
                     .setWeight(10)
                     .build();

        shape.show();
        System.out.println("shape.square() " + shape.square());

        shape = Shape.defineBuilder(Triangle.Builder.class)
                     .setHeight(55)
                     .setWeight(10)
                     .build();

        shape.show();
        System.out.println("shape.square() " + shape.square());
    }
}
