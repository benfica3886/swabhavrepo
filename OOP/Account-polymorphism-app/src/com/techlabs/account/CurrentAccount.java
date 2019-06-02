package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdrawamount) {
		if(withdrawamount > balance)
		{
		if (this.balance - withdrawamount > -2000  ) {
			this.balance = this.balance - withdrawamount;
		}
		else
			cannotWithdraw();
		}	
		else {
			this.balance = this.balance - withdrawamount;
		}

	}

}
