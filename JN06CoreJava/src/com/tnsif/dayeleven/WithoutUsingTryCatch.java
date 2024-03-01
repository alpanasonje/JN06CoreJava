package com.tnsif.dayeleven;

public class WithoutUsingTryCatch {

	public static void main(String[] args) {
		int a,b,c;		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		a=11; 
		//b=2;
		try
		{
			c=a/b;			
			System.out.println("Division is "+c);		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error occurred..."+e);
		}
	
		System.out.println("---------------------------");
	}

}
