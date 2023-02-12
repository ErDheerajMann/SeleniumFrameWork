package org.web.automation.CommonActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {


		
		public static void simpleDropDownList(WebDriver driver, String e) {
			
			driver.findElement(By.xpath(e)).click();
			
			Select country = new Select(driver.findElement(By.name("country")));
			
			List<WebElement> list = country.getOptions();
			
			for(WebElement ele: list) {
				System.out.println(ele.getText());
			}
			

	}

}
