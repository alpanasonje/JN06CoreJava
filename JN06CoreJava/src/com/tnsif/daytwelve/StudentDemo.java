package com.tnsif.daytwelve;

public class StudentDemo {

	public static void main(String[] args) {
		Student st=new Student();
		st.setRollNo(101);
		st.setName("Ankit");
		int m[]=new int[] {45, -67, 80};
		try {
			if (Service.validateMarks(m))
				st.setMarks(m);
		} catch (InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(st);
	

	}

}
