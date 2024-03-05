package com.tnsif.daytwelve;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		CheckedExceptions obj = new CheckedExceptions();
		try {
			obj.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.display();
	}

}
