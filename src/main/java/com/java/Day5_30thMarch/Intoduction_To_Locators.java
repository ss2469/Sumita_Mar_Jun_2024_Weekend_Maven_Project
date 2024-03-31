
package com.java.Day5_30thMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intoduction_To_Locators {

	/* In Selenium 3 there are 11locators
	 * In Selenium 4 there are 16 locators
	 * Most widely used - 8 locators
	 * id
	 * class - multiple attribute values
	 * name
	 * xpath
	 * cssSelectors
	 * linkText
	 * partiallinkText
	 * tagname (used in case of multiple webelements)
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//rediffSignIn();
		tutorialsNinjaRegister();
		tutorialsNinjaRegister();
		
	}
	
	//TODO: create tutorialsNinjaRegister() and tutorialsNinjaLogin()
	
	public static void tutorialsNinjaRegister() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();	
	}
	
	public static void tutorialsNinjaLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	
	
	//TODO: Write code for rediffSignIn()
	public static void rediffSignIn() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();	
	}

	
	
}
