package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.setHeight(102);
		smallRectangle.setWidth(-5);
		Print(smallRectangle);

		Rectangle bigRectangle = new Rectangle();
		bigRectangle.setHeight(-1);
		bigRectangle.setWidth(109);
		Print(bigRectangle);

	}

	public static void Print(Rectangle r) {
		System.out.println("height =" + r.getHeight());
		System.out.println("width=" + r.getWidth());
		System.out.println("Area=" + r.calculateArea());
		System.out.println(" ");
	}

}
