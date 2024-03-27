package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.tnsif.daysix.hierarchical.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Heterogeneous List
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add(10);
		list.add(20.60);
		list.add(false);
		list.add("Hello");
		Person p = new Person("Amit", 7878787878l, "Pune");
		list.add(p);

		System.out.println(list);

		// Collections.sort(list); //ClassCastException
		// System.out.println(list);

		System.out.println("------------------------------");
		// Homogeneous list
		// list for city
		ArrayList<String> cityList = new ArrayList<String>();
		System.out.println("Size : " + cityList.size());
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Mumbai");
		System.out.println(cityList);
		System.out.println("Size : " + cityList.size());
		cityList.add(0, "Nagar");
		System.out.println(cityList);
		System.out.println("Size : " + cityList.size());
		// cityList.add(10); //CTE
		cityList.add("Pune");
		System.out.println(cityList);
		System.out.println("Size : " + cityList.size());

		Collections.sort(cityList);
		System.out.println("CityList " + cityList);

		System.out.println("Is Nashik present? " + cityList.contains("Nashik"));
		System.out.println(cityList);
		System.out.println("Index of Pune : " + cityList.indexOf("Pune"));
		System.out.println("LastIndex of Pune : " + cityList.lastIndexOf("Pune"));
		System.out.println("Index of Puna : " + cityList.indexOf("Puna"));

		System.out.println("Removed : " + cityList.remove(2));
		// System.out.println("Removed : "+cityList.remove(-2));
		// IndexOutOfBoundsException
		System.out.println("Size : " + cityList.size());
		System.out.println(cityList);

		System.out.println("Is A.Nagar removed? : " + cityList.remove("A.Nagar"));
		System.out.println("Size : " + cityList.size());
		System.out.println(cityList);

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(p);
		personList.add(new Person("Pooja", 676767676l, "Mumbai"));
		personList.add(new Person("Pratik", 996767676l, "Delhi"));
		personList.add(new Person("Neha", 676007676l, "Pune"));
		personList.add(new Person("Amol", 896767676l, "Mumbai"));

		System.out.println(personList);
		// Collections.sort(personList); CTE

		System.out.println("------------Cities are as follows-----------");
		// Iterate a collection
		Iterator<String> it = cityList.iterator();
		while (it.hasNext()) {
			String city;
			city = it.next();
			// System.out.println(city+"\tLength : "+city.length());
			System.out.println(city.toUpperCase());
			if (city.equals("Pune"))
				it.remove();
		}

		// System.out.println(it.next()); NoSuchElementException
		System.out.println(cityList);
	}

}
