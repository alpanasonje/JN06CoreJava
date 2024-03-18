package com.tnsif.daysixteen.javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class PersonDemo {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();

		personList.add(new Person("Amol", 7890980900L, "Pune"));
		personList.add(new Person("Pranav", 8890980900L, "Mumbai"));
		personList.add(new Person("Abhijeet", 7690980900L, "Pune"));
		personList.add(new Person("Aryan", 9490980900L, "Delhi"));
		personList.add(new Person("Rahul", 7790980900L, "Hyderabad"));
		personList.add(new Person("Ketan", 8190980900L, "Mumbai"));

		for (Person p : personList)
			System.out.println(p);
		System.out.println("------------------------------");

		// Using method reference - sort by name
		Comparator<Person> c = Comparator.comparing(Person::getName);
		Collections.sort(personList, c);

		for (Person p : personList)
			System.out.println(p);
		System.out.println("------------------------------");

		// Using method reference - sort by city in descending order
		c = Comparator.comparing(Person::getCity);
		Collections.sort(personList, c);
		Collections.reverse(personList);

		for (Person p : personList)
			System.out.println(p);
		System.out.println("------------------------------");

		// Using Lambda Expression - sort by name in descending order
		c = (p2, p1) -> p1.getName().compareTo(p2.getName());
		Collections.sort(personList, c);

		for (Person p : personList)
			System.out.println(p);
		System.out.println("------------------------------");

		// Using Lambda Expression - sort by contact number in ascending order
		c = (p1, p2) ->(int)( p1.getContactNo()-p2.getContactNo());
		Collections.sort(personList, c);

		for (Person p : personList)
			System.out.println(p);
		System.out.println("------------------------------");
		
		TreeSet<Person> personSet=new TreeSet<Person>(c);
		personSet.add(new Person("Amol", 7890980900L, "Pune"));
		personSet.add(new Person("Pranav", 8890980900L, "Mumbai"));
		personSet.add(new Person("Abhijeet", 7690980900L, "Pune"));
		personSet.add(new Person("Aryan", 9490980900L, "Delhi"));
		personSet.add(new Person("Rahul", 7790980900L, "Hyderabad"));
		personSet.add(new Person("Ketan", 8190980900L, "Mumbai"));

		System.out.println(personSet);
	}

}
