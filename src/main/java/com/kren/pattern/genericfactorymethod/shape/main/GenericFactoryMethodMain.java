package com.kren.pattern.genericfactorymethod.shape.main;

import com.kren.pattern.genericfactorymethod.shape.Circle;
import com.kren.pattern.genericfactorymethod.shape.Rectangle;
import com.kren.pattern.genericfactorymethod.shape.Shape;
import com.kren.pattern.genericfactorymethod.shape.Triangle;

public class GenericFactoryMethodMain {

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
