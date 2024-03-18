//sort by Employee Name
package com.tnsif.daysixteen.comparator;

import java.util.Comparator;

public class SortByEmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//	return o1.getName().compareTo(o2.getName());
		//Descending order
		return o2.getName().compareTo(o1.getName());
	}

	
	
}
