//Program to define child class Circle
package com.tnsif.dayeight;

public class Circle extends Shape {
	private float radius;
	private double circumference;
	private double diameter;
	public Circle() {
		super();
		name="Circle";
	}


	public Circle(float radius) {
		super();
		name="Circle";
		this.radius = radius;
		this.diameter=2*radius;
	}

	public void display()
	{
		circumference=Math.PI*diameter;
		System.out.println("Circumference is "+circumference);
		System.out.println("Diameter is "+diameter);
	}
	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}


	@Override
	public void calArea() {
		area=Math.PI*radius*radius;		
	}

}
