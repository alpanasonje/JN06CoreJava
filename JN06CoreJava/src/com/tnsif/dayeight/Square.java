package com.tnsif.dayeight;

public class Square extends Shape {
	private float side;
	
	
	public Square() {
		super();
		name="Square";
	}

	public Square(float side) {
		super();
		name="Square";
		this.side = side;
	}


	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calArea() {
		area=side*side;
		
	}

}
