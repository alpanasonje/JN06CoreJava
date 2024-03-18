package com.tnsif.daysixteen.comparator;

public class Employee {
	private int empId;
	private String name;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}
