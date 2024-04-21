package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class RegistrationForm extends BaseClass {
	
	public RegistrationForm(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")   
	public WebElement firstNameField;
	
	@FindBy(id="lastName") 
	public WebElement lastNameField;
	
	@FindBy(id="userEmail") 
	public WebElement emailField;
	
	@FindBy(id="submit") 
	public WebElement submitBtn;
	
	
}
