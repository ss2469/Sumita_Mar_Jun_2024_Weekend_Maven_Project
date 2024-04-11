package com.test.Day7_6thApril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Prioritizing_TestCases {
	
public WebDriver driver; // this is a variable which is declared at a Class level
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test (priority = 1)
	public void loginWithValidCredentials() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		//driver.findElement(By.className("btn btn-primary")).click(); //Compound Classes not permitted
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		
		System.out.println("Execute 1st");
		
	}
	
	@Test(priority = 2)
	public void loginWithInvalidCredentials() {
		
		System.out.println("Execute 2nd");
		
	}
	
	@Test(priority = 3)
	public void loginWithInvalidEmail() {
		
		System.out.println("Execute 3rd");
		
	}
	
	@Test(priority = 4, enabled = false) // disable this testcase
	public void loginWithInvalidPassword() {
		
		System.out.println("Execute 4th");
		
	}
	
	@Test(priority = 5)
	public void loginWithNoCredentials() {
	
		System.out.println("Execute 5th");
	
	}

		
	@AfterMethod
	public void tesrDown() {
		driver.quit();
		
	}

}
