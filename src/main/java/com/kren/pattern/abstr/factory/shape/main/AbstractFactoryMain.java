package com.kren.pattern.abstr.factory.shape.main;

import com.kren.pattern.abstr.factory.shape.Shape;
import com.kren.pattern.abstr.factory.shape.ShapeFactory;
import com.kren.pattern.abstr.factory.shape.ShapeFactory.Kind;

public class AbstractFactoryMain {

    public static void main(String[] args) {
	Shape shape = ShapeFactory.newShape(Kind.TRINAGLE)
	                          .setHeight(5)
	                          .setWeight(10)
	                          .build();

	shape.show();
	System.out.println("shape.square() " + shape.square());

	shape = ShapeFactory.newShape(Kind.CIRCLE)
	                    .setRadius(5)
	                    .build();

	shape.show();
	System.out.println("shape.square() " + shape.square());

	shape = ShapeFactory.newShape(Kind.RECTANGLE)
	                    .setHeight(55)
	                    .setWeight(10)
	                    .build();

	shape.show();
	System.out.println("shape.square() " + shape.square());

	// throw BadSizeDefinitionExeption
	shape = ShapeFactory.newShape(Kind.CIRCLE)
	                    .setHeight(55)
	                    .setWeight(10)
	                    .build();

    }

}
