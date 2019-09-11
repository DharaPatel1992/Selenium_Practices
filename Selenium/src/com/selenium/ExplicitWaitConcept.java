package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // It will wait till page load fully
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		ExplicitWait(driver, driver.findElement(By.id("loginbutton")), 20);
	}

	public static void ExplicitWait(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
