package com.techlabs.account;

public class Account {
	private int accountNummber;
	private String name;
	private double balance;
	private static int numOfAccount;

	public Account(int account, String name, double balance) {
		this.accountNummber = account;
		this.name = name;
		this.balance = balance;
		Account.numOfAccount++;
	}

	public Account(int account, String name) {
		this(account, name, 500);
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) {
		if (this.balance - amount >= 500) {
			this.balance = this.balance - amount;
		} else
			System.out.println("CANNOT WITHDRAW");
	}

	public int getAccount() {
		return accountNummber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getnumOfAccount() {
		return numOfAccount;
	}

	public static int getHeadCount() {

		return numOfAccount;
	}

	@Override
	public String toString() {
		String a =super.toString();
		return a+ "name " + this.name + " " + "accountNumber " + this.accountNummber + " " + "balance " + this.balance;

	}



	@Override
	public boolean equals(Object obj) {
		Account other = (Account) obj;
		if(this.name == other.name) {
					return true;
		} 
		else {
			return false;
		}
	}
	

	}


