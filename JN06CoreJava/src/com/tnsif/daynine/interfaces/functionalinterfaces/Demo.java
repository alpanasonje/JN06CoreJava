package com.tnsif.daynine.interfaces.functionalinterfaces;

public class Demo {

	public static void main(String[] args) {
		//Old way - defining implementable classes
		MyImplementable obj = new MyImplementable();
		obj.calculate(5);
		
		MyFunctionalInterface iobj=new MyImplementable();
		iobj.calculate(100);
		
		//old way - creating anonymous class
		MyFunctionalInterface iobjOne=new MyFunctionalInterface() {
			
			@Override
			public void calculate(int no) {
				System.out.println("Cube of "+no + " is "+no*no*no);				
			}
		};

		iobjOne.calculate(4);
		
		//New way - using lambda expression
		MyFunctionalInterface iobjTwo=n->System.out.println("Square root of "+n+" is "+Math.sqrt(n));
		iobjTwo.calculate(4);
	}

}
