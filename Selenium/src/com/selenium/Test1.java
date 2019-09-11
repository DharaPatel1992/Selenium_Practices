package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://ca.yahoo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String getTitle = driver.getTitle();
		System.out.println("Title of the current page is : " + getTitle);
	}

}
