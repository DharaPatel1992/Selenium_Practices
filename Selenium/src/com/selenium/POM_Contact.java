package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_Contact {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.roicians.com/contact-us/");
		POM pom = new POM(driver);
		pom.typeUserName("Dhara");
		pom.typeEmail("abc@gmail.com");
		pom.typeSubject("good training");
		pom.typeMessage("Friendly environment");
		pom.clickSend();
		driver.close();
	}

}
