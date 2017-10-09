package com.sempra.hr.cucumber.frwk.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class BasePage {

	protected  void isElementVisible(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			//get Screenshot
		}catch(Exception e)
		{
			//Screenshot code
		}
	}
	protected  void isElementClickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			//get Screenshot
		}catch(Exception e)
		{
			//Screenshot code
		}
	}
	protected  void isElementPresent(WebDriver driver, By element) {

		WebDriverWait wait = new WebDriverWait(driver, FrameworkConstants.LARGE_TIMEOUT);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
			//get Screenshot
		}catch(Exception e)
		{
			//Screenshot code
		}
	}


}
