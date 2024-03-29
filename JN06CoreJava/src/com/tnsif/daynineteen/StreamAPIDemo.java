package com.tnsif.daynineteen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(501);
		numList.add(30);
		numList.add(805);
		numList.add(100);
		numList.add(509);

		System.out.println(numList);
		System.out.println("--------------------------------");
		// acquire a stream on collection
		Stream<Integer> numStream = numList.stream();

		// Perform terminal operation count() - to count total numbers
		System.out.println("Total numbers " + numStream.count());

		// display only even values from numList
		for (int i = 0; i < numList.size(); i++) {
			int no = numList.get(i);
			if (no % 2 == 0)
				System.out.println(no);
		}

		System.out.println("---------------------------------");
		// Using StreamAPI
		numStream = numList.stream(); //acquire a stream 
		numStream=numStream.filter((no) -> no % 2 == 0); //apply filter operation
		//numStream.forEach((no)->System.out.println("Even number is "+no)); //display each element
		numStream.forEach(System.out::println); //display each element
		
		
		List<Integer> evenList;
		
		//collection even numbers into another list
		//evenList=numStream.collect(Collectors.toList());
		System.out.println("Even List");
		evenList=numList.stream().filter((no)->no%2==0).toList();
		System.out.println(evenList);
		
		Predicate<Integer> oddPredicate=(no) -> no % 2 != 0;
		numList.stream().filter(oddPredicate).forEach(System.out::println);

	}

}
