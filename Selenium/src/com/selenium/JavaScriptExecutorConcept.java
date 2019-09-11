package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");

		// Locating departure date calendar
		WebElement element = driver.findElement(By.id("datepicker"));
		String dateVal = "30/09/2019";
		
		setDateUsingJavaScriptInCalendar(driver, dateVal, element);

	}
	public static void setDateUsingJavaScriptInCalendar(WebDriver driver, String dateVal, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String script = "arguments[0].setAttribute('value','" + dateVal + "');";
		jse.executeScript(script, element);
	}

}
