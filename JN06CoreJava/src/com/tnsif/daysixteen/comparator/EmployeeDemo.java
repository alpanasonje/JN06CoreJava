//Program to demonstrate Comparator interface to sort Employee List
package com.tnsif.daysixteen.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1005, "Pratik", 78000));
		empList.add(new Employee(1002, "Pratiksha", 68000));
		empList.add(new Employee(1001, "Ankit", 76000));
		empList.add(new Employee(1004, "Prajakta", 81000));
		empList.add(new Employee(1003, "Ankita", 58000));
		
		for (Employee emp : empList)
			System.out.println(emp);
		System.out.println("----------------------");
		
		Collections.sort(empList, new SortByEmployeeId());
		for (Employee emp : empList)
			System.out.println(emp);
		System.out.println("----------------------");

		
		Collections.sort(empList, new SortByEmployeeName());
		for (Employee emp : empList)
			System.out.println(emp);
		System.out.println("----------------------");

		
		Collections.sort(empList, new SortByEmployeeSalary());
		for (Employee emp : empList)
			System.out.println(emp);
		System.out.println("----------------------");

	}

}
