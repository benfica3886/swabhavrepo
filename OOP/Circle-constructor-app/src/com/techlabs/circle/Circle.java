package com.techlabs.circle;

public class Circle {
	private int radius;
	private final float PI = 3.14f;
	private String fillColour;

	public Circle(int newradius , String newfillColour) {
		radius = newradius;
		fillColour=newfillColour;
		System.out.println("constructor circle");
	}

	public Circle() {
		System.out.println("Object created");
	}
	
	public void setRadius(int num) {
		if (num > 0 && num <= 100) {
			radius = num;
		} else if (num < 0) {
			radius = 1;
		} else
			radius = 100;
	}

	public int getRadius() {
		return radius;
	}

	public void setFillColour(String colour) {
		if (colour.equalsIgnoreCase("Blue")  || colour.equalsIgnoreCase("Green")) {
			fillColour = colour;
		} else {

			fillColour = "Red";
		}
	}

	public String getFillColour() {
		return fillColour;
	}

	public float calculateArea() {
		float area = radius * radius * PI;
		return area;
	}

	public float perimeter() {
		float perimeter = 2 * PI* radius;
		return perimeter;
	}

}
