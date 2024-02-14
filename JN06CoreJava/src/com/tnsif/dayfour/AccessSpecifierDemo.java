package com.tnsif.dayfour;

import com.tnsif.daythree.MyClass;

//another package non subclass
public class AccessSpecifierDemo {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		//obj.defaultNumber=10;
		//obj.protectedNumber=20;
		//obj.privateNumber=30;
		obj.publicNumber=40;
		
		obj.display();	
		System.out.println("------------------------");
		MyOtherChild childObj=new MyOtherChild();
		childObj.change();

	}

}
