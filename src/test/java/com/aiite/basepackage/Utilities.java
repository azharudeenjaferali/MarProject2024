package com.aiite.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

public class Utilities {

	public static void printCurrentDate() {
		System.out.println(LocalDateTime.now());
	}
	
	public static String readProperty(String key) throws IOException{
		File file = new File("C:\\Users\\Dell\\eclipse-workspace\\WebAutomation\\src\\test\\resources\\PropertyFiles\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
}
