package com.tnsif.dayseventeen;

import java.util.List;

public class UsingWildcards {
	// unbounded wildcard - using unknown list
	public static void display(List<?> myList) {
		for (Object ele : myList) {
			System.out.println(ele);
		}
	}

	// bounded list - extends (upper bounded)
	public static void operations(List<? extends Number> myList) {
		Double sum = 0.0;
		for (Number ele : myList)
			sum += ele.doubleValue();
		System.out.println("Sum of numbers : " + sum);
	}
	
	// bounded list - extends (upper bounded)
		public static void addition(List<? super Integer> myList) {
			for (Object ele : myList) {
				System.out.println(ele);
			}	
		}
}
