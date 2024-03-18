package com.tnsif.daysixteen.comparable;

public class NewStudent implements Comparable<NewStudent> {
	private int rollNo;
	private String name;
	private float per;
	public NewStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewStudent(int rollNo, String name, float per) {
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
	//sort on student percentage in descending order
	@Override
	public int compareTo(NewStudent o) {
		return (int) (o.getPer()-getPer());
	}
	
	
}
