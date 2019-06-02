package com.techlabs.account;

public class SavingsAccount extends Account {

	public SavingsAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdraw) {
		if (this.balance - withdraw > 500) {
			// System.out.println("Balance="+ this.balance);
			this.balance = this.balance - withdraw;
		} else {
			cannotWithdraw();
		}

	}
}
