package com.tnsif.dayfifteen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> intList=new LinkedList<Integer>();
		intList.add(10);
		intList.add(70);
		intList.add(40);
		intList.add(90);
		intList.add(20);
		intList.add(2,100);
		System.out.println(intList);
		intList.addFirst(5);
		intList.addLast(200);
		System.out.println(intList);
		
		System.out.println("Element at 4th index : "+intList.get(4));
		System.out.println("First Element : "+intList.getFirst());
		System.out.println("Last Element : "+intList.getLast());
		
		System.out.println("Removes first element\nRemoved : "+intList.remove());
		System.out.println("remove 3rd element : "+intList.remove(3));
		System.out.println("remove first element : "+intList.removeFirst());
		System.out.println("remove last element : "+intList.removeLast());
		System.out.println("-----------------------------");
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------------------------");
		
		/*
		 * ListIterator<Integer> lit=intList.listIterator(); while(lit.hasNext()) {
		 * System.out.println(lit.next()); }
		 * System.out.println("-----------------------------"); while(lit.hasPrevious())
		 * { System.out.println(lit.previous()); }
		 * System.out.println("-----------------------------");
		 */
		
		ListIterator<Integer> lit=intList.listIterator(intList.size());
		while(lit.hasPrevious())
			 { 
				int n=lit.previous();
				System.out.println(n);
				if (n==20)
					lit.add(50);
				if (n==90)
					lit.set(9000);
				if (n==50)
					lit.remove();
			 }
			  System.out.println("-----------------------------");
			  System.out.println(intList);
	}
}
