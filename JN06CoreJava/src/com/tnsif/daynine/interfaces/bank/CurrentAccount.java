package com.tnsif.daynine.interfaces.bank;

public class CurrentAccount implements BankAccount {
	private double balance;
	private double overdraftLimit;

	public CurrentAccount(double balance, double overdraftLimit) {
		super();
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("balance updated...");
		} else
			System.out.println("invalid amount");

	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && (balance + overdraftLimit) > amount) {
			balance -= amount;
			System.out.println(amount + " rs. withdrawn.....");
		} else
			System.out.println("Invalid amount");

	}

	@Override
	public double getBalance() {

		return balance;
	}

}
