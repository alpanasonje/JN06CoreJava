package com.tnsif.daytwentyone.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_METHOD) //by default
@TestInstance(Lifecycle.PER_CLASS)
public class TestClass {
	@BeforeAll
	public void testOne() {
		System.out.println("This test case will execute before all test cases");
	}

	// @BeforeAll must be static when TestInstance is PER_METHOD
	/*
	 * @BeforeAll public static void testOne() {
	 * System.out.println("This test case will execute before all test cases"); }
	 */

	@AfterAll
	public void testTwo() {
		System.out.println("This test case will execute After all test cases");
	}

	// @AfterAll must be static when TestInstance is PER_METHOD

	/*
	 * @AfterAll public static void testTwo() {
	 * System.out.println("This test case will execute After all test cases"); }
	 */

	@BeforeEach
	public void testThree() {
		System.out.println("This test case will execute before each test cases");
	}

	@AfterEach
	public void testFour() {
		System.out.println("This test case will execute after each test cases");
	}

	@Test
	public void testFive() {
		System.out.println("This is Sample Test Case One : " + this);
	}

	@Test
	public void testSix() {
		System.out.println("This is Sample Test Case Two: " + this);
	}

	@Test
	public void testSeven() {
		System.out.println("This is Sample Test Case Three : " + this);
	}
}
