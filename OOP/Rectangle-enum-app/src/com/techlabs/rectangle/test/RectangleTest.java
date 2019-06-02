package com.techlabs.rectangle.test;

import com.techlabs.rectangle.en.ColourOption;
import com.techlabs.rectangle.en.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20, ColourOption.BLUE);
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getColour());
	}

}
