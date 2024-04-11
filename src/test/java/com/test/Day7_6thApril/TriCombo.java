package com.test.Day7_6thApril;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {
	
	@BeforeMethod
	public void beforeMethodLearning() {
		System.out.println("In BeforeMethod");	
	}
	
	@Test
	public void testCase1() {
		System.out.println("TestCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("TestCase2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("TestCase3");
	}
	
	@Test
	public void testCase4() {
		System.out.println("TestCase4");
	}
	
	@AfterMethod
	public void afterMethodLearning() {
		System.out.println("In AfterMethod");
	}

}
