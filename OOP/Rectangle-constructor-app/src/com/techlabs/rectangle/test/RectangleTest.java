package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10);
		System.out.println(r1.calculateArea());
		System.out.println(r1.getheight());
		System.out.println(r1.getwidth());

		Rectangle r2 = new Rectangle(10, 20);
		System.out.println(r2.calculateArea());
		System.out.println(r2.getwidth());
		System.out.println(r2.getheight());
		
		System.out.println("area of = "+ new Rectangle(10,50).calculateArea());
		
	}
	
	
}