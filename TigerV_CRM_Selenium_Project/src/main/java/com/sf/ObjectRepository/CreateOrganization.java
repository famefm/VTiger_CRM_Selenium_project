package com.sf.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement addOrganization;
	
	@FindBy(name = "accountname")
	private WebElement organizationName;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement assigningTo;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement save;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement organizationTitle;
	
	
	public CreateOrganization(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddOrganization() {
		return addOrganization;
	}


	public WebElement getOrganizationName() {
		return organizationName;
	}


	public WebElement getAssigningTo() {
		return assigningTo;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getOrganizationTitle() {
		return organizationTitle;
	}
	
}
