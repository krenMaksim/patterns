package com.kren.pattern.factorymethod.shape.main;

import com.kren.pattern.factorymethod.shape.Shape;
import com.kren.pattern.factorymethod.shape.ShapeFactory;
import com.kren.pattern.factorymethod.shape.ShapeFactory.Kind;

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
