package com.sf.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name = "user_name")
	private WebElement userName;
	
	@FindBy(name = "user_password")
	private WebElement userPassword;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getUserpassword() {
		return userPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
