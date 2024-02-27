package com.tnsif.daynine.interfaces.functionalinterfaces;

public class MyImplementable implements MyFunctionalInterface {

	@Override
	public void calculate(int no) {
		System.out.println("Square of "+no+" is "+no*no);
		
	}

}
