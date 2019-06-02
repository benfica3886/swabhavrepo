package com.techlabs.customexception;

public class CustomException  extends Exception{

	public CustomException(String string){
		super(string);
		System.out.println(string);
	}
}

