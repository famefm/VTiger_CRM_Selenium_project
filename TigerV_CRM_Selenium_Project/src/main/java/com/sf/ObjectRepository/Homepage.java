package com.sf.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sf.GenericUtility.BaseClass;
import com.sf.GenericUtility.WebDriverUtility;

public class Homepage 
{
	@FindBy(xpath = "//img[contains(@src,'user')]")
	private WebElement profileIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	
	@FindBy(linkText = "Contacts")
	private WebElement contacts;
	
	@FindBy(linkText = "Organizations")
	private WebElement organization;
	
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOrganization() {
		return organization;
	}

	
	
	
	
	
	
	
}
