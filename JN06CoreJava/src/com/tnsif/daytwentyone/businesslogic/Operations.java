package com.tnsif.daytwentyone.businesslogic;

public class Operations {

	public static boolean isPositive(int no) {
		/*
		 * if (no>=0) return true; else return false;
		 */
		return no >= 0;
	}

	public static long getFactorial(int no) {
		long f = 1;
		if (no < 0)
			return -1;
		for (int i = 1; i <= no; i++)
			f = f * i;
		return f;
	}

}
