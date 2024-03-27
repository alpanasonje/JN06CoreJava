//Program to define generic class
package com.tnsif.dayseventeen;

import java.util.Arrays;

//Define generic class
public class MyArray<T> {
	T arr[];
	
	//Generic Constructor
	public MyArray(T arr[])
	{
		this.arr=arr;
	}
	
	public void display()
	{
		System.out.println("Array Elements are as follows: ");
		for(T ele:arr)
			System.out.println(ele);
	}

	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}

}
