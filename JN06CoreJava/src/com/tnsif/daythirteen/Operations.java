package com.tnsif.daythirteen;

public class Operations {
	
		public static void checkOddEven(int number)
		{
			if (number%2==0)
				System.out.println(Thread.currentThread().getName()+"......."+number +" is Even Number ");
			else
				System.out.println(Thread.currentThread().getName()+"......."+number +" is Odd Number ");
		}
		public static void displayFactorial(int number)
		{
			int f=1;
			for(int i=1;i<=number;i++)
				f=f*i;
			System.out.println(Thread.currentThread().getName()+"......Factorial of "+number +" is "+f);	
		
		}
	}

