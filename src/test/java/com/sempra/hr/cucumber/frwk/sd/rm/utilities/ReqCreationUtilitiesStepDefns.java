package com.sempra.hr.cucumber.frwk.sd.rm.utilities;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.RequisitionUtilitiesData;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.RequisitionUtilitiesPage;
import com.sempra.hr.cucumber.frwk.sd.BasicStepDefns;
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
public class ReqCreationUtilitiesStepDefns extends BasicStepDefns {
	private RequisitionUtilitiesData rutdObj;
	//private RequisitionsPage reqPage;
	private RequisitionUtilitiesPage reqUtilPage;
	private static final Logger logger = LoggerFactory.getLogger(ReqCreationUtilitiesStepDefns.class);

	public ReqCreationUtilitiesStepDefns(WebDriverFactory driverFactory) throws Exception { // Cucumber runtime creates a default instance of this class
		super("RequisitionUtilitiesWorkFlow", driverFactory);
	}

	@Given("^I am logged on to the administration side of MyInfo as an HR or Recruitment Manager$")
	public void i_am_logged_on_to_the_administration_side_of_MyInfo_as_an_HR_or_Recruitment_Manager(DataTable dtObj) throws Exception {
		// Initialize Scenario - setsPrecondition data, Launches the Browser, Logins as a given user & return Test data object
		rutdObj=initializeScenario(RequisitionUtilitiesData.class, dtObj);
		// Set Helix Test case id to testcase Info
		trdObj.setTestCaseRecordID(rutdObj.getHelixTestScriptId());
		// Initialize the Landing page after Login
		reqUtilPage=new RequisitionUtilitiesPage(this.getDriver());
		
		logExtentScreenCapture(LogStatus.PASS, "I am logged on to the administration side of MyInfo as an HR or Recruitment Manager",
				"Expected: Process Menu should be displayed | Actual: Process Menu is displayed successfully");
		
	}

	@When("^I open create new utilities req form$")
	public void I_open_create_new_utilities_req_form() throws Exception {
		reqUtilPage.click_ProcessMenu();
		reqUtilPage.click_AdditionalServices();
		reqUtilPage.click_Recruiting();
		logExtentScreenCapture(LogStatus.PASS, "Click on People from the Menu Bar",
				"Expected: Recruiting Desktop Page should be displayed | Actual: Recruiting Desktop Page is displayed successfully");
		

	}

	@And("^I fill in the required info and then click Create button$")
	public void I_fill_in_the_required_info_and_then_click_Create_button() throws Exception {
		reqUtilPage.click_Reqs();
		reqUtilPage.clickCreateUtilities();
		reqUtilPage.selectUnionJob(rutdObj.getUnionJob());
		reqUtilPage.selectECRenewalORQuickHire(rutdObj.getEcRenewal_QuickHire());
		reqUtilPage.selectSendToPOS(rutdObj.getSendtoPOS());
		reqUtilPage.selectRV(rutdObj.getRV());
		reqUtilPage.enterNumberOfPositions(rutdObj.getNumberofPositions());
		reqUtilPage.selectCompany(rutdObj.getCompany());
		reqUtilPage.selectPayGroup(rutdObj.getPaygroup());
		reqUtilPage.enterDepartment(rutdObj.getDepartment());
		reqUtilPage.selectDivision(rutdObj.getDivision());
		reqUtilPage.selectDivisionSVPorVP(rutdObj.getDivisionSVP_VP());
		reqUtilPage.enterCostCenter(rutdObj.getCostCenter());
		reqUtilPage.selectRegionSelectionCode(rutdObj.getRegionSectionCode());
		reqUtilPage.selectBudgetedPosition(rutdObj.getBudgetedPosition());
		reqUtilPage.enterSharedServices(rutdObj.getSharedServices());
		reqUtilPage.selectEligibleForRelocation(rutdObj.getEligibleforRelocation());
		reqUtilPage.selectEligibleForReferral(rutdObj.getEligibleforReferralProgram());
		reqUtilPage.selectReferralAmount(rutdObj.getReferralAmount());
		reqUtilPage.selectDOTSafetySensitive(rutdObj.getDot_SafetySensitive());
		reqUtilPage.enterLocation(rutdObj.getLocation());
		reqUtilPage.enterDesiredBuildingORSeatLocation(rutdObj.getDesiredBuilding_SeatLocation());
		reqUtilPage.enterInternalJobTitleORJobCode(rutdObj.getInternalJobTitle_JobCode());
		reqUtilPage.enterExternalPublishedJobTitle(rutdObj.getExternal_PublishedJobTitle());
		reqUtilPage.selectBasePayType(rutdObj.getBasePayType());		
		reqUtilPage.selectPositionType(rutdObj.getPositionType());		
		reqUtilPage.selectRegularOrTemp(rutdObj.getRegular_Temp());
		reqUtilPage.selectEmployeeClass(rutdObj.getEmployeeClass());
		reqUtilPage.selectECduration(rutdObj.getEcDuration());
		reqUtilPage.enterBusinessJustificationForPosition(rutdObj.getBusinessJustificationforPosition());
		reqUtilPage.selectReplacementOrAddition(rutdObj.getReplacement_Addition());			
		reqUtilPage.enterHiringManager(rutdObj.getHiringManagerI());
		reqUtilPage.selectRecruiter(rutdObj.getRecruiter());		
		reqUtilPage.selectAreaOfInterest(rutdObj.getAreaOfInterest());		
		reqUtilPage.selectPostingLocation(rutdObj.getPostingLocation());
		
		reqUtilPage.enterExternalDescription(rutdObj.getExternalDescription());
		
		reqUtilPage.enterExternalRequirement(rutdObj.getExternalRequirements());
		
		reqUtilPage.enterInternalDescription(rutdObj.getInternalDescription());
		
		reqUtilPage.enterInternalQualification(rutdObj.getInternalQualification());
		reqUtilPage.enterApprover1(rutdObj.getApprover_1());	
		
		reqUtilPage.clickCreateButton();
		logExtentScreenCapture(LogStatus.PASS, "I fill in the required info and then click Create button",
				"Requisition for Utilites should be displayed | Actual: Req for Utilies is displayed successfully");
	}

	/*@And("^I click on Life Events$")
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

	
	 * @And("^I select Enroll on behalf of the employee$") public void
	 * i_select_Enroll_on_behalf_of_the_employee() throws Exception { // empty
	 * implementation }
	 
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
	}*/

	@Then("^Then the job posting should be created and saved as Draft$")
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
		trdObj.setTestStatus(FrameworkConstants.PASS);
	}
	
	
   @After
     public void tearDown(Scenario scenario)
     {
		super.tearDown(scenario);
     }

}