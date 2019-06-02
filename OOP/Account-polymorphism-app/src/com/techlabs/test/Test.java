package com.techlabs.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingsAccount;

public class Test {
	public static void main(String[] args) {
		Account a1 = new SavingsAccount(3,"abc",600);
		Account a2 = new CurrentAccount(1,"xyz",200);
		a1.deposit(1000);
		//System.out.println(a1.getBalance());
		//a1.withdraw(1800);
		//printInfo(a1);
		a2.deposit(2000);
		//System.out.println(a2.getBalance());
		a2.withdraw(4300);
		printInfo(a2);
		
	}
	
	public static void printInfo( Account a) {
		System.out.println("Name: "+ a.getName()+"\n"+"Account: "+ a.getAccount()+"\n"+ "Balance: "+ a.getBalance());
	
	}
}
