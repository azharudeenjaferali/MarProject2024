package com.aiite.basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

public static WebDriver driver;
	
	public static void browserLaunch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	public static void browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("unregonized browser");
		}
		
		driver.manage().window().maximize();
	}
	
	
	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static WebElement searchElementById(String id){
		return driver.findElement(By.id(id));
	}
	
	public static WebElement searchElementByXpath(String xpath){
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	
	public static String getCurrentUrl(){
		return driver.getCurrentUrl();
	}
}
