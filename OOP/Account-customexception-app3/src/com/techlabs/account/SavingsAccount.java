package com.techlabs.account;

import com.techlabs.customexception.InsufficientFundsException;

public class SavingsAccount extends Account {

	public SavingsAccount(int account, String name, double balance) {
		super(account, name, balance);
	}

	@Override
	public void withdraw(int withdraw) throws InsufficientFundsException {
		try {
		if (this.balance - withdraw > 500) {
			this.balance = this.balance - withdraw;
		}
		else {
			throw new InsufficientFundsException("Insufficient Funds");
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Name:"+getName());
			System.out.println("Account Number:"+ getAccount());
			System.out.println("Account Balance :"+getBalance());
		}
		
		}
	}

