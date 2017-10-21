package com.sempra.hr.cucumber.frwk.sd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.datatable.ReqsCreateCorpAndGlobalTestData;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.ReqsCreateCorpAndGlobalPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ReqsCreateCorpAndGlobalStepDefns extends BasicStepDefns {

	public ReqsCreateCorpAndGlobalStepDefns(CucumberContext cucContext) {
		super("ReqsCreateCorpAndGlobalWorkFlow", cucContext);
		// TODO Auto-generated constructor stub
	}

	private ReqsCreateCorpAndGlobalTestData reqCreateCorpAndGlobalTDObj;
	private ReqsCreateCorpAndGlobalPage reqsCreateCorpAndGlobalPageObj;
	private static final Logger logger = LoggerFactory.getLogger(ReqsCreateCorpAndGlobalStepDefns.class);
	
	@And("^I click on Create Corp Global from the Sub Menu$")   // Starting method of the Workflow, so do the initialization
	public void i_open_create_new_Corporate_and_Global_req_form() throws Exception {
		
		//**************************************************************************************************
		// Initialization - Retrieve testdata, iniliatize test run info and instantiate the Page Object.
		//***************************************************************************************************
		reqCreateCorpAndGlobalTDObj=retrieveTestData(ReqsCreateCorpAndGlobalTestData.class); 
		// Set Helix Test case id to testcase Info
		trdObj.setTestCaseRecordID(reqCreateCorpAndGlobalTDObj.getHelix_Test_Case_Number());
	    // Create an instance of the PageObject
		reqsCreateCorpAndGlobalPageObj=new ReqsCreateCorpAndGlobalPage(this.getDriver());
		
		reqsCreateCorpAndGlobalPageObj.click_CreateCorpAndGlobal();
	}

	@And("^I fill in the Corp Global Info and then click Create button$")
	public void i_fill_in_the_required_info_and_then_click_Create_button() throws Exception {
		  // Write code here that turns the phrase above into concrete actions
				//reqsCreateCorpAndGlobalPageObj.enterRequistionStatusDetail(reqCreateCorpAndGlobalTDObj.getRequisitionStatusDetail()); //Done
				reqsCreateCorpAndGlobalPageObj.selectECRenewal_QuickHire(reqCreateCorpAndGlobalTDObj.getEcRenewal_QuickHire()); //Done
				reqsCreateCorpAndGlobalPageObj.selectIsConfidential(reqCreateCorpAndGlobalTDObj.getConfidential()); //Done
				reqsCreateCorpAndGlobalPageObj.enterNumberofPositions(reqCreateCorpAndGlobalTDObj.getNumberofPositions()); //Done
				reqsCreateCorpAndGlobalPageObj.selectCompany(reqCreateCorpAndGlobalTDObj.getCompany()); //Done
				reqsCreateCorpAndGlobalPageObj.selectPayGroup(reqCreateCorpAndGlobalTDObj.getPaygroup()); //Done
				
				reqsCreateCorpAndGlobalPageObj.enterDepartment(reqCreateCorpAndGlobalTDObj.getDepartment()); //Done
				reqsCreateCorpAndGlobalPageObj.enterCostCenter(reqCreateCorpAndGlobalTDObj.getCostCenter()); //Done
				reqsCreateCorpAndGlobalPageObj.enterDesiredBuilding_SeatLocation(reqCreateCorpAndGlobalTDObj.getDesiredBuilding_SeatLocation());//Done
				reqsCreateCorpAndGlobalPageObj.selectEligibleForRelocation(reqCreateCorpAndGlobalTDObj.getEligibleforRelocation()); //Done
				reqsCreateCorpAndGlobalPageObj.selectEligibleForReferalProgram(reqCreateCorpAndGlobalTDObj.getEligibleforReferralProgram()); //Done
				
				//reqsCreateCorpAndGlobalPageObj.selectDOT_PipelineOperationsOrCDLRequired(reqCreateCorpAndGlobalTDObj.getDot_PipelineOperationsorCDL()); //Done
				
				reqsCreateCorpAndGlobalPageObj.selectDOT_SafetySensitive(reqCreateCorpAndGlobalTDObj.getDot_SafetySensitive()); //Done
				
				//reqsCreateCorpAndGlobalPageObj.enterVEReq(reqCreateCorpAndGlobalTDObj.getVeRequ_()); //Done
				
				reqsCreateCorpAndGlobalPageObj.enterLocation(reqCreateCorpAndGlobalTDObj.getLocation()); //Done
				
				reqsCreateCorpAndGlobalPageObj.enterInternalJobTitle_JobCode(reqCreateCorpAndGlobalTDObj.getInternalJobTitle_JobCode()); //Done
				reqsCreateCorpAndGlobalPageObj.enterExternal_PublishedJobTitle(reqCreateCorpAndGlobalTDObj.getExternal_PublishedJobTitle());
				reqsCreateCorpAndGlobalPageObj.selectPayType(reqCreateCorpAndGlobalTDObj.getBasePayType()); //Done
				
				//reqsCreateCorpAndGlobalPageObj.enterICPTarget(reqCreateCorpAndGlobalTDObj.getIcpTarget()); //Done
				
				reqsCreateCorpAndGlobalPageObj.selectPositionType(reqCreateCorpAndGlobalTDObj.getPositionType()); //Done
				reqsCreateCorpAndGlobalPageObj.selectRegular_Temp(reqCreateCorpAndGlobalTDObj.getRegular_Temp()); //Done
				reqsCreateCorpAndGlobalPageObj.selectEmployeeClass(reqCreateCorpAndGlobalTDObj.getEmployeeClass()); //Done
				
				//reqsCreateCorpAndGlobalPageObj.selectECDuration(reqCreateCorpAndGlobalTDObj.geteCDuration()); //Done
				
				reqsCreateCorpAndGlobalPageObj.selectReplacement_Addition(reqCreateCorpAndGlobalTDObj.getReplacement_Addition()); //Done
				reqsCreateCorpAndGlobalPageObj.selectReplacementReasonForLeaving(reqCreateCorpAndGlobalTDObj.getReplacementReasonforLeaving()); //Done
				reqsCreateCorpAndGlobalPageObj.enterReplacementFor(reqCreateCorpAndGlobalTDObj.getReplacementFor_());
				reqsCreateCorpAndGlobalPageObj.enterReplacementFor2(reqCreateCorpAndGlobalTDObj.getReplacementFor2());
				reqsCreateCorpAndGlobalPageObj.enterReplacementFor3(reqCreateCorpAndGlobalTDObj.getReplacementFor3());
				reqsCreateCorpAndGlobalPageObj.enterReplacementFor4Plus(reqCreateCorpAndGlobalTDObj.getReplacementFor4_());
				
				//reqsCreateCorpAndGlobalPageObj.selectEmployeeClass(reqCreateCorpAndGlobalTDObj.getEmployeeClass()); //CheckBox
				
				reqsCreateCorpAndGlobalPageObj.enterHiringmgr1(reqCreateCorpAndGlobalTDObj.getHiringMgrI()); //Question?
				
				/*
				reqsCreateCorpAndGlobalPageObj.enterHiringmgr1("Ken");
				By selectOptionBy= By.xpath("//div[starts-with(@id,'portal-autocomplete_item')] "); 
				List<WebElement> selectOptionWebElement=getDriver().findElements(selectOptionBy);
				selectOptionWebElement.size();
				System.out.println("size :"+selectOptionWebElement.size());
				
				
				for(WebElement we: selectOptionWebElement)  {
				we.getText();
				System.out.println("Get Text :"+we.getText());
				System.out.println("Get tag :"+we.getTagName());
				System.out.println("Get Attribute :"+we.getAttribute("innerHTML"));
				}
				*/
				
				/*String innerText = driver.findElement(By.cssSelector("div.success")).getAttribute("innerHTML");
				String text = innerText.replaceFirst(".+?</button>([^>]+).*", "$1").trim();
				*/
				
				/*for(int i=0;i<selectOptionWebElement.size();i++) {
					
					By option=By.xpath("//div[@index='"+i+"'] ");
					WebElement selectOptionWebElement1=getDriver().findElement(option);
					selectOptionWebElement1.getSize();
					selectOptionWebElement1.getText();
					System.out.println("Options :"+selectOptionWebElement1.getSize());
					System.out.println("Options :"+selectOptionWebElement1.getText());
				}*/
				
				//By selectOptionBy= By.xpath("//*div[starts-with(@id,'portal-autocomplete_item') and text()='Ken Mizell '] "); 
				/*By selectOptionBy= By.xpath("//div[starts-with(@id,'portal-autocomplete_item') and text()='Ken  Mizell '] "); 
				By.xpath(translate(normalize-space(), ' ', ' '));*/
				//By selectOptionBy=By.xpath("//div[starts-with(@id,'portal-autocomplete_item') and translate(normalize-space(text())='KenMizell'))"); 
				//WebElement selectOptionWebElement=getDriver().findElement(selectOptionBy);
				//selectOptionWebElement.click();
				reqsCreateCorpAndGlobalPageObj.selectRecruiter(reqCreateCorpAndGlobalTDObj.getRecruiter()); //Question?
				
				//reqsCreateCorpAndGlobalPageObj.selectRecruiterAssistant(reqCreateCorpAndGlobalTDObj.getRecruiterAssistant());
				
				reqsCreateCorpAndGlobalPageObj.selectAreaOfInterest(reqCreateCorpAndGlobalTDObj.getAreaofInterest());
				reqsCreateCorpAndGlobalPageObj.selectPostingLocation(reqCreateCorpAndGlobalTDObj.getPostingLocation());
				
				//reqsCreateCorpAndGlobalPageObj.selectAlternatePostingLocations(reqCreateCorpAndGlobalTDObj.getAlternatePostingLocations());
				reqsCreateCorpAndGlobalPageObj.clickExternalDescriptionLink();
				reqsCreateCorpAndGlobalPageObj.enterExternalDescriptionText(reqCreateCorpAndGlobalTDObj.getExternalDescription());
				reqsCreateCorpAndGlobalPageObj.clickExternalQualificationsLink();
				reqsCreateCorpAndGlobalPageObj.enterExternalQualificationsText(reqCreateCorpAndGlobalTDObj.getExternalQualifications());
				reqsCreateCorpAndGlobalPageObj.clickInternalDescriptionLink();
				reqsCreateCorpAndGlobalPageObj.enterInternalDescriptionText(reqCreateCorpAndGlobalTDObj.getInternalDescription());
				reqsCreateCorpAndGlobalPageObj.clickInternalQualificationsLink();
				reqsCreateCorpAndGlobalPageObj.enterInternalQualificationsText(reqCreateCorpAndGlobalTDObj.getInternalQualification());
				
				reqsCreateCorpAndGlobalPageObj.enterApprover1(reqCreateCorpAndGlobalTDObj.getApprover_1());
				reqsCreateCorpAndGlobalPageObj.enterApprover2(reqCreateCorpAndGlobalTDObj.getApprover_2());
				/*reqsCreateCorpAndGlobalPageObj.enterApprover3(reqCreateCorpAndGlobalTDObj.getApprover_3());
				reqsCreateCorpAndGlobalPageObj.enterApprover4(reqCreateCorpAndGlobalTDObj.getApprover_4());
				reqsCreateCorpAndGlobalPageObj.enterApprover5(reqCreateCorpAndGlobalTDObj.getApprover_5());
				reqsCreateCorpAndGlobalPageObj.enterApprover6(reqCreateCorpAndGlobalTDObj.getApprover_6());
				reqsCreateCorpAndGlobalPageObj.enterApprover7(reqCreateCorpAndGlobalTDObj.getApprover_7());
				reqsCreateCorpAndGlobalPageObj.enterApprover8(reqCreateCorpAndGlobalTDObj.getApprover_8());*/
				reqsCreateCorpAndGlobalPageObj.clickCreate();	
				
				logExtentScreenCapture(LogStatus.PASS, "Populate the Data into Data fields and Click create",
						"Expected: Data should be populated into Data fields and create is clicked| Actual: Populated Data into Data fields and clicked on create successfully");
			}

			@Then("^the Corp Global job posting should be created and saved as Draft$")
			public void the_job_posting_should_be_created_and_saved_as_Draft() throws Exception {
				
				reqsCreateCorpAndGlobalPageObj.clickReqCreateCorpGlobalAlertAccept();
				reqsCreateCorpAndGlobalPageObj.clickReqCreateCorpGlobalAlertAccept();
				
				String text=reqsCreateCorpAndGlobalPageObj.readRequisitionNumber();
				System.out.println("Corporate and Global Requisition Number :"+text);
				logExtentScreenCapture(LogStatus.PASS, "Job Requisition for Create: Corp and Global should be created and saved as Draft",
						"Expected: Job Requisition for Create: Corp and Global should be created and saved as Draft | Actual: Job Requisition for Create: Corp and Global is created and saved as Draft");
			
			}
			

		}
