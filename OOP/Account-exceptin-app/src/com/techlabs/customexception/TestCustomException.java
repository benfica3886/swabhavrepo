package com.techlabs.customexception;

public class TestCustomException {
	public static void main(String[] args) {
		try {
			throw new CustomException("exception");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
