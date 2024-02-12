//Program to define class Person
package com.tnsif.daythree;

import java.util.Scanner;

public class Person {
	int age;
	String name;
	String gender;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age and gender ");
		name=sc.next();
		age=sc.nextInt();
		gender=sc.next();
	}
	void display()
	{
		System.out.println("Name : "+name+"\tAge : "+age+"\tGender : "+gender);
	}
}
