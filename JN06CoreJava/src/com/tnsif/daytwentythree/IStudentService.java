package com.tnsif.daytwentythree;

import java.sql.SQLException;

import com.tnsif.daytwentytwo.mvc.Student;

public interface IStudentService {
	void addStudent(Student s) throws SQLException;
	String GetStudentName(int rollNo) throws SQLException;
	int getStudentCount() throws SQLException;	
}
