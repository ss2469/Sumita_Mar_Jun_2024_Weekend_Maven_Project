package com.test.Day8_7thApril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic_Xpaths {
	
	/* Syntax of Basic Xpaths
	 * **********************
	 * 
	 *  Syntax no 1 - //html[@attribute = 'valueOfAttribute']
	 *  
	 *  ( id, name, class )
	 *  
	 * Syntax no 2 - //html[@attribute1 = 'valueOfAttribute' and @attribute2 = 'valueOfAttribute']
	 * 
	 * Syntax no 3 - //html[@attribute1 = 'valueOfAttribute' or @attribute2 = 'valueOfAttribute']
	 * 
	 * Syntax no 4 - {ONLY for links (<a> tag)}
	 * 				//html[text() = 'textOfTheLink']
	 * 
	 * Syntax no 5 - //html[contains(text(), 'textOfTheLink')]
	 * 
	 * Syntax no 6 - //html[contains(@attribute, 'valueOfTheAttribute')]
	 * 
	 * Syntax no 7 - //html[starts-with(@attribute, 'valueOfTheAttributeStartingPointWhichIsFixed']
	 * 
	 * Syntax no 8 - //html[ends-with(@attribute, 'valueOfTheAttributeEndingPointWhichIsFixed']
	 */
	
	
	public WebDriver driver;
	
	@Test
	public void registerTutorialsNinja() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Register']")).click(); // 1 of 3
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@class = 'form-control' and @name = 'email']")).sendKeys("sumita2469@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type, 'tel')]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("seleniumpractice");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("seleniumpractice");
		
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		//driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[contains(text(), 'Continue')]")).click();
	}
	
	
	

}
