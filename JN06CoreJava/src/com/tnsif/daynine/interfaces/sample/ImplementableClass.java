//Program to define an implementable class from an interface
package com.tnsif.daynine.interfaces.sample;

public class ImplementableClass implements InterfaceOne {

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		
	}

}
