package com.techlabs.rectangle;

public class Rectangle {

	private int width;
	private int height;
	
	public  Rectangle(int newwidth, int newheight ) {
	   width= newwidth;
	   height = newheight;
	}
	
	public Rectangle(int newwidth) {
		width= newwidth;
		height = newwidth;
	}
	
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	
	public int calculateArea() {
		return (height*width);
	}
	
}
