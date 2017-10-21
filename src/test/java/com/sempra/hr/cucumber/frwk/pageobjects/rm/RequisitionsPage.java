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
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[2]/span/span/a")
	private WebElement createUtilitiesMenuItem; 
	public RequisitionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void click_Reqs() throws Exception{
		wu.clickWebElement(getDriver(), reqs);
	}
	
	public void click_CreateCorpAndGlobal() throws Exception{
		wu.clickWebElement(getDriver(), createCorpAndGlobal);
	}
    public  void click_CreateUtilities() throws Exception {
		wu.clickWebElement(getDriver(), createUtilitiesMenuItem);
   }  

}
