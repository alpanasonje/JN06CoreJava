package com.tnsif.daynineteen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		Integer arr[]= {10,20,30,5,2,80};
		List<Integer> numList=Arrays.asList(arr);
		
		Stream<Integer> st=numList.stream();
		st.map((n)->n*n).forEach(System.out::println);
		
		Function<Integer, Double> f=(n)->Math.sqrt(n);
		numList.stream().map(f).forEach(System.out::println);
		
		String str[]= {"Java", "C", "Python", "DotNET"};
		List<String> courseList=Arrays.asList(str);
		courseList.stream().map((s)->s.length()).forEach(System.out::println);
		
		courseList.stream().map((s)->s.toLowerCase()).forEach(System.out::println);

		System.out.println("------------------------");
		numList.stream().limit(3).forEach(System.out::println);
		System.out.println("------------------------");
		numList.stream().distinct().forEach(System.out::println);
		System.out.println("-------------------------");
		
		numList.stream().skip(0).forEach(System.out::println);
		
		System.out.println("----------------------------");
		int sum=numList.stream().reduce((n1,n2)->n1+n2).get();
		System.out.println("sum is "+sum);
		
		int max=numList.stream().reduce((a,b)->a>b?a:b).get();
		System.out.println("Maximum is "+max);
		
		
		
		
		
		
	}

}
