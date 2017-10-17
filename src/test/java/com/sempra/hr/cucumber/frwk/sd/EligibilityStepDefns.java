package com.sempra.hr.cucumber.frwk.sd;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.EligibilityTestData;
import com.sempra.hr.cucumber.frwk.main.BasicStepDefns;
import com.sempra.hr.cucumber.frwk.pageobjects.benefits.EnrollmentsPage;
import com.sempra.hr.cucumber.frwk.pageobjects.benefits.LifeEventsPage;
import com.sempra.hr.cucumber.frwk.testdrivers.WebDriverFactory;
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
public class EligibilityStepDefns extends BasicStepDefns {

	private EligibilityTestData etdObj;
	private LifeEventsPage lePage;
	private EnrollmentsPage enrlPage;
	private static final Logger logger = LoggerFactory.getLogger(EligibilityStepDefns.class);

	public EligibilityStepDefns(WebDriverFactory driverFactory) throws Exception { // Cucumber runtime creates a default instance of this class
		super("EligibilityWorkFlow", driverFactory);
	}

	@Given("^I am on Home Page as Admin$")
	public void i_am_on_Home_Page_as_Admin(DataTable dtObj) throws Exception {
		// Initialize Scenario - setsPrecondition data, Launches the Browser, Logins as a given user & return Test data object
		etdObj=initializeScenario(EligibilityTestData.class, dtObj);
		// Initialize the Landing page after Login
		lePage=new LifeEventsPage(this.getDriver());
	}

	@When("^I click on People from the Menu bar$")
	public void i_click_on_People_from_the_Menu_bar() throws Exception {
		lePage.click_PeopleMenu();
		logExtentScreenCapture(LogStatus.PASS, "Click on People from the Menu Bar",
				"Expected: People Menu should be displayed | Actual: People Menu is displayed successfully");

	}

	@And("^I click on Benefits from the list$")
	public void i_click_on_Benefits_from_the_list() throws Exception {
		lePage.click_Benefits();
		logExtentScreenCapture(LogStatus.PASS, "Click on Benefits from the list",
				"Expected: Benefits Sub Menu should be displayed | Actual: Benefits Sub Menu is displayed successfully");
	}

	@And("^I click on Life Eventshun$")
	public void i_click_on_Life_Events() throws Exception {

		lePage.click_LifeEventsMenuItem();
		logExtentScreenCapture(LogStatus.PASS, "Click on Life Events from the list",
				"Expected: Life Events should be clicked and Employee ID search page should be displayed | Actual: Employee ID search Page is displayed successfully");
	}

	@And("^I enter Employee ID field$")
	public void i_enter_in_Employee_ID_field() throws Exception {
		logger.info("Employee=" + etdObj.getEmpID());
		lePage.enter_EmployeeID(etdObj.getEmpID());
		logExtentScreenCapture(LogStatus.PASS, "Enter Employee ID in the TextBox",
				"Expected: Employee ID should be entered | Actual: Employee ID entered successfully");

	}

	@And("^I click on Search button$")
	public void i_click_on_Search_button() throws Exception {

		lePage.click_SearchEmployee();
		logExtentScreenCapture(LogStatus.PASS, "Click on Search Button",
				"Expected: Employee details should be displayed in the Results Grid | Actual: Employee Details displayed successfully");
	}

	@And("^I click on employee's last name hyperlink$")
	public void i_click_on_employee_s_last_name_hyperlink() throws Exception {

		lePage.click_EmployeeLastName();
		logExtentScreenCapture(LogStatus.PASS, "Click on Employee Last Name Hyperlink",
				"Expected: A popup should be displayed to enter date and Enrolling details | Actual: Popup displayed successfully");
	}

