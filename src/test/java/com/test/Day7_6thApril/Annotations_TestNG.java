package com.test.Day7_6thApril;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_TestNG {
	
	@BeforeSuite
	public void beforeSuiteLearning() {
		System.out.println("1st goto Suite");
	}
	
	@BeforeTest
	public void beforeTestLearning() {
		System.out.println("2nd goto Test");
	}
	
	@BeforeClass
	public void beforeClassLearning() {
		System.out.println("3rd goto Class");
	}
	
	@BeforeMethod
	public void beforeMethodLearning() {
		System.out.println("4th goto Method");	
	}
	
	@Test
	public void test1Learning() {
		System.out.println("We are in our TestCase1");
	}
	
	@AfterMethod
	public void afterMethodLearning() {
		System.out.println("After 1st goto Method");
	}
	
	@AfterClass
	public void afterClassLearning() {
		System.out.println("After 2nd goto Class");
	}
	@AfterTest
	public void afterTestLearning() {
		System.out.println("After 3rd goto Test");
	}
	
	@AfterSuite
	public void afterSuiteLearning() {
		System.out.println("After 4th goto Suite");
	}
	

}
