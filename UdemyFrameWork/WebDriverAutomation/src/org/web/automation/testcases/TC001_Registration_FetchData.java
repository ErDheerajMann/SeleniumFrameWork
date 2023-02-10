package org.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.web.automation.base.initDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Registration_FetchData extends initDriver {

	

	@Test
	public void TC001() {

		driver.get("https://www.thetestingworld.com/testings");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		

	}
	
	
}
