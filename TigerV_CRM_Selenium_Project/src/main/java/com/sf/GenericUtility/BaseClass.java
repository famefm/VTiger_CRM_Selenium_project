package com.sf.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sf.ObjectRepository.Homepage;
import com.sf.ObjectRepository.LoginPage;

public class BaseClass 
{
	public static ExtentTest test;
	public static ExtentReports reports;
	public static WebDriver driver;
	
	public JavaUtility tss = new JavaUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	public FileUtility futil = new FileUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	@BeforeSuite
	public void reportConfiguration()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport_"+tss.getSystemTime()+".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(futil.readingDataFromProperties("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(futil.readingDataFromProperties("username"));
		lp.getUserpassword().sendKeys(futil.readingDataFromProperties("password"));
		lp.getLoginButton().click();
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void logout()
	{
		Homepage hp =new Homepage(driver);
		wutil.mouseHover(driver, hp.getProfileIcon() );
		hp.getSignOut().click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup()
	{
		reports.flush();
	}
	

}
