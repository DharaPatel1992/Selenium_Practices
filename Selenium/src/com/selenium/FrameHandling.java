package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://demo.guru99.com/test/guru99home/");
		// navigates to the page consisting an iframe

		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e"); // switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		// Clicks the iframe

		System.out.println("*********We are done***************");
	}

}
