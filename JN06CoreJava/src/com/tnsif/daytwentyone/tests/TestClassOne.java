package com.tnsif.daytwentyone.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.tnsif.daytwentyone.businesslogic.Operations;

//@Disabled
@DisplayName("Using Parameterized Test Cases")
public class TestClassOne {
	
	@DisplayName("Test Case for Checking Palindrome Number")
	@ValueSource(ints= {121, 123,0})
	@ParameterizedTest
	public void testForPalindrome(int no)
	{
		Assertions.assertTrue(Operations.isPalindrome(no));
	}
	
	@DisplayName("Test Case for calculating factorial of a number")
	@CsvSource(value= {"0,1","4,24","-3,-1"})
	@ParameterizedTest
	public void testForFactorial(int no, long result)
	{
		long actual =Operations.getFactorial(no);
		Assertions.assertEquals(result, actual);
	}
}
