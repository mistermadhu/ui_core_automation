package com.sempra.hr.cucumber.frwk.pageobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class HomePage extends BasePage{

	private WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(HomePage.class);
	public HomePage(WebDriver driver) {           
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	@FindBy(id ="Process_navItem_label")
	private WebElement  processMenu;
	@FindBy(xpath = "//span[text()='Additional Services']")
	private WebElement additionalServicesSubMenu;
	@FindBy(xpath = "//span[text()='Recruiting']")
	private WebElement recruitingMenuItem;
	@FindBy(id = "People_navItem_label")
	private WebElement peopleMenu ;
	@FindBy(xpath = ".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_9']/span[2]/span")
	private WebElement unknownElement ;
/*	@FindBy(xpath = ".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_5']/span[2]/span")
	private WebElement benefitsItem;*/
	public By benefitsItemBy = By.xpath(".//*[@id='revit_layout_TabContainer_2_tablist_dijit_layout_ContentPane_9']/span[2]/span");
	private By employeeCellInTableGrid= By.name("newSearch:tableGridForm:empId");
	@FindBy(xpath = ".//*[@id='People_ttd_pracChangeBenefits']/span[2]")
	private WebElement lifeEventsMenuItem ;
	@FindBy(xpath = ".//*[@id='ajaxId']")
	private WebElement searchButton;
	@FindBy(id = "tableGrid_row_0_cell_1_hyperlink")
	private WebElement empLastNameLink ;
	@FindBy(id = "employeeSearchDialogOkButton_label")
	private WebElement okButtonPopup;
	@FindBy(id = "changeBenefitsLink_label")
	private WebElement reportLifeEventLink;
	@FindBy(xpath = ".//*[@id='widget_changeBenefitsSelect']/div[1]/input")
	private WebElement dropdown;
	@FindBy(id = "changeBenefitsSelect_popup1")
	private WebElement dropdownSelect ;
	@FindBy(id = "eventDate")
	private WebElement dateTextBox;
	@FindBy(xpath = ".//*[@id='doneButton_label']")
	private WebElement submitReportLifeEvent;
	@FindBy(id = "submitButton2_label")
	private WebElement submitAgain;
	@FindBy(id = "revit_form_Button_4_label")
	//	private WebElement  Submit = By.xpath("//*[@id='submitButton2']");
	private WebElement adminCorrectionlink;
	@FindBy(id = "addEligibilitySummaryLink")
	private WebElement eligibilitySummarylink;
	private String portalFrameID="portalIFrame_iframe";// conver to By

	
	public  void click_ProcessMenu() throws Exception {

		isElementVisible(driver,processMenu);
		processMenu.click();

	}


	public  void click_AdditionalServicesSubMenu() throws Exception {
		isElementVisible(driver,additionalServicesSubMenu);
		additionalServicesSubMenu.click();

	}

	public  void click_RecruitingMenuItem() throws Exception {
		isElementVisible(driver,recruitingMenuItem);
		recruitingMenuItem.click();

	}

	public  void click_PeopleMenu() throws Exception {
		isElementPresent(driver,By.id(portalFrameID));
		isElementClickable(driver,peopleMenu);
		peopleMenu.click();
		logger.debug("People Menu is clicked");
		//isElementVisible(driver,unknownElement);

	}

	public  void click_Benefits() throws Exception {  
		WebElement benefitsItem=driver.findElement(benefitsItemBy);  // Chrome and other browser getting flaky without this
		isElementClickable(driver,benefitsItem);
		benefitsItem.click();
		
		/*WebElement ele = driver.findElement(benefitsItemBy);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);*/
	}

	public  void click_LifeEventsMenuItem() throws Exception {

		isElementClickable(driver,lifeEventsMenuItem);
		lifeEventsMenuItem.click();

	}
	

	public  void enter_EmployeeID(String empid) throws Exception {
		 isElementPresent(driver,By.id(portalFrameID));
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(portalFrameID); 
		 isElementPresent(driver,employeeCellInTableGrid);
		 driver.findElement(employeeCellInTableGrid).click();
		 driver.findElement(employeeCellInTableGrid).sendKeys(empid); 
	}

	public  void click_SearchEmployee() throws Exception {

		isElementVisible(driver,searchButton);
		searchButton.click();

	}

	public  void click_EmployeeLastName() throws Exception {

		isElementVisible(driver,empLastNameLink);
		empLastNameLink.click();

	}

	public  void click_Ok() throws Exception {
		isElementVisible(driver,okButtonPopup);
	    okButtonPopup.click();
	}

	public  void click_ReportLifeEventLink() throws Exception {

		isElementVisible(driver,reportLifeEventLink);
		reportLifeEventLink.click();
	}

	public  void click_Dropdown() throws Exception {
		isElementVisible(driver,dropdown);
	    dropdown.click();
		isElementVisible(driver,dropdownSelect);
		dropdownSelect.click();

	}

	public  void selectDate() throws Exception {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String date = df.format(new Date());
		logger.info("Current date="+date);
		isElementVisible(driver,dateTextBox);
		dateTextBox.sendKeys(date);
	}

	public  void clickSubmitReportLifeEvent() throws Exception {
		isElementClickable(driver,submitReportLifeEvent);
		submitReportLifeEvent.click();
	}

	public  void clickSubmitAgain() throws Exception {
		isElementClickable(driver,submitAgain);
		submitAgain.click();
	}

	public  void clickAdminCorrection() throws Exception {
		isElementPresent(driver,By.id(portalFrameID));
		isElementVisible(driver,adminCorrectionlink);
		adminCorrectionlink.click();

	}

	public  void clickEligibilitySummary() throws Exception {
		isElementVisible(driver,eligibilitySummarylink);
		eligibilitySummarylink.click();

	}
	
}
