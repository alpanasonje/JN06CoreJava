package com.tnsif.dayfourteen;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException()
	{
		super("Insufficient Balance in account");
	}
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
