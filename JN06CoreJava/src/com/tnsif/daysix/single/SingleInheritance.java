package com.tnsif.daysix.single;

public class SingleInheritance {

	public static void main(String[] args) {
		Base b=new Base();
		System.out.println("-----------------------");

		Base bOne=new Base(10);
		System.out.println("-----------------------");
		
		Derived d=new Derived();
		System.out.println("-----------------------");
		
		Derived dOne=new Derived(20);
		System.out.println("-----------------------");
	}

}
