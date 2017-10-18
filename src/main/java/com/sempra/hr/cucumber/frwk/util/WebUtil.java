package com.sempra.hr.cucumber.frwk.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {

	private void isElementClickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			// get Screenshot
		} catch (Exception e) {
			// Screenshot code
		}
	}

	public void clickWebElement(WebDriver driver, WebElement element) {
		try {
			isElementClickable(driver, element);
			element.click();
		} catch (Exception e) {
			// Screenshot code
		}

	}

	public void sendKeysToWebElement(WebDriver driver, WebElement element, String text) {
		try {
			isElementVisible(driver, element);
			element.sendKeys(text);
		} catch (Exception e) {
			// Screenshot code
		}

	}

	public void isElementVisible(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			// get Screenshot
		} catch (Exception e) {
			// Screenshot code
		}
	}

	public void isElementPresent(WebDriver driver, By element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			// get Screenshot
		} catch (Exception e) {
			// Screenshot code
		}
	}
	
	public void selectValueFromDropDown(WebDriver driver, WebElement element, String text) {
		try {
			isElementVisible(driver, element);
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(text);
			} catch (Exception e) {
			// Screenshot code
		} 
	}
	
	public void iframesSwitchToChild(WebDriver driver,WebElement element) {
		
		try {
			isElementVisible(driver, element);
			driver.switchTo().frame(element);
			
		}catch (Exception e) {
			//get Screenshot
		}
	}
	
	public void iframesSwitchToParent(WebDriver driver) {
		
		try {
			driver.switchTo().defaultContent();
			
		}catch (Exception e) {
			//get Screenshot
		}
	}
	
	/*public void isEnabled(WebDriver driver,WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		
	}*/

}
