package com.tnsif.daytwentytwo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC Driver is loaded.....");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Admin@123");
			System.out.println("Connection established successfully...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getCn()
	{
		return cn;
	}
}
