package com.tnsif.daytwentytwo.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	private Connection cn;
	private Statement st;

	public StudentServiceImpl() {
		cn = DBUtil.getCn();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent(Student s) throws SQLException {
		String sql = "INSERT INTO student VALUES(" + s.getRollNo() + ",'" + s.getName() + "'," + s.getPer() + ")";
		st.executeUpdate(sql);
	}

	@Override
	public int updateStudent(Student s, int rollNo) throws SQLException {
		int n;
		String sql = "UPDATE student SET name='"+s.getName()+"', per="+s.getPer()+" WHERE rollno="+rollNo;
		n= st.executeUpdate(sql);
		return n ;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE rollno="+rollNo;
		n= st.executeUpdate(sql);
		return n ;
	}

	@Override
	public int deleteStudentBelowPer(float per) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE per <="+per;
		n= st.executeUpdate(sql);
		return n ;
	}

	@Override
	public int deleteByName(String name) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE name like '"+name+"'";		
		n= st.executeUpdate(sql);
		return n ;
	}

	@Override
	public List<Student> displayAll() throws SQLException {
		ArrayList<Student> stList = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
		ResultSet rs = st.executeQuery(sql);
		Student st=new Student();
		while (rs.next()) {
			st.setRollNo(rs.getInt(1));
			st.setName( rs.getString(2) );
			st.setPer(rs.getFloat(3));
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
			stList.add(st);
		}
		return stList;
	}

	@Override
	public List<Student> displayStudentsWithinPerRange(float startPer, float endPer) throws SQLException {
		ArrayList<Student> stList = new ArrayList<Student>();
		String sql = "SELECT * FROM student WHERE per BETWEEN "+startPer+ " AND "+endPer;
		ResultSet rs = st.executeQuery(sql);
		Student st=new Student();
		while (rs.next()) {
			st.setRollNo(rs.getInt(1));
			st.setName( rs.getString(2) );
			st.setPer(rs.getFloat(3));
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
			stList.add(st);
		}
		return stList;
	}

}
