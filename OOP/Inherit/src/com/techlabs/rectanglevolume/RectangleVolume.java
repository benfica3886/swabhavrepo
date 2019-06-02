package com.techlabs.rectanglevolume;

import com.techlabs.inherit.RectangleTest;

public class RectangleVolume extends RectangleTest {
	private int length;

	public RectangleVolume(int length, int height, int width) {
		super(height, width);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	// overiding method.
	public int calculateArea() {
		return ((getHeight() + 10)* (getWidth() + 10) );
	}

	public int calculateVolume() {
		return (length * getHeight() * getWidth());
	}

	public static void main(String[] args) {
		RectangleVolume r = new RectangleVolume(10, 20, 30);
		System.out.println("Calculate Volume=" + r.calculateVolume());
		System.out.println("Calculate Area=" + r.calculateArea());
		System.out.println("height=" + r.getHeight());
		System.out.println("width=" + r.getWidth());
	}

}
