package com.techlabs.exceptions;

public class UncheckedException {
	public static void main(String[] args) {
		m1();
		System.out.println("END");
		
		
	}
	
	public static void m1() {
		System.out.println("Inside m1");
		m2();
	}
	
	public static void m2() {
		System.out.println("Inside m2");
		m3();
	}
	
	public static void m3() {
		throw new RuntimeException();
		System.out.println("inside m3");
	}
}

