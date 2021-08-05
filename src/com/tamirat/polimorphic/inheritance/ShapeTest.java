package com.tamirat.polimorphic.inheritance;


/***
 * multiple implmentation details from a single object is called polymorphism
 * @author tfisseha
 *
 */
public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("Welcome Shapes");
		
		Shape s1 = new Shape();
		s1.area();
		
		Shape s2 = new Triangle();
		s2.area();
		
		Shape s3 = new Rectangle();
		s3.area();
		
		Shape s4 = new Circle();
		s4.area();		

	}

}
