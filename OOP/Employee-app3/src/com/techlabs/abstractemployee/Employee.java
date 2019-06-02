package com.techlabs.abstractemployee;

public abstract class Employee {
private double basicSalary;
private int Id;
private String employeeName;


public Employee(double basicSalary, int Id, String employeeName) {
	this.basicSalary = basicSalary;
	this.Id=Id;
	this.employeeName = employeeName;
	
}

public String toString() {
	return ("Name =" + getemployeeName() + "Salary ="+ getbasicSalary() + "Id =" + getId());
	
}


public abstract void calculateSalary();

public int getId() {
	return Id;
}

public double getbasicSalary() {
	return basicSalary;
}

public String getemployeeName() {
	return employeeName;
}

}



