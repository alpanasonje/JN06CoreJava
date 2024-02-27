package com.tnsif.daynine.interfaces.bank;

public class SavingAccount implements BankAccount {
	private double balance;
	private double interestRate;
	
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(double amount) {
		if(amount>0)
		{
			balance+=amount;
			System.out.println("balance updated...");
		}
		else
			System.out.println("invalid amount");
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && balance>amount)
		{
			balance-=amount;
			System.out.println(amount+" rs. withdrawn.....");
		}
		else
			System.out.println("Invalid amount");	
		
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	public void addInterest()
	{
		double interest;
		interest=balance*interestRate;
		balance+=interest;
		System.out.println(interest+" interest added ");
		
	}

}
