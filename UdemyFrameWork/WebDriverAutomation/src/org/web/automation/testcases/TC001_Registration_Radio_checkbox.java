package org.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.web.automation.base.initDriver;

public class TC001_Registration_Radio_checkbox extends initDriver {

	@Test
	public void TC001() {

		driver.get("https://www.thetestingworld.com/testings");
		driver.findElement(By.xpath("//input[@value='office']")).click();
		
		Select country = new Select(driver.findElement(By.name("country")));
		
		country.selectByVisibleText("India");
		country.deselectAll();
	}
	
}
