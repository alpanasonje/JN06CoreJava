package com.tnsif.dayfour;

public class StudentDemo {

	public static void main(String[] args) {
		Student studObjOne=new Student();
		System.out.println("Roll Number "+studObjOne.getRollNo());
		System.out.println("Name "+studObjOne.getName());
		System.out.println("Branch "+studObjOne.getBranch());
	
		studObjOne.setRollNo(1);
		studObjOne.setName("Niranjan");
		studObjOne.setBranch("ENTC");
	
		System.out.println("-----------------------------------");
		System.out.println("Roll Number "+studObjOne.getRollNo());
		System.out.println("Name "+studObjOne.getName());
		System.out.println("Branch "+studObjOne.getBranch());
		
		Student studObjTwo=new Student(2,"Sanket","IT");
		System.out.println("-----------------------------------");
		System.out.println("Roll Number "+studObjTwo.getRollNo());
		System.out.println("Name "+studObjTwo.getName());
		System.out.println("Branch "+studObjTwo.getBranch());
		
		Student stud;
		stud=studObjOne.getStudent();
		System.out.println("-----------------------------------");
		System.out.println("Roll Number "+stud.getRollNo());
		System.out.println("Name "+stud.getName());
		System.out.println("Branch "+stud.getBranch());
	
	}

}
