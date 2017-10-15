package com.sempra.hr.cucumber.frwk.pageobjects.benefits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.pageobjects.ADPHomePage;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class LifeEventsPage extends ADPHomePage {

	private static final Logger logger = LoggerFactory.getLogger(LifeEventsPage.class);

	public LifeEventsPage(WebDriver driver) {
		super(driver);
	}

	private By employeeCellInTableGrid = By.name("newSearch:tableGridForm:empId");
	@FindBy(xpath = ".//*[@id='ajaxId']")
	private WebElement searchButton;
	@FindBy(id = "tableGrid_row_0_cell_1_hyperlink")
	private WebElement empLastNameLink;
	@FindBy(id = "employeeSearchDialogOkButton_label")
	private WebElement okButtonPopup;
	@FindBy(id = "changeBenefitsLink_label")
	private WebElement reportLifeEventLink;
	@FindBy(xpath = ".//*[@id='widget_changeBenefitsSelect']/div[1]/input")
	private WebElement dropdown;
	@FindBy(id = "changeBenefitsSelect_popup1")
	private WebElement dropdownSelect;
	@FindBy(id = "eventDate")
	private WebElement dateTextBox;
	@FindBy(xpath = ".//*[@id='doneButton_label']")
	private WebElement submitReportLifeEvent;
	@FindBy(id = "submitButton2_label")
	private WebElement submitAgain;

	public void enter_EmployeeID(String empid) throws Exception {
		// Wait for the frame to get loaded
		wu.isElementPresent(getDriver(), By.id(portalFrameID));
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(portalFrameID);
		wu.isElementPresent(getDriver(), employeeCellInTableGrid);
		getDriver().findElement(employeeCellInTableGrid).click();
		getDriver().findElement(employeeCellInTableGrid).sendKeys(empid);
		/*
		 * WebElement employeeCellWebElement=getDriver().findElement(
		 * employeeCellInTableGrid); // Issue with Firefox
		 * wu.clickWebElement(getDriver(),employeeCellWebElement);
		 * wu.sendKeysToWebElement(getDriver(),employeeCellWebElement,empid);
		 */
	}

	public void click_SearchEmployee() throws Exception {

		wu.clickWebElement(getDriver(), searchButton);

	}

	public void click_EmployeeLastName() throws Exception {
		wu.clickWebElement(getDriver(), empLastNameLink);
	}

	public void click_Ok() throws Exception {
		wu.clickWebElement(getDriver(), okButtonPopup);
	}

	public void click_ReportLifeEventLink() throws Exception {

		wu.clickWebElement(getDriver(), reportLifeEventLink);
	}

	public void click_Dropdown() throws Exception {
		wu.clickWebElement(getDriver(), dropdown);
		wu.clickWebElement(getDriver(), dropdownSelect);

	}

	public void selectCurrentDate(String date) throws Exception {
		logger.info("Current date=" + date);
		wu.sendKeysToWebElement(getDriver(), dateTextBox, date);
	}

	public void clickSubmitReportLifeEvent() throws Exception {
		wu.clickWebElement(getDriver(), submitReportLifeEvent);
	}

	public EnrollmentsPage clickSubmitAgain() throws Exception {
		wu.clickWebElement(getDriver(), submitAgain);
		return new EnrollmentsPage(getDriver());
	}

}
