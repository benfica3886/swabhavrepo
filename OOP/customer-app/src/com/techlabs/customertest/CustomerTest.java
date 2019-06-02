package com.techlabs.customertest;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer("A", "B");
		printInfo(c);
		Customer c1 = new Customer("C", "D");
		Customer c2 = new Customer("E", "F");
		printInfo(c);
		printInfo(c1);
		printInfo(c);
		printInfo(c1);
		printInfo(c2);
		
	}
	
	public static void printInfo(Customer c) {
		System.out.println("Name="+c.getfirstName()+ c.getlastName());
		System.out.println("ID="+ c.getId());
	}
}
