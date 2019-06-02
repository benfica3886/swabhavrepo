package com.techlabs.inherit;

public class RectangleTest extends Rectangle {

	public RectangleTest(int height, int width) {
		super(height, width);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePerimeter() {
		return (2*(super.getHeight()+ super.getWidth()));
	}
	
	public static void main(String[] args) {
		RectangleTest r =new RectangleTest(10,20);
		System.out.println("Area="+r.calculateArea());
		System.out.println("Perimeter="+r.calculatePerimeter()  );
		}

}
