package com.tnsif.dayseventeen;

public class MyClass {
	
	//Generic method
	public static <T> void display(T value) {
		System.out.println("Value is " + value + " Type : " + value.getClass());
	}
}
