package com.tnsif.daysixteen.javaeight;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

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
		
		//Fetch Persons who belongs to Pune city 
		Stream<Person> s=personList.stream();
		Predicate<Person> pCity=(p)->p.getCity().equals("Pune");
		s.filter(pCity).forEach(System.out::println);
		
		
		
	}

}
