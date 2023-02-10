package org.web.automation.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.web.automationLibrary.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class initDriver {

	public WebDriver driver;

	@BeforeTest
	public void startBrowser() throws IOException {
		if(PropertyReader.applicationConfigReader("Browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(PropertyReader.applicationConfigReader("Browser").equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		driver=null;
	}

}
