package com.test.Day8_7thApril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day8_Assignment2_Xpaths {

	// Q Write 20 different Xpaths for 'grievances' link on rediff.com

	/* /html/body/div[7]/a[11] */
	// a[ @href ='https://www.rediff.com/grievances.html' ]
	// a[ contains(text(), 'Grievances') ]
	// a[ contains(@href, 'https://www.rediff.com/grievances.html') ]
	// div[ @class = 'footer alignC' ]/child::a[11]
	// div[ @class = 'footer alignC' ]/child::a[text() = 'Grievances']
	// div[@class = 'footer alignC']/descendant::a[text() = 'Grievances']
	// a[text() = 'Terms of use']/following-sibling::a
	// a[text() = 'Disclaimer']/following::a[text() = 'Grievances']
	// noscript/preceding-sibling::div/a[text() = 'Grievances']
	// noscript/preceding::div/a[text() = 'Grievances']
	// div[ @id ='red_container_main' ]/following-sibling::div[contains (@class, 'footer alignC')]/a[text()='Grievances']
	// div[@class = 'navbar']/following-sibling::div[contains (@class, 'footer alignC')]/a[text()='Grievances']
	// body/div[@class = 'footer alignC']/a[text() = 'Grievances']
	// input[@id = 'OAS_subsection']/following-sibling::div[@class = 'footer alignC']/a[text() = 'Grievances']
	// input[@id = 'OAS_subsection']/following::a[text() = 'Grievances']
	
	// div[@id = 'ob-explore-more']/preceding-sibling::div[@class = 'footer alignC']/a[text() = 'Grievances']
	// div[@id = 'ob-explore-more']/preceding::a[text() = 'Grievances']
	// div[@id = 'ob-explore-more']/parent::body/div[@class = 'footer alignC']/a[text() = 'Grievances']
	// div[@id = 'ob-explore-more']/ancestor::body/div[@class = 'footer alignC']/a[text() = 'Grievances']

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}

	@Test(priority = 1)
	public void rediffGrievancesClick1() {

		driver.findElement(By.xpath("//a[ text() = 'Grievances' ]")).click();

	}

	@Test(priority = 2)
	public void rediffGrievancesClick2() {

		driver.findElement(By.xpath("/html/body/div[7]/a[11]")).click();

	}

	@Test(priority = 3)
	public void rediffGrievancesClick3() {

		driver.findElement(By.xpath("//a[ @href ='https://www.rediff.com/grievances.html' ]")).click();

	}

	@Test(priority = 4)
	public void rediffGrievancesClick4() {

		driver.findElement(By.xpath("//a[ contains(text(), 'Grievances') ]")).click();

	}

	@Test(priority = 5)
	public void rediffGrievancesClick5() {

		driver.findElement(By.xpath("//div[ @class = 'footer alignC' ]/child::a[11]")).click();

	}

	@Test(priority = 6)
	public void rediffGrievancesClick6() {

		driver.findElement(By.xpath("//div[ @class = 'footer alignC' ]/child::a[text() = 'Grievances']")).click();

	}

	@Test(priority = 7)
	public void rediffGrievancesClick7() {

		driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Grievances']")).click();

	}

	@Test(priority = 8)
	public void rediffGrievancesClick8() {

		driver.findElement(By.xpath("//a[text() = 'Terms of use']/following-sibling::a")).click();

	}

	@Test(priority = 9)
	public void rediffGrievancesClick9() {

		driver.findElement(By.xpath("//a[text() = 'Disclaimer']/following::a[text() = 'Grievances']")).click();

	}

	@Test(priority = 10)
	public void rediffGrievancesClick10() {

		driver.findElement(By.xpath("//noscript/preceding-sibling::div/a[text() = 'Grievances']")).click();

	}

	@Test(priority = 11)
	public void rediffGrievancesClick11() {

		driver.findElement(By.xpath("//noscript/preceding::div/a[text() = 'Grievances']")).click();

	}

	@Test(priority = 12)
	public void rediffGrievancesClick12() {

		driver.findElement(By.xpath(
				"//div[ @id ='red_container_main' ]/following-sibling::div[contains (@class, 'footer alignC')]/a[text()='Grievances']"))
				.click();
	}

	@Test(priority = 13)
	public void rediffGrievancesClick13() {

		driver.findElement(By.xpath(
				"//div[@class = 'navbar']/following-sibling::div[contains (@class, 'footer alignC')]/a[text()='Grievances']"))
				.click();
	}

	@Test(priority = 14)
	public void rediffGrievancesClick14() {

		driver.findElement(By.xpath("//body/div[@class = 'footer alignC']/a[text() = 'Grievances']")).click();
	}

	@Test(priority = 15)
	public void rediffGrievancesClick15() {

		driver.findElement(By.xpath(
				"//input[@id = 'OAS_subsection']/following-sibling::div[@class = 'footer alignC']/a[text() = 'Grievances']"))
				.click();
	}

	@Test(priority = 16)
	public void rediffGrievancesClick16() {

		driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following::a[text() = 'Grievances']")).click();
	}

	@Test(priority = 17)
	public void rediffGrievancesClick17() {

		driver.findElement(By.xpath(
				"//div[@id = 'ob-explore-more']/preceding-sibling::div[@class = 'footer alignC']/a[text() = 'Grievances']"))
				.click();
	}

	@Test(priority = 18)
	public void rediffGrievancesClick18() {

		driver.findElement(By.xpath("//div[@id = 'ob-explore-more']/preceding::a[text() = 'Grievances']")).click();
	}

	@Test(priority = 19)
	public void rediffGrievancesClick19() {

		driver.findElement(By.xpath(
				"//div[@id = 'ob-explore-more']/parent::body/div[@class = 'footer alignC']/a[text() = 'Grievances']"))
				.click();
	}

	@Test(priority = 20)
	public void rediffGrievancesClick20() {

		driver.findElement(By.xpath(
				"//div[@id = 'ob-explore-more']/ancestor::body/div[@class = 'footer alignC']/a[text() = 'Grievances']"))
				.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
