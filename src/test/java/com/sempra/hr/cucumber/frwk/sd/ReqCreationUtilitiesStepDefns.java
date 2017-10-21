package com.sempra.hr.cucumber.frwk.sd;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.datatable.ReqsCreateCorpAndGlobalTestData;
import com.sempra.hr.cucumber.frwk.datatable.RequisitionUtilitiesData;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.ReqsCreateCorpAndGlobalPage;
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
 * @author sgarine@prokarma.com
 * @version 1.0
 */
public class ReqCreationUtilitiesStepDefns extends BasicStepDefns {
	private RequisitionUtilitiesData rutdObj;
	//private RequisitionsPage reqPage;
	private RequisitionUtilitiesPage reqUtilPage;
	private static final Logger logger = LoggerFactory.getLogger(ReqCreationUtilitiesStepDefns.class);

	public ReqCreationUtilitiesStepDefns(CucumberContext cucContext) throws Exception { // Cucumber runtime creates a default instance of this class
		super("RequisitionUtilitiesWorkFlow", cucContext);
	}
	@And("^I click on Create Utilities from the Sub Menu$") // Starting method of the Workflow, so do the initializations
	 public void i_click_on_create_utilities_from_the_Sub_Menu() throws Exception {
		//***********************************************************************************************
		// Initialization - Retrieve testdata, iniliatize test run info and instantiate the Page Object.
		//***********************************************************************************************
		rutdObj=retrieveTestData(RequisitionUtilitiesData.class); 
		// Set Helix Test case id to testcase Info
		trdObj.setTestCaseRecordID(rutdObj.getHelixTestScriptId());
	    // Create an instance of the PageObject
		reqUtilPage=new RequisitionUtilitiesPage(this.getDriver());
		
		reqUtilPage.click_CreateUtilities();

	 }

	@And("^I fill in the Utilities Info and then click Create button$")
	public void i_fill_in_the_required_info_and_then_click_Create_button() throws Exception {
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
		reqUtilPage.clickExternalDescriptionLink();
		reqUtilPage.enterTextInExternalDescription(rutdObj.getExternalDescription());	
		reqUtilPage.clickExternalRequirmentLink();
		reqUtilPage.enterTextInExternalRequirment(rutdObj.getExternalRequirements());		
		reqUtilPage.clickInternalDescriptionLink();;
		reqUtilPage.enterTextInInternalDescriptionLink(rutdObj.getInternalDescription());		
		reqUtilPage.clickIinternalQualificationLink();		
		reqUtilPage.enterTextIninternalQualificationLink(rutdObj.getInternalQualification());
		reqUtilPage.enterApprover1(rutdObj.getApprover_1());	
		
		reqUtilPage.clickCreateButton();
		
		logExtentScreenCapture(LogStatus.PASS, "Click on Create button to create Requisition for Utilities",
			"Expected: Requisition for Utilities should be displayed | Actual: Requisition for Utilities is displayed successfully");
	}
	
	@Then("^the Utilities job posting should be created and saved as Draft$")
	public void the_job_posting_should_be_created_and_saved_as_draft() throws Exception {
		
		
		reqUtilPage.clickOnAlertToAccept();
		reqUtilPage.clickOnAlertToAccept();
		String reqNumber = reqUtilPage.getTheRequisitionNumberCreatedForUtilities();
		
		
		logExtentScreenCapture(LogStatus.PASS, "Requisition for Utilities created and Saved in Draft",
				"Expected: Requisition for Utilities should be created | Actual: Requision for Utilities has been created successfully with Req NUmber:   "+reqNumber);

        
		// Set test case status as pass
		trdObj.setTestStatus(FrameworkConstants.PASS);
	}
	
}