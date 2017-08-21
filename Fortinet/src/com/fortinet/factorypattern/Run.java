package com.fortinet.factorypattern;

public class Run {

	   public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //call draw method of Circle
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();

	      //call draw method of Rectangle
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      shape2.draw();

	      //call draw method of circle
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      shape3.draw();
	   }
	}
