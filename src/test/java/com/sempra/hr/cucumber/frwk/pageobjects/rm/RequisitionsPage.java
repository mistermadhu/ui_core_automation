package com.sempra.hr.cucumber.frwk.pageobjects.rm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.sempra.hr.cucumber.frwk.pageobjects.ADPHomePage;

public class RequisitionsPage extends ADPHomePage {
	
	

	@FindBy(xpath="//nobr[text()='Reqs']")
	private WebElement reqs;
	@FindBy(xpath="//a[text()='Create:  Corp and Global']")
	private WebElement createCorpAndGlobal;
	
	public RequisitionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void click_Reqs() throws Exception{
		wu.isElementVisible(getDriver(), reqs);
		wu.clickWebElement(getDriver(), reqs);
	}
	
	public void click_CreateCorpAndGlobal() throws Exception{
		wu.isElementVisible(getDriver(), createCorpAndGlobal);
		wu.clickWebElement(getDriver(), createCorpAndGlobal);
	}

}
