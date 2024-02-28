package com.tnsif.dayten;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int no=10;
		//autoboxing- converting primitive type to object type
		//Explicit conversion using valueOf function
		Integer intObjOne=Integer.valueOf(no);
		//automatically type casting done
		Integer intObj=no;
		
		System.out.println(intObj);
		System.out.println(intObjOne);
		
		int a;
		//unboxing - converting object into primitive types
		a=intObj.intValue();
		//automatically done
		a=intObj;
		System.out.println(a);
		
		String s="20";
		System.out.println(s);
		int c=a+Integer.parseInt(s);
		System.out.println(c);
		
		
	}

}
