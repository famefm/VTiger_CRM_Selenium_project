package com.sf.GenericUtility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.INFO, "Test Execution Started!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Script is failed!!!!");
		TakesScreenshot ts= (TakesScreenshot) driver;
		String sc = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(sc);
		
		try {
			wutil.getScreenShot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}
