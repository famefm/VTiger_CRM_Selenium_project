package com.sf.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact 
{
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement addContacts;
	
	@FindBy(name = "lastname")
	private WebElement lastnameElement;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactTitle;
	
	public CreateContact(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddContacts() {
		return addContacts;
	}

	public WebElement getLastnameElement() {
		return lastnameElement;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getContactTitle() {
		return contactTitle;
	}
	
	
	
}
