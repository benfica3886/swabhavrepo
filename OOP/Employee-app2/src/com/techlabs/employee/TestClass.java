package com.techlabs.employee;

import com.techlabs.abstractemployee.Employee;

public class TestClass {
	public static void main(String[] args) {
		Employee e = new Manager(1000, 1001, "abc", 50, 40, 30);
		Employee e1 = new Tester(1000, 1002, "xyz", 30, 30); 
		Employee e2 = new Developer(1000,1003,"qwrt",40,30);
		printInfo(e);
		printInfo(e1);
		printInfo(e2);
	}
	
	public static void printInfo(Employee e) {
		System.out.println("NAME ="+ e.getEmployeeName());
		System.out.println("ID ="+ e.getId());
		System.out.println("BASIC SALARY ="+ e.getBasicSalary());
		System.out.println("TOTAL SALARY ="+e.calculateSalary()+"\n");
	}
	
}
