package com.tnsif.daytwentythree;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Type;
import com.tnsif.daytwentytwo.mvc.DBUtil;
import com.tnsif.daytwentytwo.mvc.Student;

public class StudentServiceImplementation implements IStudentService {
	Connection cn;
	Statement st;
	PreparedStatement pst;
	CallableStatement cst;
	public StudentServiceImplementation()
	{
		cn=DBUtil.getCn();
	}
	
	@Override
	public void addStudent(Student s) throws SQLException {
		st=cn.createStatement();
		//calling stored procedure without parameter
		boolean result;
		//result=st.execute("{call insertStud()}");
		//calling parameterized stored procedure using Statement Interface
		//result=st.execute("{call insertStudent("+s.getRollNo()+",'"+s.getName()+"',"+s.getPer()+")}");
		pst=cn.prepareStatement("{call insertStudent(?,?,?)}");
		pst.setInt(1, s.getRollNo());
		pst.setString(2,s.getName());
		pst.setFloat(3, s.getPer());
		result=pst.execute();
		if (!result)
			System.out.println(pst.getUpdateCount());
	}

	@Override
	public String GetStudentName(int rollNo) throws SQLException {
		//calling stored function using callable statement
		cst=cn.prepareCall("{? = call getName(?)}");
		cst.setInt(2, rollNo);
		cst.registerOutParameter(1, Type.STRING.ordinal());
		cst.execute();
		String name=cst.getString(1);
		return name;
	}

	@Override
	public int getStudentCount() throws SQLException {
		//calling stored procedure with out parameter using callable statement
		cst=cn.prepareCall("{call totalStudents(?)}");
		cst.registerOutParameter(1, Type.INT.ordinal());
		cst.execute();
		int c=cst.getInt(1);
		return c;
	}

}
