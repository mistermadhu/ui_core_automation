package com.sempra.hr.cucumber.frwk.pageobjects.benefits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.pageobjects.ADPHomePage;

public class EnrollmentsPage extends ADPHomePage {
	private static final Logger logger = LoggerFactory.getLogger(EnrollmentsPage.class);
	@FindBy(id = "revit_form_Button_4_label")
	// private WebElement Submit = By.xpath("//*[@id='submitButton2']");
	private WebElement adminCorrectionlink;
	@FindBy(id = "addEligibilitySummaryLink")
	private WebElement eligibilitySummarylink;

	public EnrollmentsPage(WebDriver driver) {
		super(driver);
	}

	public void clickAdminCorrection() throws Exception {
		wu.isElementPresent(getDriver(), By.id(portalFrameID));
		wu.clickWebElement(getDriver(), adminCorrectionlink);

	}

	public void clickEligibilitySummary() throws Exception {
		wu.clickWebElement(getDriver(), eligibilitySummarylink);

	}
}
