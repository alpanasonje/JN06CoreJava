package com.tnsif.daytwelve;

public class Service {
	public static boolean validateMarks(int marks[]) throws InvalidMarksException
	{
		
		for(int m: marks)
		{
			if (m<0 || m>100)
			{
				//System.out.println("Invalid marks");
				//throw new InvalidMarksException();
				throw new InvalidMarksException("Marks must be within 0 to 100");
			}
		}
		return true;
	}
}
