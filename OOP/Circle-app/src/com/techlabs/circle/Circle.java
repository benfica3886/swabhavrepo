package com.techlabs.circle;

public class Circle {
	private int radius;
	final float pi = 3.14f;
	private String fillColour;

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
		if (colour == "Blue" || colour == "Green") {
			fillColour = colour;
		} else {

			fillColour = "Red";
		}
	}

	public String getFillColour() {
		return fillColour;
	}

	public float calculateArea() {
		float area = radius * radius * pi;
		return area;
	}

	public float perimeter() {
		float perimeter = 2 * pi * radius;
		return perimeter;
	}

}
