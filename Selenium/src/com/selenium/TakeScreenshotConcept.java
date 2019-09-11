package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // navigates to the Browser
		driver.get("http://www.google.com");

		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // It will wait till page load fully
		
		//Take screenshot and store as file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//copy screen shot to the desired folder
		FileUtils.copyFile(src, new File("E:\\abc\\SS1.png"));
	}

}
