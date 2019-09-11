package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://demo.guru99.com/test/guru99home/");
		// navigates to the page consisting an iframe

		driver.manage().window().maximize(); //Maximize the window 
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //It will wait till page load fully 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Global wait. Wait for all the elements
	}

}
