package com.tnsif.dayfifteen.usingset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//List - ordered collection with repeated elements
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println(list.add(10));
		System.out.println(list.add(40));
		System.out.println(list.add(20));
		System.out.println(list.add(30));
		System.out.println(list.add(10));
		
		System.out.println(list);
		System.out.println("------------------------------");
		
		//unsorted, unordered unique collection 
		HashSet<Integer> hsOne=new HashSet<Integer>();
		System.out.println(hsOne.add(10));
		System.out.println(hsOne.add(40));
		System.out.println(hsOne.add(20));
		System.out.println(hsOne.add(30));
		System.out.println(hsOne.add(10));
		
		System.out.println(hsOne);
		
		HashSet<Integer> hsTwo=new HashSet<Integer>();
		System.out.println(hsTwo.add(100));
		System.out.println(hsTwo.add(400));
		System.out.println(hsTwo.add(200));
		System.out.println(hsTwo.add(30));
		System.out.println(hsTwo.add(10));
		
		System.out.println(hsTwo);
		
		hsOne.addAll(hsTwo); //Union
		System.out.println(hsOne);
		hsOne.clear();
		System.out.println(hsOne.add(10));
		System.out.println(hsOne.add(40));
		System.out.println(hsOne.add(20));
		System.out.println(hsOne.add(30));
		System.out.println(hsOne.add(10));
		
		System.out.println(hsOne);
		System.out.println(hsTwo);
		System.out.println("-----------------------");
		hsOne.removeAll(hsTwo); //Set Difference hsOne - hsTwo
		System.out.println(hsOne);
		System.out.println(hsTwo);
		hsOne.clear();
		System.out.println(hsOne.add(10));
		System.out.println(hsOne.add(40));
		System.out.println(hsOne.add(20));
		System.out.println(hsOne.add(30));
		System.out.println(hsOne.add(10));
		
		System.out.println(hsOne);
		System.out.println(hsTwo);
		System.out.println("-----------------------");
		hsOne.retainAll(hsTwo); //intersection 
		System.out.println(hsOne);
		System.out.println(hsTwo);
		System.out.println("-----------------------");
		
		
	}

}
