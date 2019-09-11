package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRoicians {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.roicians.com/contact-us/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Contact Us";
		driver.findElement(By.name("your-name")).sendKeys("Dhara");
		driver.findElement(By.name("your-email")).sendKeys("xyz@gmail");
		driver.findElement(By.name("your-subject")).sendKeys("good training");
		driver.findElement(By.name("your-message")).sendKeys("Really good training");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Send']")).click();
		Thread.sleep(5000);
		String actualResult = driver.findElement(By.cssSelector(".wpcf7-not-valid-tip")).getText();
		//String actualResult = driver.findElement(By.xpath("//span[@value='The e-mail address entered is invalid.']")).getText();
		
		System.out.println("Actual result is : " + actualResult);
		System.out.println(" Actual Title : " + actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Allow to proceeds");
		}else {
			System.out.println("Don't allow to proceeds");
		}
	}

}
