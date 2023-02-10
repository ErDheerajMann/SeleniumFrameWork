package org.web.automationLibrary;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String applicationConfigReader(String key) throws IOException {
		File f= new File("./ConfigrationFiles/ApplicationConfig.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String elementLocators(String key) throws IOException {
		File f= new File("./ElementLocator/ElementLocators.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

}
