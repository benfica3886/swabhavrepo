package com.techlabs.thiskeyword;

public class ThisKeyword {
	String name = "naaaaaaame";

	public ThisKeyword() {
		this("Thiskeyword");
		name = "benfica";
	}

	public ThisKeyword(String newname) {
		name = newname;
		System.out.println("second constructor");
	}

	public void printInfo() {
		String name = "xyz";
		System.out.println("Local variable=" + name);
		System.out.println("global variable=" + this.name);
		this.PrintInfo2();
	}

	public void PrintInfo2() {
		System.out.println("second method");
 	}
}
