package com.java.Day5_30thMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic7_MoreConcepts_Automation {

	// Open multiple Tabs in same Window
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		
		driver.close();
		driver.quit();
		

	}

}
