package com.techlabs.overloading;

public class OverloadingTest {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(12.3f);
		System.out.println(true);
		System.out.print(123.12);
		System.out.print(12);

		printThis("hello");
		printThis(12.3f);
		printThis(true);
		printThis(123.12);
		printThis(12);
			
	}

	private static void printThis(String txt) {
		System.out.println(txt);
		System.out.println("Overload no 1");
	}

	private static void printThis(float x) {
		System.out.println(x);
		System.out.println("Overload no 2");
	}

	private static void printThis(boolean y) {
		System.out.println(y);
		System.out.print("Overload no 3");
	}

	private static void printThis(double z) {
		System.out.println(z);
		System.out.println("Overload no 4");
	}

	private static void printThis(int a) {
		System.out.println(a);
		System.out.println("Overload no 5");
	}
}
