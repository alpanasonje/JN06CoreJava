package com.tnsif.daytwentytwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Driver is loaded.....");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Admin@123");
		System.out.println("Connection established successfully...");
		Statement st=cn.createStatement();
		int rno;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno, name and per");
		rno=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		per=sc.nextFloat();
		int n=st.executeUpdate("insert into student values("+rno+",'"+name+"',"+per+")");
		System.out.println(n+" rows inserted...");
		cn.close();
		
		

	}

}
