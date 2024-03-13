package com.tnsif.dayfourteen;

public class AccountDemo {

	public static void main(String[] args) {
		Account acc=new Account(10, "Amit",50000);
		System.out.println(acc);
		try {
		
		acc.deposit(12000);
		System.out.println(acc);
		System.out.println("---------------------------");
		AccountThread threadOne=new AccountThread();
		AccountThread threadTwo=new AccountThread();
		threadOne.setAccount(acc);
		threadTwo.setAccount(acc);
		threadOne.setAmount(20000);
		threadTwo.setAmount(50000);
		threadOne.start();
		threadTwo.start();
			threadOne.join();
		
		threadTwo.join();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------------------");
		System.out.println(acc);
	}
	

}
