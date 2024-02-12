//Program to create objects
package com.tnsif.daythree;

public class Demo {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.name="Nidhi";
		obj.age=22;
		obj.gender="Female";
				
		obj.display();
		
		Person objOne=new Person();
		objOne.accept();
		objOne.display();

	}

}
