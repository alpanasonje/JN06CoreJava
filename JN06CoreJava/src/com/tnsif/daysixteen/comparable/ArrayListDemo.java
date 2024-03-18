package com.tnsif.daysixteen.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<NewStudent> NewStudentList=new ArrayList<NewStudent>();
		NewStudentList.add(new NewStudent(13,"Neha",75));
		NewStudentList.add(new NewStudent(11,"Lavisha",87));
		NewStudentList.add(new NewStudent(10,"Amit",78));
		NewStudentList.add(new NewStudent(12,"Nitin",68));
		System.out.println(NewStudentList);
		Collections.sort(NewStudentList);
		System.out.println(NewStudentList);
		}

}
