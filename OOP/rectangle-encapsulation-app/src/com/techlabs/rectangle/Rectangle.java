package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;

	public void setHeight(int heightnew) {
		int positive = set(heightnew);
		height = positive;
	}

	public void setWidth(int widthnew) {
		int positive = set(widthnew);
		width = positive;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int calculateArea() {
		int area = height * width;
		return area;
	}

	private int set(int value) {
		if (value >= 1 && value <= 100) {
			return value;
		} else if (value < 1) {
			return 1;
		} else
			return 100;

	}
}
