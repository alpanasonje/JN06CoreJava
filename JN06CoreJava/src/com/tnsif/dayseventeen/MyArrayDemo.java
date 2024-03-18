package com.tnsif.dayseventeen;

public class MyArrayDemo {

	public static void main(String[] args) {
		Integer a[]=new Integer[] {10,5,6,33};
		MyArray<Integer> obj=new MyArray<Integer>(a);
		obj.display();
		
		Float f[]=new Float[] {12.56f, 67.50f, 78.0f};
		MyArray<Float> objFloat=new MyArray<Float>(f);
		objFloat.display();
		

	}

}
