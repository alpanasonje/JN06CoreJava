package com.tnsif.daysix.single;

public class Base {
	protected int number;
	public Base() {
		System.out.println("Base class Default Constructor");
	}
	public Base(int number) {
		this.number = number;
		System.out.println("Base class Parameterized Constructor");
	}	
	public void display() {
		System.out.println("Number : "+number);

	}
}
