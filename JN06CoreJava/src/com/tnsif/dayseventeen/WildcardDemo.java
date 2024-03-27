package com.tnsif.dayseventeen;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		UsingWildcards.display(l);

		List<String> ll=new ArrayList<String>();
		ll.add("Hi");
		ll.add("Hello");
		ll.add("Bye");
		UsingWildcards.display(ll);
		
		List<Float> fl=new ArrayList<Float>();
		fl.add(12.50f);
		fl.add(2.50f);
		fl.add(12.00f);
		fl.add(20f);
		UsingWildcards.display(fl);
		
		UsingWildcards.operations(l);
		UsingWildcards.operations(fl);
//		UsingWildcards.operations(ll);
		
		UsingWildcards.addition(l);
	//	UsingWildcards.addition(fl);
	//	UsingWildcards.addition(ll);
		
				
	}

}
