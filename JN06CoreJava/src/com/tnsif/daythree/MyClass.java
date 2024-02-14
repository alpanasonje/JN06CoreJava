//Program to demonstrate access modifiers
package com.tnsif.daythree;

public class MyClass {
	private int privateNumber;
	protected int protectedNumber;
	public int publicNumber;
	int defaultNumber; //default / package specific
	
	public void display()
	{
		System.out.println("privateNumber = "+privateNumber);
		System.out.println("protectedNumber = "+protectedNumber);
		System.out.println("publicNumber = "+publicNumber);
		System.out.println("defaultNumber = "+defaultNumber);
	}	
}
