package com.java.Day6_31stMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Topic1_control_statements {

	public static void main(String[] args) {
		// TODO: switch case

		decideWhichBrowser();

	}

	public static void decideWhichBrowser() {

		switch ("Decide which browser to be configured for my Automation") {

		case "Crome":
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("https://costco.com");
			break;

		case "Firefox":
			WebDriver driver2 = new FirefoxDriver();
			driver2.manage().window().maximize();
			driver2.get("https://www.rediff.com/");
			break;

		case "Edge":
			WebDriver driver3 = new EdgeDriver();
			driver3.manage().window().maximize();
			driver3.get("https://www.amazon.com/");
			break;

		default:
			WebDriver driver4 = new SafariDriver();
			driver4.manage().window().maximize();
			driver4.get("https://ca.yahoo.com");

		}

	}

}
