package org.web.automation.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.web.automation.CommonActions.DropDowns;
import org.web.automation.base.initDriver;
import org.web.automationLibrary.CaptureScreenShot;
import org.web.automationLibrary.PropertyReader;

public class TC001_Registration_Radio_SelectTag extends initDriver {

	@Test
	public void TC001() throws IOException {

		driver.get(PropertyReader.applicationConfigReader("App_URL"));
		driver.manage().window().maximize();
		CaptureScreenShot.takeScreenShot(driver, "homePage");
		
		WebElement countryDropDown=driver.findElement(By.name(PropertyReader.elementLocators("countryDropDown")));
		
		DropDowns.simpleDropDownList(driver, countryDropDown);
		DropDowns.selectFromDropDownVisibleText(driver, countryDropDown, "India");
		
		

	}

}
