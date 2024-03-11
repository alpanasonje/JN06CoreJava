package com.tnsif.daytwelve;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		  CheckedExceptions obj = new CheckedExceptions(); try { obj.accept(); } 
		  catch(IOException e) { //catch block 
			  e.printStackTrace(); }
		  
		 	
		System.out.println("---End of Main----");
	}

}
