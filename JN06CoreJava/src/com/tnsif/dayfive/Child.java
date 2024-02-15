package com.tnsif.dayfive;

public class Child extends UsingFinalMethod {
	//overridden normalMethod() from parent(UsingFinalMethod) class
	@Override
	public void normalMethod()
	{
		System.out.println("normal method of child class");
	}
	
	//final method cann't be overridden
	/*
	 * public void finalMethod() {
	 * System.out.println("final method of UsingFinalMethod class"); }
	 */

}
