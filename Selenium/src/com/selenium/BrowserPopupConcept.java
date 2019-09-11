package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserPopupConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://popuptest.com/");

		driver.findElement(By.linkText("Modeless Window")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id : " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child window id : " + childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		System.out.println("Child window pop up title :: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent window title :: " + driver.getTitle());

	}

}
