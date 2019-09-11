package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//1.xpath:
		/*
		 * driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("test");
		 * driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("test");
		 * driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(
		 * "0123456789");
		 */
		
		//2. id:u_0_l
		/*
		 * driver.findElement(By.id("u_0_e")).sendKeys("test");
		 * driver.findElement(By.id("u_0_g")).sendKeys("test");
		 * driver.findElement(By.id("u_0_j")).sendKeys("0123456789");
		 */	
		
		//3. name
		/*
		 * driver.findElement(By.name("firstname")).sendKeys("test");
		 * driver.findElement(By.name("lastname")).sendKeys("test");
		 * driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		 */
		
		//4. linktext
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//5. partial linktext
		//driver.findElement(By.partialLinkText("Create")).click();
		
		//6. css selector
		//driver.findElement(By.cssSelector("#u_0_q")).sendKeys("test");
		//driver.findElement(By.cssSelector(".inputtext _58mg _5dba _2ph-")).sendKeys("test");
		
		//7. class name
		//driver.findElement(By.className("_8esa")).click();
		
		//For drop down
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Nov");
	}

}
