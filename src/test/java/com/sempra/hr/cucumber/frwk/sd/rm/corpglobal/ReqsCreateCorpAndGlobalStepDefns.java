package com.sempra.hr.cucumber.frwk.sd.rm.corpglobal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.datatable.ReqsCreateCorpAndGlobalTestData;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.ReqsCreateCorpAndGlobalPage;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.RequisitionsPage;
import com.sempra.hr.cucumber.frwk.sd.BasicStepDefns;
import com.sempra.hr.cucumber.frwk.testdrivers.WebDriverFactory;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReqsCreateCorpAndGlobalStepDefns extends BasicStepDefns {

	public ReqsCreateCorpAndGlobalStepDefns(WebDriverFactory driverFactory) {
		super("ReqsCreateCorpAndGlobalWorkFlow", driverFactory);
		// TODO Auto-generated constructor stub
	}
	//private EligibilityTestData etdObj;
	private ReqsCreateCorpAndGlobalTestData reqCreateCorpAndGlobalTDObj;
	private RequisitionsPage reqsPageObj;
	private ReqsCreateCorpAndGlobalPage ReqsCreateCorpAndGlobalPageObj;
	private static final Logger logger = LoggerFactory.getLogger(ReqsCreateCorpAndGlobalStepDefns.class);
	
	@Given("^I am logged on to the administration side of MyInfo as an HR or Recruitment Manager$")
	public void i_am_logged_on_to_the_administration_side_of_MyInfo_as_an_HR_or_Recruitment_Manager(DataTable dtObj) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		
		// Initialize Scenario - setsPrecondition data, Launches the Browser, Logins as a given user & return Test data object
		//etdObj=initializeScenario(EligibilityTestData.class, dtObj);
		reqCreateCorpAndGlobalTDObj=initializeScenario(ReqsCreateCorpAndGlobalTestData.class, dtObj);
				// Set Helix Test case id to testcase Info
				trdObj.setTestCaseRecordID(reqCreateCorpAndGlobalTDObj.getHelix_Test_Case_Number());
				// Initialize the Landing page after Login
				reqsPageObj=new RequisitionsPage(this.getDriver());
	    throw new PendingException();
	}

	@When("^I open create new Corporate and Global req form$")
	public void i_open_create_new_Corporate_and_Global_req_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reqsPageObj.click_PeopleMenu();
		reqsPageObj.click_AdditionalServices();
		reqsPageObj.click_Recruiting();
		reqsPageObj.click_Reqs();
		reqsPageObj.click_CreateCorpAndGlobal();
	    throw new PendingException();
	}

	@When("^I fill in the required info and then click Create button$")
	public void i_fill_in_the_required_info_and_then_click_Create_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the job posting should be created and saved as Draft$")
	public void the_job_posting_should_be_created_and_saved_as_Draft() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	

}
