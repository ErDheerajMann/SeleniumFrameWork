package org.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Registration_FetchDataFromElement {

	WebDriver driver;

	@BeforeTest
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void TC001() {

		driver.get("https://www.thetestingworld.com/testings");
		String str = driver.findElement(By.className("displayPopup")).getText();
		System.out.println(str);

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
