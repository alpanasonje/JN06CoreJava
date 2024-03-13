package com.tnsif.dayfourteen;

public interface IBank {
	double MINIMUM_BALANCE=2000;
	void deposit(double amount);
	void withdraw(double amount) throws InsufficientFundsException ;
}
