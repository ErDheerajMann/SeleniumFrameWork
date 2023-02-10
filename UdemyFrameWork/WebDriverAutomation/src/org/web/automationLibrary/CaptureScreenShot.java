package org.web.automationLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime().toString());

		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		File fd = new File("./ScreenShots/"+name+c.getTime().toString().replace(" ", "_").replace(":","_")+".png");
		FileUtils.copyFile(f, fd);
		
		

	}

}
