package com.selenium;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestN {

	@Test
	public void Writetestcase() {
		System.out.println("First write test case");
	}
	@Test(priority=1)
	public void Execute_test() {
		System.out.println("Execute test case");
		throw new SkipException("not require");

	}
	@Test(priority=2,dependsOnMethods = {"Execute_test"})
	public void Defect_log() {
		System.out.println("Defect logging");
	}
}
