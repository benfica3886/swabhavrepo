package com.techlabs.exceptions;

public class CheckedException {
	public static void main(String[] args) {
		m1();
		
	
}
	
	public static void m1() {
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void m2() throws Exception  {
		m3();
	}
	
	public static void m3() throws Exception {
		throw new Exception("exception occured in m3");
	}
}
