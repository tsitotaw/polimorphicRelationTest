package com.tamirat.polimorphic;

public class PolimorphicTest {

	public static void main(String[] args) {
		
		System.out.println("Hello Polymorphics!!!");
		
		Person person1 = new Person("Tamirat", 30);
		
		System.out.println(person1.getName());
		
		Employee employee1 = new Employee(1, "Baba", 2);
		
		System.out.println(employee1.getName());
		
		/**
		 * a subtype is a special type of a super type
		 * which means, every subtype is always a type of super type but not other wise
		 * in our case every employee can be treated as a Person but not the other way around. 
		 * 
		 * -- Here it is the variable declaration what really matters, assignment can be anything - what does it mean?
		 * Person p; // this is a variable declaration - a variable p of type Person. So we are expected to initialize it with data in many different ways
		 * p = null; // this is a valid assignment
		 * p = new Person(...); // this initializes p with a person Object.
		 * p = new Object(...); // this though is wrong, because eventhough p is always an object, Object is not a subtype
		 * p = new Employee(...); // this will be possible as Person can Carry Employee :( employee is a subtype
		 */
		Person person2 = new Employee(2, "Eyu", 26);
		
		System.out.println(person2.getName());
		System.out.println();

	}

}
