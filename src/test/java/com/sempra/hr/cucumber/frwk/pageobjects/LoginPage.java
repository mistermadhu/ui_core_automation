package com.sempra.hr.cucumber.frwk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sempra.hr.cucumber.frwk.pageobjects.benefits.LifeEventsPage;
import com.sempra.hr.cucumber.frwk.util.WebUtil;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class LoginPage {

	private WebDriver driver;
	private WebUtil wu;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wu = new WebUtil();
	}

	@FindBy(id = "adminLogin")
	private WebElement adminLoginLink;
	@FindBy(name = "USER")
	private WebElement userTxtBox;
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(id = "passwordForm:password")
	private WebElement passwordTxtBox;
	/*
	 * @FindBy(id = "portal.login.logIn") private WebElement loginBtn ;
	 */

	public ADPHomePage Login(String user, String password) throws Exception {

		wu.clickWebElement(driver, adminLoginLink);
		wu.sendKeysToWebElement(driver, userTxtBox, user);
		wu.clickWebElement(driver, submitBtn);
		wu.sendKeysToWebElement(driver, passwordTxtBox, password);
		wu.clickWebElement(driver, submitBtn);
		return new ADPHomePage(this.driver);

	}
}
