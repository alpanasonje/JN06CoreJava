package com.tnsif.daytwentyone.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import com.tnsif.daytwentyone.businesslogic.Operations;

@DisplayName("Sample Test Cases")
public class MyTestClass {
	@DisplayName("Positive number test case")

	@Test
	public void testForPositive() {
		// System.out.println(Operations.isPositive(-5));
		Assertions.assertTrue(Operations.isPositive(5));
	}

	@Test
	public void testForNegative() {
		// System.out.println(Operations.isPositive(-5));
		Assertions.assertFalse(Operations.isPositive(-5));
	}

	// test for factorial of negative number
	@Test
	public void testForFactorialOfNegativeNumber() {
		long expected = -1;
		long actual = Operations.getFactorial(-3);
		Assertions.assertEquals(expected, actual);
	}

	// test for factorial of zero
	@Test
	public void testForZeroFactorial() {
		long expected = 1;
		long actual = Operations.getFactorial(0);
		Assertions.assertEquals(expected, actual);
	}

	// test for factorial of positive number
	@Test
	public void testForFactorial() {
		long expected = 6;
		long actual = Operations.getFactorial(3);
		Assertions.assertEquals(expected, actual);
	}
}
