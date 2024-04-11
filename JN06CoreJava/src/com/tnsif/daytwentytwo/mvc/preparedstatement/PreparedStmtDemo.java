package com.tnsif.daytwentytwo.mvc.preparedstatement;

import java.sql.SQLException;

import com.tnsif.daytwentytwo.mvc.Student;

public class PreparedStmtDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StudentServiceImpl obj = new StudentServiceImpl();
		/*
		 * Student s=new Student(6, "Dhruvi", 71); obj.addStudent(s); s=new Student(7,
		 * "Manisha", 74); obj.addStudent(s); s=new Student(8, "Pankaja", 81);
		 * obj.addStudent(s);
		 */
		System.out.println("----------------------------------------");
		obj.displayAll();

		System.out.println("Student between 70 and 80 percentage");
		System.out.println(obj.displayStudentsWithinPerRange(70, 80));
		System.out.println("------------------------------------");
		// if (obj.deleteStudentByRollNo(1) == 0)
		// if (obj.deleteStudentBelowPer(72)==0)
		if (obj.deleteByName("%a") == 0)
			System.out.println("Student not found..");
		else
			System.out.println("Record deleted successfully....");
		 System.out.println("------------------------------------"); 
		 Student s=new Student(); s.setRollNo(2); s.setName("Amol"); s.setPer(70); 
		 int n=obj.updateStudent(s, 2); 
		 System.out.println(n+" record(s) updated...");

		obj.displayAll();

	}

}
