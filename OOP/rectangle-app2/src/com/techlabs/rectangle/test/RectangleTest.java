package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		//int areaSmall;
		Rectangle smallRectangle = new Rectangle();
		smallRectangle.height = 10;
		smallRectangle.width = 5;
		//areaSmall = smallRectangle.calculateArea();
		Print(smallRectangle);
		// System.out.println("Area=" + areaSmall);
		// System.out.println("heigh=" + smallRectangle.height);
		// System.out.println("width=" + smallRectangle.width);
		// System.out.println(" ");

		// int areaBig;
		Rectangle bigRectangle = new Rectangle();
		bigRectangle.height = 100;
		bigRectangle.width = 50;
		Print(bigRectangle);
		// areaBig = bigRectangle.calculateArea();
		// System.out.println("Area=" + areaBig);
		// System.out.println("heigh=" + bigRectangle.height);
		// System.out.println("width=" + bigRectangle.width);

		// Rectangle temp = bigRectangle;
		// temp.width=20;
		// temp=null;
		// System.out.println(bigRectangle.width);
		// System.out.println(temp.width);

	}

	public static void Print(Rectangle r) {
		System.out.println("height =" + r.height);
		System.out.println("width=" + r.width);
		System.out.println("Area=" + r.calculateArea());
		System.out.println(" ");
	}

}
