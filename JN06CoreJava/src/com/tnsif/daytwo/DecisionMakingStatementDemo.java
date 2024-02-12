package com.tnsif.daytwo;

public class DecisionMakingStatementDemo {

	public static void main(String[] args) {
		int number = 6;
		if (number >= 10) {
			System.out.println("------------------------------------");
		}

		number = 10;
		if (number >= 0)
			System.out.println(number + " is positive");
		else
			System.out.println(number + " is negative");

		int a = 5, b = 25;

		if (a > b)
			System.out.println(a + " is largest");
		else
			System.out.println(b + " is largest");

		/*
		 * a=12 b=21 b is greater than a a=12 b=1 a is greater than b a=12 b=12 a is
		 * greater than b b is greater than a
		 */

		if (a > b)
			System.out.println("a is largest than b");
		else if (b > a)
			System.out.println("b is largest than a");
		else
			System.out.println("Both are same");

		int c = 202;
		// largest of a, b and c
		System.out.println("-------------------------");
		System.out.println("a = " + a + " b = " + b + " c = " + c);

		if (a > b) {
			if (a > c)
				System.out.println("a is largest");
			else
				System.out.println("c is largest");
		} else {
			if (b > c)
				System.out.println("b is largest");
			else
				System.out.println("c is largest");

		}
System.out.println("-----------------------------");
		// switch
a=100;
		switch (a) {
		default:
			System.out.println("invalid case");
			break;
		case 5:
			System.out.println("five");
			break;
		case 10:
			System.out.println("ten");
			break;
		
		}
	}

}