	/*
	 * @And("^I select Enroll on behalf of the employee$") public void
	 * i_select_Enroll_on_behalf_of_the_employee() throws Exception { // empty
	 * implementation }
	 */
	@And("^I enter Emulation Date as current date on the Date field$")
	public void i_enter_Emulation_Date_as_current_date_on_the_Date_field() throws Exception {

		lePage.click_Ok();
		logExtentScreenCapture(LogStatus.PASS, "Click on Ok on the Popup",
				"Expected: New Page should be displayed with Report a Life Event hyperlink | Actual: New Page displayed successfully with Report a Life Event Hyperlink");

	}

	@And("^I click on Report a Life Event$")
	public void i_click_on_Report_a_Life_Event() throws Exception {

		lePage.click_ReportLifeEventLink();
		logExtentScreenCapture(LogStatus.PASS, "Click on Report a Life Event Hyperlink",
				"Expected: Report a Life Event Pop-up should be displayed | Actual: Report a Life Event Pop-up displayed successfully");

	}

	@And("^I select Admin Correction from the drop-down$")
	public void i_select_Admin_Correction_from_the_drop_down() throws Exception {

		lePage.click_Dropdown();
	}

	@And("^I select current Date in the date field$")
	public void i_select_current_Date_in_the_date_field() throws Exception {

		lePage.selectCurrentDate(this.getCurrentDate(FrameworkConstants.DATE_FORMAT1));
		logExtentScreenCapture(LogStatus.PASS,
				"Select Admin Correction from the dropdown and Current Date in the Pop-Up",
				"Expected: Admin Correction and Current Date in the Pop-Up should be selected | Actual: Admin Correction and Current Date in the Pop-Up selected successfully");

	}

	@And("^I click on Submit$")
	public void i_click_on_Submit() throws Exception {

		lePage.clickSubmitReportLifeEvent();
		logExtentScreenCapture(LogStatus.PASS, "Click on Submit in the Pop-up",
				"Expected: New Page with Employee Confirmation Details should be displayed | Actual: New Page with Employee Confirmation Details displayed successfully");

	}

	@And("^I click on Submit Again$")
	public void i_click_on_SubmitAgain() throws Exception {

		enrlPage = lePage.clickSubmitAgain();
		logger.info("After clicking Submit for the second time");
		logExtentScreenCapture(LogStatus.PASS, "Click on Submit",
				"Expected: New Page with Admin Correction Link should be displayed | Actual: New Page with Admin Correction link displayed successfully");

	}

	@And("^I click on Admin Correction link on Enrollments page$")
	public void i_click_on_Admin_Correction_link_on_Enrollments_page() throws Exception {

		// HomePage.clickSubmitAgain(getDriver());
		// homePageObj=new HomePage(getDriver());
		enrlPage.clickAdminCorrection();
		logExtentScreenCapture(LogStatus.PASS, "Click on Admin Correction Link ",
				"Expected: Enrollments Page with Eligibility Summary link on the right should be displayed | Actual: Enrollments Page with Eligibility Summary link on the right should be displayed successfully");

	}

	@When("^I click on Eligibility Summary link in My Links dropdown$")
	public void i_click_on_Eligibility_Summary_link_in_My_Links_dropdown() throws Exception {
		enrlPage.clickEligibilitySummary();
		logExtentScreenCapture(LogStatus.PASS, "Verify if the Eligibility Summary is displayed ",
				"Expected: Eligibility Summary of the Employee should be displayed | Actual: Eligibility Summary of the Employee displays successfully");
	}

	@Then("^I should be able to see Eligibility Summary of the employee on a new web page$")
	public void i_should_be_able_to_see_Eligibility_Summary_of_the_employee_on_a_new_web_page() throws Exception {
		WebDriver driver = getDriver();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		logExtentScreenCapture(LogStatus.PASS, "Verify if the Eligibility Summary Opens in a new web page ",
				"Expected: Eligibility Summary of the Employee should be opened in a new web page | Actual: Eligibility Summary of the Employee Opens in a new web page successfully");
		driver.switchTo().window(winHandleBefore);
        
		// Set test case status as pass
		passTestCase();
	}
	
	
   @After
     public void tearDown(Scenario scenario)
     {
		super.tearDown(scenario);
     }

}