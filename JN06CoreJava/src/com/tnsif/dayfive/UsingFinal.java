//Program to demonstrate final variable
package com.tnsif.dayfive;

public class UsingFinal {
	//defining and initializing constant 
	final int number=100;
	
	//defining and initializing static final field
	//final static int numberOne=500;
	
	//blank static final field must be initialize in static block
	final static int numberOne;
	static
	{
		numberOne=1250;
	}
	
	//blank final field must initialize in constructor
	final int numberTwo;
	
	public UsingFinal()
	{
		//this.numberOne = 200;
		this.numberTwo = 300;
		
	}
	public UsingFinal(int numberTwo)
	{
		//this.numberOne = 200;
		//cann't modify final field
		//number++;
		this.numberTwo = numberTwo;
	}
	
	//override toString() method of Object class
	@Override
	public String toString() {
		return "UsingFinal [number=" + number + ", numberOne=" + numberOne + ", numberTwo=" + numberTwo + "]";
	}
	
	
}
