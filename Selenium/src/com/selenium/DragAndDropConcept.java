package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("//*[@id='credit2']/a")),
				driver.findElement(By.xpath("//*[@id='bank']/li"))).build().perform();

	}

}
