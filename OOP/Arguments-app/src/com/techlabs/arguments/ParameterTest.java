package com.techlabs.arguments;

public class ParameterTest {

	public static void main(String[] args) {
		int mark = 100;
		setMarkZero(mark);
		System.out.println(mark);
		int[] marks = { 10, 20, 30 };
		setMarksToZero(marks);
		for (int item : marks) {
			System.out.println(item);
		}
	}

	private static void setMarkZero(int newmark) {
		newmark = 0;
	}

	private static void setMarksToZero(int[] newMarks) {
		for (int i = 0; i < newMarks.length; i++) {
			newMarks[i] = 0;
		}
	}
}
