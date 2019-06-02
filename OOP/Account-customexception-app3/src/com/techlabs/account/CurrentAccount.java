package com.techlabs.account;

import com.techlabs.customexception.InsufficientFundsException;

public class CurrentAccount extends Account {

	public CurrentAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdrawamount) {
		try {
			if (withdrawamount > balance) {
				if (this.balance - withdrawamount > -2000) {
					this.balance = this.balance - withdrawamount;
				} else
					throw new InsufficientFundsException("Insufficient Funds in Current Account");
			} else {
				this.balance = this.balance - withdrawamount;
			}
		}

		catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Name:"+getName());
			System.out.println("Account Number:"+ getAccount());
			System.out.println("Account Balance :"+getBalance());
		}
	}

}
