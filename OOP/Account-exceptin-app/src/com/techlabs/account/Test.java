package com.techlabs.account;

public class Test {
	public static void main(String[] args) {
		Account acc = new Account();
		try {
			System.out.println(acc.withdraw(100));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
