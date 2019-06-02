package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		//case1();
		//case2();
		Account acc1 = new Account(101,"ABC",500);
		System.out.println(acc1);
		System.out.println(acc1.toString());
		//Account acc2 = acc1;
		Account acc2 = new Account(101,"ABC",500);
		System.out.println(acc1 == acc1);
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc1));
		System.out.println(acc2.equals(acc1));
	}
	
	

	private static void case2() {
		Account a = new Account(123, "benfica", 500);
		Account a1 = new Account(456,"aditi");
		printInfo(a);
		printInfo(a1);
	}

	private static void case1() {
		Account a = new Account(123, "benfica", 500);
		printInfo(a);
		a.deposit(200);
		printInfo(a);
		a.withdraw(500);
		printInfo(a);
		Account a1 = new Account(456,"aditi");
		printInfo(a1);
		a1.deposit(10);
		a1.withdraw(11);
		printInfo(a1);
	}
	
	public static void  printInfo(Account acc) {
		System.out.println("name="+acc.getName());
		System.out.println("balance="+acc.getBalance());
		System.out.println("Account="+acc.getAccount());
		System.out.println("Number Of Account="+ acc.getnumOfAccount());
		System.out.println("Headcount"+ acc.getHeadCount());
		System.out.println(" ");
	}
	
	
}
