package com.tnsif.daytwo;

public class LoopDemo {

	public static void main(String[] args) {
		/*
		 * int i; for (i=0;i<=10;i++); { System.out.println("Hello "+i); }
		 */

		
		for (int j=0;j<=10;j++)
		{
			System.out.println("Hello "+j);
		}
		
		for (int j=10;j>=1;j--)
		{
			System.out.println("Hi "+j--);
		}
		
		int j=10;
		while(j<=50)
		{
			System.out.println(j);
			j+=5;
		}
		
		do
		{
			System.out.println("----");
			j--;
		}while(j>=1);
		
		
		for(j=1;j<=10;j++)
		{
			if(j==5)
				//break;
				continue;
			System.out.println("j="+j);
		}
		
		
	}

}
