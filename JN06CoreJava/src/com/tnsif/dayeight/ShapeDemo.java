package com.tnsif.dayeight;

public class ShapeDemo {

	public static void main(String[] args) {
		//Shape s=new Shape(); //cann't instantiate abstract class 
		Shape s;
		Rectangle rObj=new Rectangle(12.5f, 20);
		Square sObj=new Square(10);
		Circle cObj=new Circle(3.2f);
		
		s=rObj;
		s.calArea(); //Rectangle class
		s.show();
		
		s=sObj;
		s.calArea(); //Square class
		s.show();
		
		s=cObj;
		s.calArea(); //Circle class
		s.show();
		//s.display();
		((Circle) s).display();
		
	
		
	}

}
