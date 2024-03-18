package com.tnsif.dayfifteen.usingset;

import java.util.Collections;
import java.util.LinkedHashSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//ordered unique collection
				LinkedHashSet<Integer> hsOne=new LinkedHashSet<Integer>();
				System.out.println(hsOne.add(10));
				System.out.println(hsOne.add(40));
				System.out.println(hsOne.add(20));
				System.out.println(hsOne.add(30));
				System.out.println(hsOne.add(10));
				
				System.out.println(hsOne);
				//Collections.sort(hsOne); CTE

				
				
	}

}
