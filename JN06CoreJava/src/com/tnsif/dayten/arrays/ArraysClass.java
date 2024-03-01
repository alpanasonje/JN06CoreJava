package com.tnsif.dayten.arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int a[]= {55,11,12,45,56,78};
		for(int ele:a)
			System.out.println(ele);
		
		System.out.println("------------------------");
		System.out.println(Arrays.binarySearch(a, 120));
		Arrays.sort(a);
		for(int ele:a)
			System.out.println(ele);
		System.out.println("------------------------");
		Arrays.fill(a, 100);
		for(int ele:a)
			System.out.println(ele);
		
		System.out.println("------------------------");
		
	//	System.out.println(Arrays.(a, 120));
		

	}

}
