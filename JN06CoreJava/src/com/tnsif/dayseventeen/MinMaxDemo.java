package com.tnsif.dayseventeen;

import com.tnsif.daysixteen.comparable.NewStudent;

public class MinMaxDemo {

	public static void main(String[] args) {
		Integer a[]=new Integer[] {10, 2000, 30, 200,50};
		
		Float f[]=new Float[] {12.56f, 78.54f, 34.50f};
		
		String s[]=new String[] {"Nashik", "Pune", "Mumbai"};
		
		NewStudent st[]=new NewStudent[] {new NewStudent(10, "Pushkar", 67), new NewStudent(15, "Manoj", 76), new NewStudent(14, "Nitin", 71)};
		
		MinMaxImpl<Integer> obj=new MinMaxImpl<Integer>(a);
		System.out.println(obj.getMin());
		System.out.println(obj.getMax());
		
		MinMaxImpl<Float> floatObj=new MinMaxImpl<Float>(f);
		System.out.println(floatObj.getMin());
		System.out.println(floatObj.getMax());
		
		MinMaxImpl<String> stringObj=new MinMaxImpl<String>(s);
		System.out.println(stringObj.getMin());
		System.out.println(stringObj.getMax());
		
		MinMaxImpl<NewStudent> studentObj=new MinMaxImpl<NewStudent>(st);
		System.out.println(studentObj.getMin());
		System.out.println(studentObj.getMax());
		
	}

}
