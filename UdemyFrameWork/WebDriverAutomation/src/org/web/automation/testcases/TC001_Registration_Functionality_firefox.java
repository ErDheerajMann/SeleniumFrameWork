package org.web.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.web.automation.base.initDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Registration_Functionality_firefox extends initDriver {



	@Test
	public void TC001() {
		
		driver.manage().window().maximize();

		driver.get("https://www.thetestingworld.com/testings");
		
		// write rest of the code
//		driver.quit();

	}
	
}
