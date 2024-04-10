package com.tnsif.daytwentytwo.mvc;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
	public abstract void addStudent(Student s)  throws SQLException ;
	public abstract int updateStudent(Student s, int rollNo) throws SQLException ;
	public abstract int deleteStudentByRollNo(int rollNo) throws SQLException ;
	public abstract int deleteStudentBelowPer(float per)  throws SQLException ;
	public abstract int deleteByName(String name) throws SQLException ;
	public abstract List<Student> displayAll()  throws SQLException ;
	public abstract List<Student> displayStudentsWithinPerRange(float startPer, float endPer)  throws SQLException ;
}
