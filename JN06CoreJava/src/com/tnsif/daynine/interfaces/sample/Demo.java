package com.tnsif.daynine.interfaces.sample;

public class Demo {

	public static void main(String[] args) {
		//InterfaceOne obj=new InterfaceOne(); //cannot instantiated
		ImplementableClass obj=new ImplementableClass();
		obj.show();
		obj.greet("Students!!");

	}

}
