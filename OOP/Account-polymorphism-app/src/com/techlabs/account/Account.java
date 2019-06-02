package com.techlabs.account;

public abstract class Account {
	private int account;
	private String name;
	protected double balance;
	
	public Account(int account, String name, double balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		this.balance = this.balance+ deposit;
	}
	
	public abstract void withdraw(int withdraw);
	
	public int getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public  void cannotWithdraw() {
		System.out.println("Cannot Withdraw");
	}
	
	
	}
