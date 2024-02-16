package com.tnsif.daysix.single;

public class Derived extends Base{
	private int newNumber;
	public Derived() {
		//super(); //call parent class constructor
		System.out.println("Derived class Default Constructor");
	}
	public Derived(int newNumber) {
		super(newNumber); //call parent class parameterized constructor
		super.display();
		super.number=100;
		this.newNumber = newNumber;
		System.out.println("Derived class Paramterized Constructor");
		
	}
	
}
