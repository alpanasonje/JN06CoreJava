package com.tnsif.dayten.arrays;

import java.util.Scanner;

public class UsingArray {

	public static void main(String[] args) {
		int[] a ;
		a= new int[2];
		//index loop
		for (int i = 0; i <a.length; i++)
			System.out.println(a[i]);
		System.out.println("--------------------------------");
		a[0]=10;
		a[1]=20;
		//for..each
		for(int ele: a)
			System.out.println(ele);
		
		System.out.println("------------------------");
		int b[]= {1,2,3,4,5};
		System.out.println(b.length);
		
		int x[],y;
		x=new int[5];
		System.out.println(x.length);
		//y=new int[2];
		//System.out.println(y.length);
		System.out.println("------------------------");
		int[] x1, y1;
		x1= new int[]{10,20};
		y1=new int[5];
		System.out.println(x1.length);
		System.out.println(y1.length);
		System.out.println("------------------------");
		//int arr[5];
		for(int i=0;i<x1.length;i++)
			System.out.println(x1[i]);
		System.out.println("------------------------");
		int n;
		System.out.println("Enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x1=new int[n];
		for(int i=0;i<x1.length;i++)
		{
			System.out.println("Enter the element  : " );
			x1[i]=sc.nextInt();
		}
		for(int i=0;i<x1.length;i++)	
			System.out.println(x1[i]);
		System.out.println("------------------------");
		//Sum of array elements
		int sum=0;
		for(int i=0;i<x1.length;i++)	
			sum=sum+x1[i];
		System.out.println("Sum = "+sum);
		
		//display maximum of array elements
		int max=x1[0];
		for(int i=1;i<x1.length;i++)
		{
			if (x1[i]>max)
				max=x1[i];
		}
		System.out.println("Maximum of array elements : "+max);
	}

}
