package com.tnsif.daysixteen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.tnsif.daysix.hierarchical.Person;

public class TreeMapDemo {

	public static void main(String[] args) {
		// sorted map
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("amit@gmail.com", "Amit");
		hm.put("sumit@gmail.com", "Sumit");
		hm.put("suresh@gmail.com", "Suresh");
		hm.put("ramesh@gmail.com", "Ramesh");
		hm.put("mahesh@gmail.com", "Mahesh");
		System.out.println(hm);

		hm.put("amit@gmail.com", "Amita");
		System.out.println("------------------------");
		System.out.println(hm);

		// hm.put(null, "Sunita");
		// null keys not allowed

		System.out.println(hm.get("suresh@gmail.com"));
		System.out.println(hm.get("suresha@gmail.com"));

		Set<String> emails = hm.keySet();

		System.out.println(emails);
		Iterator<String> email = emails.iterator();
		System.out.println("All keys - emails are as follows: ");
		while (email.hasNext()) {
			String k = email.next();
			System.out.println(k + " : " + hm.get(k));
		}
		System.out.println("-------------------------------");
		Collection<String> names = hm.values();
		Iterator<String> name = names.iterator();
		System.out.println("All values - names are as follows: ");
		while (name.hasNext()) {
			System.out.println(name.next());
		}
		System.out.println("------------------------------------");

		Set<Map.Entry<String, String>> entry = hm.entrySet();
		Iterator<Map.Entry<String, String>> it = entry.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> e = it.next();
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		System.out.println("------------------------------");

		Comparator<Person> comp = (p2, p1) -> {
			return p1.getCity().compareTo(p2.getCity());
		};

		TreeMap<Person, Integer> personMap = new TreeMap<Person, Integer>(comp);

		personMap.put(new Person("Pooja", 676767676l, "Mumbai"), 67);
		personMap.put(new Person("Pratik", 996767676l, "Delhi"), 60);
		personMap.put(new Person("Neha", 676007676l, "Pune"), 70);
		personMap.put(new Person("Amol", 896767676l, "Nashik"), 81);

		System.out.println(personMap);

	}

}
