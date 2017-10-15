package com.sempra.hr.cucumber.frwk.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

}
