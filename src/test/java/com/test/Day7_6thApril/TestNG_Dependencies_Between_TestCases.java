package com.test.Day7_6thApril;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Dependencies_Between_TestCases {
	
	// TestCase 1 has to Pass
	// For example: Test cases 2-9 are dependent on the result of TestCase 1
	// And TestCase 9 is dependent on TestCase 7 and 8's result
	
	/* How to establish dependencies between Test Cases ?
	 * 1. Priority has to be given
	 * 2. There is an annotation in TestNG dependsOnMethoods 
	 * 
	 * alwaysRun = true    // Used when we DON'T want to skip this test (which is depended on Other Test(s))
	 * enabled = false    // enabled == false SUPERCEEDS all other conditions
	 * 
	 * invocationCount = number
	 */
	
	
	@Test (priority = 1, invocationCount = 2)
	public void tc1() {
		
		System.out.println(" TC 1");
		Assert.fail();
	}
	
		
	@Test 
	public void tc10() {
		
		System.out.println(" TC 10");
		
		
	}
	
	@Test (priority = 3, dependsOnMethods = "tc10") 
	public void tc3() {
		
		System.out.println(" TC 3");
		
	}
	

}
