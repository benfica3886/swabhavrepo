package com.techlabs.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingsAccount;
import com.techlabs.customexception.InsufficientFundsException;

public class Test {
	public static void main(String[] args) throws InsufficientFundsException {
		Account a1 = new SavingsAccount(3,"abc",600);
		Account a2 = new CurrentAccount(1,"xyz",200);
		a1.deposit(1000);
		//a1.withdraw(10);
		//printInfo(a1);
		//printInfo(a1);
		//a2.deposit(2000);
		//System.out.println(a2.getBalance());
		a2.withdraw(7300);
		printInfo(a2);
		
	}
	
	public static void printInfo( Account a) {
		System.out.println("\n" + "Printing Detais..");
		System.out.println("Name: "+ a.getName()+"\n"+"Account: "+ a.getAccount()+"\n"+ "Balance: "+ a.getBalance());
	
	}
}
