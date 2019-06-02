package com.techlabs.exceptions;

public class TestBug {
	public static void main(String[] args) {
		case1(args);
		//case2();
		//case3();
		
	}

	private static void case3() {
		String str = null;
		int a = str.length();
		System.out.println(a);
		System.out.println("END");
	}

	private static void case2() {
		int a= 2;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		System.out.println("END");
	}

	private static void case1(String[] args) {
		int a = Integer.parseInt(args[0]);
 
		int c = a/b;
		System.out.println("result="+c);
		System.out.println("End");
	}
}
