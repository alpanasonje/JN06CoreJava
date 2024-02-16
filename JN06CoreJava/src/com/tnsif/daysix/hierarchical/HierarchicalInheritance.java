package com.tnsif.daysix.hierarchical;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student studObj=new Student("Mahesh", 7880909090L, "Pune",10,78,"FY");
		
		Employee empObj=new Employee("Pankaj", 9090909090L, "Mumbai",10101, 67000);
		
		System.out.println(studObj);
		System.out.println("---------------------------");
		System.out.println(empObj);

	}

}
