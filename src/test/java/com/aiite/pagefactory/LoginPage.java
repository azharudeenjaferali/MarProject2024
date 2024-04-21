package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")    //driver.findElement(By.
	public WebElement userNameField;
	
	@FindBy(id="pass") 
	public WebElement passWordField;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Messenger']")
	public WebElement messengerLink;
	
	@FindBy(xpath="//a[text()='Try another way']")
	public WebElement errorBtn; 

}
