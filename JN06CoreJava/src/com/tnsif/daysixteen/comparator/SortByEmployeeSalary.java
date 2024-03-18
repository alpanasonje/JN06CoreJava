//Sort by Employee Salary
package com.tnsif.daysixteen.comparator;

import java.util.Comparator;

public class SortByEmployeeSalary implements Comparator<Employee> {

	
	@Override
	public int compare(Employee o1, Employee o2) {
		//Ascending order
		return (int)(o1.getsalary()-o2.getsalary());
		//Descending order
		//return (int)(o2.getsalary()-o1.getsalary());
	}

}
