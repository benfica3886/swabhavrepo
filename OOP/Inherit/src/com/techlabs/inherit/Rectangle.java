package com.techlabs.inherit;

public class Rectangle {

	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int calculateArea() {
		return (getHeight() * getWidth());
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
