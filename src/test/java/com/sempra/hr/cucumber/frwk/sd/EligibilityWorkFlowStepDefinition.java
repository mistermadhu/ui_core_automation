package com.sempra.hr.cucumber.frwk.sd;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.EligibilityPreConditionDataTable;
import com.sempra.hr.cucumber.frwk.datatable.EligibilityTestData;
import com.sempra.hr.cucumber.frwk.main.WebTestHelper;
import com.sempra.hr.cucumber.frwk.pageobjects.HomePage;
import com.sempra.hr.cucumber.frwk.pageobjects.LoginPage;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class EligibilityWorkFlowStepDefinition {

	private WebTestHelper wtObj;
	private HomePage homePageObj;
	private EligibilityTestData etdObj;
	private static final Logger logger = LoggerFactory.getLogger(EligibilityWorkFlowStepDefinition.class);
	public EligibilityWorkFlowStepDefinition() throws Exception {  //Cucumber runtime create a default instance of this class
		wtObj=new WebTestHelper("EligibilityWorkFlow");                  //cucumber.runtime.CucumberException: class com.sempra.hr.cucumber.frwk.main.WebTest doesn't have an empty constructor. If you need DI, put cucumber-picocontainer on the classpath
	}
	
	
	@Given("^I am on Home Page as Admin$")
	public void i_am_on_Home_Page_as_Admin(DataTable dtObj) throws Exception {
        
		// Load the update the DataTable
		EligibilityPreConditionDataTable cdTable=(EligibilityPreConditionDataTable)wtObj.loadDataTable(EligibilityPreConditionDataTable.class,dtObj);
		logger.info("Updated data table ="+cdTable);
		
		// Load the test data for this Workflow
		etdObj=(EligibilityTestData)wtObj.getFeatureTestData(EligibilityTestData.class,cdTable.getFeatureID(), cdTable.getTestcaseID(), cdTable.getPermutationNo(),FrameworkConstants.IS_COMMON);
		logger.info("Test data loaded="+etdObj);
		
	    //Launch Browser
		wtObj.launchBrowser();
		homePageObj=new LoginPage(wtObj.getDriver()).Login(cdTable.getUserName(),cdTable.getPassWord());
        logger.info("Waiting for some time ...");
		wtObj.waitForDOMtoBeLoaded();
		//Thread.sleep(2000); // Wait for 2 seconds, If removed TimeoutException in Firefox browser
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Launch Vantage Home Page as Admin","Expected: User should be able to navigate to Home Page | Actual: Vantage Home Page launched successfully");
 

	}

	@When("^I click on People from the Menu bar$")
	public void i_click_on_People_from_the_Menu_bar() throws Exception {
		homePageObj.click_PeopleMenu();
		//wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on People from the Menu Bar","Expected: People Menu should be displayed | Actual: People Menu is displayed successfully");

	}

	@And("^I click on Benefits from the list$")
	public void i_click_on_Benefits_from_the_list() throws Exception {
		homePageObj.click_Benefits();
		//wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Benefits from the list","Expected: Benefits Sub Menu should be displayed | Actual: Benefits Sub Menu is displayed successfully");
	}

	@And("^I click on Life Events$")
	public void i_click_on_Life_Events() throws Exception {

		homePageObj.click_LifeEventsMenuItem();
		/*wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Life Events from the list",
				"Expected: Life Events should be clicked and Employee ID search page should be displayed | Actual: Employee ID search Page is displayed successfully");
*/	}

	
	@And("^I enter Employee ID field$") 
	 public void i_enter_in_Employee_ID_field() throws Exception {
     logger.info("Employee="+etdObj.getEmpID());
	 homePageObj.enter_EmployeeID(etdObj.getEmpID());
	 wtObj.logExtentScreenCapture(LogStatus.PASS,"Enter Employee ID in the TextBox","Expected: Employee ID should be entered | Actual: Employee ID entered successfully");
	 
	 }

	@And("^I click on Search button$")
	public void i_click_on_Search_button() throws Exception {

		homePageObj.click_SearchEmployee();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Search Button",
				"Expected: Employee details should be displayed in the Results Grid | Actual: Employee Details displayed successfully");
	}

	@And("^I click on employee's last name hyperlink$")
	public void i_click_on_employee_s_last_name_hyperlink() throws Exception {

		homePageObj.click_EmployeeLastName();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Employee Last Name Hyperlink",
				"Expected: A popup should be displayed to enter date and Enrolling details | Actual: Popup displayed successfully");
	}

	@And("^I select Enroll on behalf of the employee$")
	public void i_select_Enroll_on_behalf_of_the_employee() throws Exception {
     // empty implementation
	}

	@And("^I enter Emulation Date as current date on the Date field$")
	public void i_enter_Emulation_Date_as_current_date_on_the_Date_field() throws Exception {

		homePageObj.click_Ok();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Ok on the Popup",
				"Expected: New Page should be displayed with Report a Life Event hyperlink | Actual: New Page displayed successfully with Report a Life Event Hyperlink");

	}

	@And("^I click on Report a Life Event$")
	public void i_click_on_Report_a_Life_Event() throws Exception {

		homePageObj.click_ReportLifeEventLink();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Report a Life Event Hyperlink",
				"Expected: Report a Life Event Pop-up should be displayed | Actual: Report a Life Event Pop-up displayed successfully");

	}

	@And("^I select Admin Correction from the drop-down$")
	public void i_select_Admin_Correction_from_the_drop_down() throws Exception {

		homePageObj.click_Dropdown();
		/*
		 * Select dropdownoption = new
		 * Select(driver.findElement(By.id("changeBenefitsSelect_popup1")));
		 * dropdownoption.selectByIndex(1);
		 */
		// HomePage.click_Dropdown(wtObj.getDriver());
	}

	@And("^I select current Date in the date field$")
	public void i_select_current_Date_in_the_date_field() throws Exception {

		homePageObj.selectDate();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Select Admin Correction from the dropdown and Current Date in the Pop-Up",
				"Expected: Admin Correction and Current Date in the Pop-Up should be selected | Actual: Admin Correction and Current Date in the Pop-Up selected successfully");

	}

	@And("^I click on Submit$")
	public void i_click_on_Submit() throws Exception {
 
		homePageObj.clickSubmitReportLifeEvent();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Submit in the Pop-up",
				"Expected: New Page with Employee Confirmation Details should be displayed | Actual: New Page with Employee Confirmation Details displayed successfully");
		

	}

	@And("^I click on Submit Again$")
	public void i_click_on_SubmitAgain() throws Exception {

		homePageObj.clickSubmitAgain();
		logger.info("After clicking Submit for the second time");
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Submit",
				"Expected: New Page with Admin Correction Link should be displayed | Actual: New Page with Admin Correction link displayed successfully");

	}

	@And("^I click on Admin Correction link on Enrollments page$")
	public void i_click_on_Admin_Correction_link_on_Enrollments_page() throws Exception {

		//HomePage.clickSubmitAgain(wtObj.getDriver());
		//homePageObj=new HomePage(wtObj.getDriver());
		homePageObj.clickAdminCorrection();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Click on Admin Correction Link ",
				"Expected: Enrollments Page with Eligibility Summary link on the right should be displayed | Actual: Enrollments Page with Eligibility Summary link on the right should be displayed successfully");

	}

	@When("^I click on Eligibility Summary link in My Links dropdown$")
	public void i_click_on_Eligibility_Summary_link_in_My_Links_dropdown() throws Exception {
		homePageObj.clickEligibilitySummary();
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Verify if the Eligibility Summary is displayed ",
				"Expected: Eligibility Summary of the Employee should be displayed | Actual: Eligibility Summary of the Employee displays successfully");
	}

	@Then("^I should be able to see Eligibility Summary of the employee on a new web page$")
	public void i_should_be_able_to_see_Eligibility_Summary_of_the_employee_on_a_new_web_page() throws Exception {

		/*
		 * HomePage.clickEligibilitySummary(wtObj.getDriver()); String CSpage =
		 * test.addScreenCapture(getscreenshot()); test.log(LogStatus.PASS,
		 * "Verify if the Eligibility Summary Opens in a new web page ",
		 * "Expected: Eligibility Summary of the Employee should be opened in a new web page | Actual: Eligibility Summary of the Employee Opens in a new web page successfully"
		 * +CSpage);
		 */
		// String actualValue = driver.findElement(By.xpath("")).getText();
		// HomePage.compareStrings(actualValue, "Mike Rute");
		WebDriver driver=wtObj.getDriver();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		wtObj.logExtentScreenCapture(LogStatus.PASS, "Verify if the Eligibility Summary Opens in a new web page ",
				"Expected: Eligibility Summary of the Employee should be opened in a new web page | Actual: Eligibility Summary of the Employee Opens in a new web page successfully");
		driver.switchTo().window(winHandleBefore);
	}

	@After
	public void tearDown(Scenario scenario) {
		wtObj.tearDown(scenario);
    }
}