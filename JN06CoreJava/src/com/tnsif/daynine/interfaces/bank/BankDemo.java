package com.tnsif.daynine.interfaces.bank;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount savingAcc=new SavingAccount(50000, 0.05);
		System.out.println("current balance : "+savingAcc.getBalance());
		savingAcc.deposit(12000);
		System.out.println("current balance : "+savingAcc.getBalance());
		savingAcc.withdraw(5000);
		System.out.println("current balance : "+savingAcc.getBalance());
		savingAcc.addInterest();
		System.out.println("current balance : "+savingAcc.getBalance());
		savingAcc.deposit(-12000);
		
		System.out.println("-----------------------------------------");
		CurrentAccount currentAcc=new CurrentAccount(100000, 5000);
		System.out.println("current balance : "+currentAcc.getBalance());
		currentAcc.withdraw(120000);
		System.out.println("current balance : "+currentAcc.getBalance());
		currentAcc.deposit(10000);
		System.out.println("current balance : "+currentAcc.getBalance());

	}

}
