//Program to define child class from an abstract class
package com.tnsif.dayeight;

public class Rectangle extends Shape {
	private float length, breadth;
	
	
	public Rectangle() {
		super();
		name="Rectangle";
	}


	public Rectangle(float length, float breadth) {
		super();
		name="Rectangle";
		this.length = length;
		this.breadth = breadth;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getBreadth() {
		return breadth;
	}


	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calArea() {
		super.area=length*breadth;		
	}
}
