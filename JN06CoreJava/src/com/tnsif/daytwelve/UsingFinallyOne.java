package com.tnsif.daytwelve;

import java.util.Scanner;

public class UsingFinallyOne {

	public static void main(String[] args) {
		int n;
		/*try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number : ");
		n=sc.nextInt();
	}*/
		Scanner sc=null;
		try
		{
			sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			n=sc.nextInt();		
			System.out.println("You entered : "+n);
		}
		finally
		{
			//release the resources
			sc.close();
		}
	}

}
