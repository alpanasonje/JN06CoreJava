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
    public StudentServiceImpl()
    {
    	cn=DBUtil.getCn();
    	try {
			st=cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public void addStudent(Student s) throws SQLException {
		String sql="INSERT INTO student VALUES("+s.getRollNo()+",'"+s.getName()+"',"+s.getPer()+")";
		st.executeUpdate(sql);		
	}

	@Override
	public int updateStudent(Student s, int rollNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPer(float per) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> displayAll() throws SQLException {
		ArrayList<Student> stList=new ArrayList<Student>();
		String sql="SELECT * FROM student";
		ResultSet rs=st.executeQuery(sql);
		//Student st
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		return stList;
	}

	@Override
	public List<Student> displayStudentsWithinPerRange(float startPer, float endPer) {
		// TODO Auto-generated method stub
		return null;
	}

}
