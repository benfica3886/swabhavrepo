package com.techlabs.account;

import com.techlabs.customexception.InsufficientFundsException;

public class CurrentAccount extends Account {

	public CurrentAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdrawamount) throws InsufficientFundsException {
		if(withdrawamount > balance)
		{
		if (this.balance - withdrawamount > -2000  ) {
			this.balance = this.balance - withdrawamount;
		}
		else
			throw new InsufficientFundsException(getName(), getAccount(), getBalance(), "Insufficient Fund");
		}	
		else {
			this.balance = this.balance - withdrawamount;
		}

	}

}
