package com.tnsif.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter two numbers : ");
		
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division is "+c);
			System.out.println(args[0]);
		}
		catch(ArithmeticException | InputMismatchException e)
		{
			System.out.println("Error Occurred...."+e.getMessage());
		}
		/*
		 * catch(ArithmeticException e) {
		 * System.out.println("Error Occurred...."+e.getMessage()); } catch
		 * (InputMismatchException e) {
		 * System.out.println("Invalid input : "+e.getMessage()); }
		 */
		catch(Exception e)
		{
			System.out.println("Error Occurred...."+e.getMessage());
		}
		System.out.println("-------------------------------------");

	}

}
