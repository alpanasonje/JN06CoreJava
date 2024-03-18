//Sort by Employee Id
package com.tnsif.daysixteen.comparator;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//Ascending order
		return o1.getEmpId()-o2.getEmpId();
	}

}
