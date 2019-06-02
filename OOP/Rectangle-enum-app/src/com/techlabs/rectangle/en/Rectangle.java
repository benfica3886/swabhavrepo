package com.techlabs.rectangle.en;

public class Rectangle {
	private int height;
	private int width;
	private ColourOption colour;

	public Rectangle(int height, int width, ColourOption colour) {
		this.height = height;
		this.width = width;
		this.colour = colour;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public ColourOption getColour() {
		return colour;
	}
	

}
