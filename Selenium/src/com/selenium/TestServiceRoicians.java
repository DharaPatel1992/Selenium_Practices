package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestServiceRoicians {

	public static void main(String[] args) throws InterruptedException {
//http://www.roicians.com/get-a-quote/
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.roicians.com/get-a-quote/");
		driver.findElement(By.name("your-name")).sendKeys("Dhara");
		driver.findElement(By.name("your-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("checkbox-464")).click();
		driver.findElement(By.name("your-message")).sendKeys("Good training");
		driver.findElement(By.name("file-315")).sendKeys("‪E:\\download.jpeg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Send']")).click();

	}

}
