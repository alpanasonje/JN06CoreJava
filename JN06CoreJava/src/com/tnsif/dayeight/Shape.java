//Program to define an Abstract class Shape
package com.tnsif.dayeight;

public abstract class Shape {
	protected double area;
	protected String name;
	
	//abstract method
	public abstract void calArea();
	
	//concrete method
	public void show() {
		System.out.println("Area of " + name + " is " + area);
	}
}
