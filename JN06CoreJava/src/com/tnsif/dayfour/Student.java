package com.tnsif.dayfour;

public class Student {
	private int rollNo;
	private String name;
	private String branch;
	
	//Default Constructor
	
	  public Student() { System.out.println("Default Constructor"); 
	  
	  }
	 

	//Parameterized constructor
	public Student(int rollNo, String name, String branch)
	{
		this();	
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
	
	}

	// getters and setters

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int value) {
		rollNo = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student getStudent()
	{
		return this;
	}
}
