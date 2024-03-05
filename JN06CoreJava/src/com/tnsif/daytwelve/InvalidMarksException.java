package com.tnsif.daytwelve;

public class InvalidMarksException extends Throwable {
	public InvalidMarksException()
	{
		super("Invalid marks..");
		//System.out.println("Invalid Marks");
	}
	public InvalidMarksException(String s)
	{
		super(s);
		//System.out.println(s);
	}
}
