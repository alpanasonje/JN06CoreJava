package com.tnsif.daytwelve;

public class UsingFinally {
	public static int divide(int a, int b) {
		return a / b;
	}

	public static float divideNumbers(int a, int b) {
		return a / (float) b;
	}
	
	public static void main(String args[])
	{
		try
		{	
		
		System.out.println("Division : "+divideNumbers(10,0));
		System.out.println("-------------------");
		System.out.println("Division : "+divide(10,3));
		System.out.println("-------------------");
		//System.out.println("Division : "+divide(10,0));
		//System.out.println("-------------------");
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero Error...");
		}
		finally
		{
			System.out.println("In finally....");
		}
		System.out.println("---End of Main----");
	}
}
