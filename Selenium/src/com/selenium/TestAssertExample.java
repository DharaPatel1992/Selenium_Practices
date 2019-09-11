package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertExample {
	SoftAssert obj = new SoftAssert();

	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://www.roicians.com/contact-us/");
		String pageTitle = driver1.getTitle();
		obj.assertEquals(pageTitle, "yahoo");
		driver1.close();/*
						 * This line wont be executed as assert failing will stop then and there
						 */
		obj.assertAll();

	}
}