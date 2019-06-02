package com.techlabs.account;

import com.techlabs.customexception.InsufficientFundsException;

public class SavingsAccount extends Account {

	public SavingsAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdraw) throws InsufficientFundsException {
		if (this.balance - withdraw > 500) {
			this.balance = this.balance - withdraw;
		} else {
			throw new InsufficientFundsException(getName(), getAccount(), getBalance(), "Insufficient Funds");
			
		}
	}
}
