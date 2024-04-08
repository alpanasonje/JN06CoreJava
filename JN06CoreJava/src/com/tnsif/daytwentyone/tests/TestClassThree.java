//Program to generate dynamic test cases
package com.tnsif.daytwentyone.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.daytwentyone.businesslogic.Operations;

public class TestClassThree {
	
	@TestFactory
		public DynamicTest[] testOne()
	{
		return new DynamicTest[] {DynamicTest.dynamicTest("MyFirstDynamicTestCase",()->Assertions.assertTrue(5>0) ),
				DynamicTest.dynamicTest("MySecondDynamicTestCase",()-> Assertions.assertTrue(Operations.isPalindrome(121))),
				DynamicTest.dynamicTest("MyThirdDynamicTestCase",()->Assertions.assertEquals(120, Operations.getFactorial(5))),
				DynamicTest.dynamicTest("MyFourthDynamicTestCase",()->Assertions.fail())};
		
	}

}
