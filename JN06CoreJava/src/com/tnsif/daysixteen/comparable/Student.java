package com.tnsif.daysixteen.comparable;

public class Student implements Comparable {
	private int rollNo;
	private String name;
	private float per;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	//sort on student name
	@Override
	public int compareTo(Object obj) {
		Student s2=(Student) obj;
		Student s1=this;
		//return s1.getName().compareTo(s2.getName());
		return (int) (s2.getPer()-s1.getPer());
	}
	
	
}
