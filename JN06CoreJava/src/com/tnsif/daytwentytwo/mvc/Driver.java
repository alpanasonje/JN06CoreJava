package com.tnsif.daytwentytwo.mvc;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StudentServiceImpl obj=new StudentServiceImpl();
		obj.displayAll();
		System.out.println("Student between 70 and 80 percentage");
		System.out.println(obj.displayStudentsWithinPerRange(70,80));
		System.out.println("------------------------------------");
		//if (obj.deleteStudentByRollNo(1)==0)
		//if (obj.deleteStudentBelowPer(40)==0)
		if (obj.deleteByName("%a")==0)
			System.out.println("Student not found..");
		else
			System.out.println("Record deleted successfully....");
		System.out.println("------------------------------------");
		Student s=new Student();
		s.setRollNo(2);
		s.setName("Amol");
		s.setPer(90);
		int n=obj.updateStudent(s, 2);
		System.out.println(n+" record(s) updated...");
		obj.displayAll();
	}

}
