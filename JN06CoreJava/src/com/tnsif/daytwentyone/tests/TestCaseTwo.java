package com.tnsif.daytwentyone.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.tnsif.daytwentyone.businesslogic.Operations;

public class TestCaseTwo {
	@Test
	public void testForNull() {
		Assertions.assertNull(Operations.isNull());
	}

	@Test
	public void testForAssumptionsOne() {
		int n = 4;
		Assumptions.assumeTrue(n > 0);
		System.out.println("This will continue....");
	}

	@Test
	public void testForAssumptionsTwo() {
		int n = -4;
		Assumptions.assumeTrue(n > 0);
		System.out.println("This will continue....");		
	}

	@Test
	public void testForAssumingThat() {
		int n = 5;
		Assumptions.assumingThat(n == 5, new MyExecutable(n));
	}

}

class MyExecutable implements Executable
{
	int n;

	public MyExecutable(int n) {
		this.n = n;
	}

	@Override
	public void execute() throws Throwable {
		System.out.println("Number is " + n);

	}

}