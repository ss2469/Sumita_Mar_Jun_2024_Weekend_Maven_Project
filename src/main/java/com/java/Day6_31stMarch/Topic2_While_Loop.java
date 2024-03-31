package com.java.Day6_31stMarch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/* when the end point is not clear
 * when something tends to infinity we use while loop
 * 
 * cnn.com or bbc.com
 * Find the total number of links today
 */
public class Topic2_While_Loop {

	public static void main(String[] args) {
		// TODO Find the total number of links today - cnn.com
		//cnnDotComTotalLinksToday();
		
		
		print20MultiplesOf5AndCalculateTheSumOfTheMultiples();
		
	}
	
	
	public static void print20MultiplesOf5AndCalculateTheSumOfTheMultiples() {
		
		//5, 10, 15,  ...... 100
		//5 + 10 + 15 + 20 +.........+ 100 = ??
		
		
		int i = 1;
		
		int sum = 0;
		
		while(i<=20) {
			
			int j = i*5;
			System.out.println(j);
			i++;
			sum = sum + j;
		}
		
		System.out.println((sum));
				
	}
	
		
	/*public static void cnnDotComTotalLinksToday() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links present today is : " + totalLinks.size());
		
		
	}*/
	
}
	