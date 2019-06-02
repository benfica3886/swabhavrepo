package com.techlabs.customexception;

public class InsufficientFundsException extends Exception {
	
public InsufficientFundsException(String name, int accountNumber, double balance, String message){
	super(message);
		System.out.println("Name:"+name);
		System.out.println("Account Number:"+ accountNumber);
		System.out.println("current balance:"+ balance);
		System.out.println(super.getMessage());
}
}
