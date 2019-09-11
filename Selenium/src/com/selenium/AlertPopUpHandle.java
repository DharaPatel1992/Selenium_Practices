package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert message " + alertText);

		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		} else {
			System.out.println("incorrect alert message");
		}

		alert.accept();// click on ok button

		// alert.dismiss();////click on cancel button
	}

}
