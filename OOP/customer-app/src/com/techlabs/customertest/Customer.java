package com.techlabs.customertest;

public class Customer {

	private String firstName;
	private String lastName;
	private int id;
	private static int nextId;
	

	static {
		System.out.println("static block");
		nextId = 1000;
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setId();
		System.out.println("constructor");
	}

	public void setId() {
		this.id = this.id + nextId;
		nextId++;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

}
