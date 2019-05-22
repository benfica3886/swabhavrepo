package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		 Circle circ = new Circle();
		 circ.setRadius(8);
		 circ.setFillColour("blue");
		 float ans = new Circle().calculateArea();
		 System.out.println(ans);
		 //printAll(new Circle());
		 //printAll(circ);
		 printAll(new Circle(4, "orange"));
		 
	}
	
	public static void printAll(Circle c) {
		 System.out.println("Radius = "+c.getRadius());
		 System.out.println("Area of Circle="+ c.calculateArea());
		 System.out.println("Perimeter of Circle="+ c.perimeter());
		 System.out.println("Shape Colour = "+ c.getFillColour());
		}
}
 