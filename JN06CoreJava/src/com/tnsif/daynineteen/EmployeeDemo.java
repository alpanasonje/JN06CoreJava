package com.tnsif.daynineteen;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.tnsif.daysixteen.javaeight.Person;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(101,"Aniket",30000,"GET"));
		employeeList.add(new Employee(101,"Neha",65000,"System Analyst"));
		employeeList.add(new Employee(101,"Purvi",35000,"Jr. Software Developer"));
		employeeList.add(new Employee(101,"Rajashree",35000,"Jr. Software Developer"));
		employeeList.add(new Employee(101,"Sanket",30000,"GET"));
		employeeList.add(new Employee(101,"Gaurav",30000,"GET"));
		

		for (Employee emp: employeeList)
			System.out.println(emp);
		System.out.println("------------------------------");
		
		//Fetch Jr. Software Developer Employees  
		Stream<Employee> empStream=employeeList.stream();
		Predicate<Employee> pDesign=(e)->e.getDesignation().equals("Jr. Software Developer");
		empStream.filter(pDesign).forEach(System.out::println);
		
		//Display Maximum Salary
		empStream=employeeList.stream();
		Employee e=empStream.reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2).get();
		System.out.println("Maximum Salary "+e.getSalary());
		
		//Employees with highest salary
		empStream=employeeList.stream();
		Predicate<Employee> p=(emp)->emp.getSalary()==e.getSalary();
		empStream.filter(p).forEach(System.out::println);
		

	}

}
