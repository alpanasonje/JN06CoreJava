package com.tnsif.daysixteen;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//unordered, unsorted map
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("amit@gmail.com", "Amit");
		hm.put("sumit@gmail.com", "Sumit");
		hm.put("suresh@gmail.com", "Suresh");
		hm.put("ramesh@gmail.com", "Ramesh");
		hm.put("mahesh@gmail.com", "Mahesh");
		System.out.println(hm);
		
		hm.put("amit@gmail.com", "Amita");
		System.out.println("------------------------");
		System.out.println(hm);
		
		hm.put(null, "Sunita");
		System.out.println("------------------------");
		System.out.println(hm);
		
		hm.put(null, "Nikita");
		System.out.println("------------------------");
		System.out.println(hm);
		
		System.out.println(hm.get("suresh@gmail.com"));
		System.out.println(hm.get("suresha@gmail.com"));
		
	}

}
