package com.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTestProperties {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Dhara Patel\\eclipse-workspace\\Selenium\\src\\com\\selenium\\test.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		String url = prop.getProperty("URL");
		System.out.println(url);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver(); // navigates to the Browser

		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver(); // navigates to the Browser
		}
		driver.get(url);

		driver.findElement(By.name("firstname")).sendKeys("fname");
		driver.findElement(By.name("lastname")).sendKeys("lname");
		driver.findElement(By.name("reg_email__")).sendKeys("mobileNo");
		driver.findElement(By.name("reg_passwd__")).sendKeys("passwd");

	}

}
