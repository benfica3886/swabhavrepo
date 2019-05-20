package com.techlabs.arguments;

public class ArgumentsTest {
	public static void main(String[] args) {
		System.out.println("No of names:"+args.length);
		if (args.length > 0) {
			for (String name : args) {
				System.out.println("name "+name);
			}
		
		}
		else {
			System.out.println("no input");
		}
	}
}

