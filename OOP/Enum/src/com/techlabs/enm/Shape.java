package com.techlabs.enm;

public class Shape {

	enum Select {
		RECTANGLE, SQUARE, TRIANGLE(10,20);
		private int height = 10;
		private int width = 10;

		private Select() {
			height = 100;
			width = 200;
			//System.out.println("constructor");
		}
		
		private Select(int h , int w) {
		height = h;
		width =  w;
		} 

		public int getheight() {
			return height;
		}

		public int getwidth() {
			return width;
		}
	}

	public static void main(String[] args) {

		for (Select s : Select.values()) {
			System.out.println(s.getheight());
			System.out.println(s.getwidth());

		}

	}
}
