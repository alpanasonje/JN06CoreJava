package com.tnsif.daytwentythree;

import java.sql.SQLException;

import com.tnsif.daytwentytwo.mvc.Student;

public class StoredProcedureDemo {

	public static void main(String[] args) {
		StudentServiceImplementation obj=new StudentServiceImplementation();
		try {
			Student s=new Student(20,"Prashant",70);
			//obj.addStudent(s);
			//System.out.println(obj.GetStudentName(111));
			System.out.println(obj.getStudentCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
