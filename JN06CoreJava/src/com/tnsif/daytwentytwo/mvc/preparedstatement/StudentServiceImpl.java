package com.tnsif.daytwentytwo.mvc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.tnsif.daytwentytwo.mvc.DBUtil;
import com.tnsif.daytwentytwo.mvc.Student;
import com.tnsif.daytwentytwo.mvc.StudentService;

public class StudentServiceImpl implements StudentService {
	private Connection cn;
	private PreparedStatement pst;

	public StudentServiceImpl() {
		cn = DBUtil.getCn();
	}

	@Override
	public void addStudent(Student s) throws SQLException {
		String sql = "INSERT INTO student VALUES(?,?,?)";
		pst=cn.prepareStatement(sql);
		pst.setInt(1, s.getRollNo());
		pst.setString(2, s.getName());
		pst.setFloat(3, s.getPer());
		pst.executeUpdate();
	}

	@Override
	public int updateStudent(Student s, int rollNo) throws SQLException {
		int n;
		String sql = "UPDATE student SET name=?, per=? WHERE rollno=?";
		pst=cn.prepareStatement(sql);
		pst.setString(1, s.getName());
		pst.setFloat(2, s.getPer());
		pst.setInt(3, rollNo);
		n= pst.executeUpdate();
		return n ;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE rollno=?";
		pst=cn.prepareStatement(sql);
		pst.setInt(1, rollNo);
		n= pst.executeUpdate();
		return n ;
	}

	@Override
	public int deleteStudentBelowPer(float per) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE per <=?";
		pst=cn.prepareStatement(sql);
		pst.setFloat(1, per);
		n= pst.executeUpdate();
		return n ;
	}

	@Override
	public int deleteByName(String name) throws SQLException {
		int n;
		String sql = "DELETE FROM student WHERE name like ?";
		pst=cn.prepareStatement(sql);
		pst.setString(1, name);
		n= pst.executeUpdate();
		return n ;
	}

	@Override
	public List<Student> displayAll() throws SQLException {
		ArrayList<Student> stList = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
		pst=cn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
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
		String sql = "SELECT * FROM student WHERE per BETWEEN ? AND ?";
		pst=cn.prepareStatement(sql);
		pst.setFloat(1, startPer);
		pst.setFloat(2, endPer);
		ResultSet rs = pst.executeQuery();
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
