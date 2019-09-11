package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		
		driver.findElement(By.linkText("Start here.")).click();
		/*
		 * driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).
		 * click();
		 * driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
		 * driver.findElement(By.id("ap_email")).sendKeys("pateldhara.mscit@gmail.com");
		 * driver.findElement(By.id("continue")).click();
		 */
	}

}
