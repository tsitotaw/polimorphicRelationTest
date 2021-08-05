package com.tamirat.polimorphic;

public class Employee extends Person{
	
	private int employeeId;
	
	public Employee(int empId, String name, int age) {
		super(name, age);
		this.employeeId = empId;
	}
	
	public int getId() {
		return this.employeeId;
	}
	

}
