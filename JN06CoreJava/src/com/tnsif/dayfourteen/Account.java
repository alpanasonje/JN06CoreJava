package com.tnsif.dayfourteen;

public class Account implements IBank {
	private int accNo;
	private String name;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {

		balance += amount;
	}

	@Override
	//public synchronized void withdraw(double amount) throws InsufficientFundsException {
	public  void withdraw(double amount) throws InsufficientFundsException {
		if (amount<=balance-IBank.MINIMUM_BALANCE)
		{
			balance -= amount;
			System.out.println(amount+" withdraw sucessfully....");
		}
		else
			//System.out.println("Insufficient balance, cann't withdraw....");
			throw new InsufficientFundsException("Insufficient balance, cann't withdraw....");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
