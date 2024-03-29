package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); // navigates to the Browser
		driver.get("http://techcanvass.com/Examples/webtable.html");

		WebElement webtable = driver.findElement(By.xpath("html/body"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));

		// Finding and printing number of columns
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));

		System.out.println("Number of columns:" + columns.size());

		// Finding & Printing the column headings

		for (int rnum = 1; rnum <= rows.size(); rnum++) {
			for (int colnum = 1; colnum <= columns.size(); colnum++) {
				if (rnum == 1) {
					System.out.println(
							driver.findElement(By.xpath(".//*[@id='t01']/tbody/tr[" + rnum + "]/th[" + colnum + "]"))
									.getText());
				} else {
					System.out.println(
							driver.findElement(By.xpath(".//*[@id='t01']/tbody/tr[" + rnum + "]/td[" + colnum + "]"))
									.getText());
				}
			}
		}

		driver.quit();
		Thread.sleep(6000);
		if (driver != null)
			driver.quit();

	}

}