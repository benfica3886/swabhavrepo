package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		 Circle circ = new Circle();
		 circ.setRadius(8);
		 circ.setFillColour("Yellow");
		 printAll(circ);
	}
	
	public static void printAll(Circle c) {
		 System.out.println("Radius = "+c.getRadius());
		 System.out.println("Area of Circle="+ c.calculateArea());
		 System.out.println("Perimeter of Circle="+ c.perimeter());
		 System.out.println("Shape Colour = "+ c.getFillColour());
		}
}
 