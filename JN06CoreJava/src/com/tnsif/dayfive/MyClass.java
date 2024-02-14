package com.tnsif.dayfive;

public class MyClass {
	static int no;
	int number;
	static
	{
		no=100;
	}
	
	public MyClass()
	{
		no++;
		number++;
	}
	
	public static void display()
	{
		System.out.println("Static no within static method = "+no);
	//	System.out.println("Non static number = "+number);
	}
	
	void show()
	{
		System.out.println("Static no = "+no);
		System.out.println("Non static number = "+number);
	}
}
