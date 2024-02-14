package com.tnsif.dayfour;

import com.tnsif.daythree.MyClass;

//define child class of MyClass which is in another package
public class MyOtherChild extends MyClass{
	public void change()
	{
	//	defaultNumber=11;
		protectedNumber=211;
	//	privateNumber=30;
		publicNumber=411;	
		display();			
	}
}
