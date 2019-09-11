package com.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {
	@Test(dataProvider = "getData") // 2nd step
	public void Readdata(String username, String Password, String Expected, String Browser)// 3rd step
	{
		// input parameter should be same as defined in object array

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];// 1st step then link it to data provider
//1st Row
		data[0][0] = "Admin";
		data[0][1] = "Password";
		data[0][2] = "Error message";
		data[0][3] = "Mozilla";
//2nd Row
		data[1][0] = "Admin";
		data[1][1] = "Password";
		data[1][2] = "Error message";
		data[1][3] = "google";

//3rd Row
		data[2][0] = "Admin";
		data[2][1] = "Password";
		data[2][2] = "Error message";
		data[2][3] = "Internet Explorer";
		return data;
	}
}
