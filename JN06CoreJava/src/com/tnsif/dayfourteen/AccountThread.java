package com.tnsif.dayfourteen;

public class AccountThread extends Thread {
	private Account account;
	private double amount;

	public AccountThread() {
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public AccountThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	public void run()
	{
		synchronized (account) {
			try {
			account.withdraw(amount);
		} catch (InsufficientFundsException e) {
		
			System.out.println(e.getMessage());
		}
		}
	}
}
