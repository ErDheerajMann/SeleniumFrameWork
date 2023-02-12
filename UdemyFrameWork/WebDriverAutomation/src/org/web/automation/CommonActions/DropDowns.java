package org.web.automation.CommonActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {


		
		public static void simpleDropDownList(WebDriver driver, WebElement e) {
			
			e.click();
			
			Select country = new Select(e);
			
			List<WebElement> list = country.getOptions();
			
			for(WebElement ele: list) {
				System.out.println(ele.getText());
			}
			

	}
		
		
		public static void selectFromDropDownVisibleText(WebDriver driver, WebElement e , String visibleText) {
			
			e.click();
			
			Select country = new Select(e);
			country.selectByVisibleText("India");
			
			

	}
		
		

}
