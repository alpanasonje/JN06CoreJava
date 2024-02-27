package com.tnsif.daynine.interfaces.bank;

public interface BankAccount {
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}
