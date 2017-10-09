package com.sempra.hr.cucumber.frwk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class LoginPage extends BasePage {


	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id ="adminLogin")
	private WebElement  adminLoginLink;
	@FindBy(name = "USER")
	private WebElement userTxtBox;
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(id = "passwordForm:password")
	private WebElement passwordTxtBox ;
	/*@FindBy(id = "portal.login.logIn")
	private WebElement loginBtn ;*/

	
	public HomePage Login(String user, String password) throws Exception{
		
        this.isElementClickable(driver,adminLoginLink);
		adminLoginLink.click();
		this.isElementVisible(driver,userTxtBox);
		userTxtBox.sendKeys(user);
		this.isElementVisible(driver,submitBtn);
	    submitBtn.click();
		this.isElementVisible(driver,passwordTxtBox);
		passwordTxtBox.sendKeys(password);
		this.isElementVisible(driver,submitBtn);
	    submitBtn.click();
		return new HomePage(this.driver);
		
	}
}
