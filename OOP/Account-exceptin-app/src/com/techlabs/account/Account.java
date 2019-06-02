package com.techlabs.account;

public class Account {
	double balance;
	
	
	
	public double withdraw(int withdraw) throws Exception{
		if(balance <= 0) {
			throw new RuntimeException("Balance low");
		}
		else
		return (balance-withdraw);
	}
	
}
