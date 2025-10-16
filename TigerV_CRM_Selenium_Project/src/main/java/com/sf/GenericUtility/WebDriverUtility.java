package com.sf.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();

	}

	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();
	}

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void DragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public void doubleClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	public void selectdropdown(WebElement element, int intIndex) {
		Select s = new Select(element);
		s.selectByIndex(intIndex);
	}

	public void selectdropdown(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void selectdropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void getScreenShot(WebDriver driver) throws IOException {
		JavaUtility tss = new JavaUtility();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/" + tss.getSystemTime() + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}

	public void switchToWindow(WebDriver driver) {
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String ids : allWindowsId) {
			driver.switchTo().window(ids);
		}
	}

}
