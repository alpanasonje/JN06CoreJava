package com.tnsif.daysixteen;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//ordered, unsorted map
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
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
