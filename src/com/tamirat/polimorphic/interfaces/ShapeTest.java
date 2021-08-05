package com.tamirat.polimorphic.interfaces;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("Hello Interfaces");
		
		IShape shape1 = new Rectangle();
		shape1.area();
		
		IShape shape2 = new Triangle();
		shape2.area();
		
		IShape shape3 = new Circle();
		shape3.area();		

	}

}
