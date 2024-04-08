package com.tnsif.daytwentytwo.mvc;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StudentServiceImpl obj=new StudentServiceImpl();
		obj.displayAll();
	}

}
