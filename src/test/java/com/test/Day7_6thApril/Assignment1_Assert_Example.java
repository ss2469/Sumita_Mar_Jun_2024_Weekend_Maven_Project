package com.test.Day7_6thApril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_Assert_Example {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test(priority = 1)
	public void goingToLoginPage() {
		
		// Assert Page Title and Current URL of the Login Page
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		String expectedPageTitle = driver.getTitle();
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualPageTitle = "Account Login";
		String actualCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
		Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl);
	}
	
	@Test(priority = 2, enabled = false)
	public void clickOnRegisterOption() {
		
		// Assert the presence of Email Textbox, Password Textbox and Login Button
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		//WebElement loginButton = driver.findElement(By.)
		
	}
	
	
	@AfterMethod
	public void tesrDown() {
		driver.quit();
		
	}
	
	

}
