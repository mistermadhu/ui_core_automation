package com.sempra.hr.cucumber.frwk.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.util.WebUtil;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class ADPHomePage {
	private WebDriver driver;
	protected WebUtil wu;
	@FindBy(id = "People_navItem_label")
	private WebElement peopleMenu;
	private By benefitsItemBy = By
			.xpath(".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_9']/span[2]/span");
	@FindBy(xpath = ".//*[@id='People_ttd_pracChangeBenefits']/span[2]")
	private WebElement lifeEventsMenuItem;
	protected String portalFrameID = "portalIFrame_iframe";// convert to By
	private static final Logger logger = LoggerFactory.getLogger(ADPHomePage.class);

	public ADPHomePage(WebDriver driver) {
		this.driver = driver;
		wu = new WebUtil();
		PageFactory.initElements(driver, this);
	}

	protected WebDriver getDriver() {
		return this.driver;
	}

	public void click_PeopleMenu() throws Exception {
		wu.isElementPresent(driver, By.id(portalFrameID)); // for Firefox
		wu.clickWebElement(getDriver(), peopleMenu);
		logger.debug("People Menu is clicked");
		// isElementVisible(driver,unknownElement);

	}

	public void click_Benefits() throws Exception {
		WebElement benefitsItem = driver.findElement(benefitsItemBy); // Chrome
																		// and
																		// other
																		// browsers
																		// get
																		// flaky
																		// without
																		// this
		wu.clickWebElement(getDriver(), benefitsItem);
	}

	public void click_LifeEventsMenuItem() throws Exception {

		wu.clickWebElement(getDriver(), lifeEventsMenuItem);

	}

}

// @FindBy(id ="Process_navItem_label")
// @FindBy(xpath = "//span[text()='Additional Services']")
/*
 * @FindBy(xpath =
 * ".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_5']/span[2]/span")
 * private WebElement benefitsItem;
 */
