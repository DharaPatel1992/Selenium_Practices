package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {

	WebDriver driver;
	By Uname = By.name("your-name");
	By Email = By.name("your-email");
	By Subject = By.name("your-subject");
	By Message = By.name("your-message");
	By Send = By.xpath("//input[@type='submit' and @value='Send']");

	public POM(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUserName(String userName) {
		driver.findElement(Uname).sendKeys(userName);
	}

	public void typeEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}

	public void typeSubject(String subject) {
		driver.findElement(Subject).sendKeys(subject);
	}

	public void typeMessage(String message) {
		driver.findElement(Message).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(Send).click();
	}
}
