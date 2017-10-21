package com.sempra.hr.cucumber.frwk.pageobjects.rm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqsCreateCorpAndGlobalPage extends RequisitionsPage {

	public ReqsCreateCorpAndGlobalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(ReqsCreateCorpAndGlobalPage.class);
	
	@FindBy(name="zzreqReqstatusDetails_RTiCustomReq")
	private WebElement requistionStatusDetail;
	public void enterRequistionStatusDetail(String text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), requistionStatusDetail, text);
	}
	
	@FindBy(name="gridControl_RTiReq")
	private WebElement ecRenewal_QuickHire;
	public void selectECRenewal_QuickHire(String ecRenewal_QuickHire_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), ecRenewal_QuickHire, ecRenewal_QuickHire_Text);
	}
	
	@FindBy(name="isConfidential_RTiReq")
	private WebElement isConfidential;
	public void selectIsConfidential(String confidential_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), isConfidential, confidential_Text);
	}
	
	@FindBy(name="numOpenings_RTiReq_numberCtrl")
	private WebElement numberofPositions;
	public void enterNumberofPositions(String numberofPositions_Text) throws Exception{
		wu.clearText(getDriver(), numberofPositions);
		wu.sendKeysToWebElement(getDriver(), numberofPositions, numberofPositions_Text);
	}
	
	@FindBy(name="companyCode_RTiReq")
	private WebElement company;
	public void selectCompany(String company_Text) throws Exception{
		wu.selectValueFromDropDown(getDriver(), company, company_Text);
		
	}
	
	@FindBy(name="payGroupCode_RTiReq")
	private WebElement payGroup;
	public void selectPayGroup(String payGroup_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), payGroup, payGroup_Text);
	}
	
	@FindBy(xpath="//textarea[@name='departmentCode_RTiReq_ms_ac_sf']")
	private WebElement department;
	public void enterDepartment(String department_Text)throws Exception {
		
		wu.sendKeysToWebElement(getDriver(), department, department_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), department);
	}
	
	@FindBy(xpath="//textarea[@name='costNumCode_RTiReq_ms_ac_sf']")
	private WebElement costCenter;
	public void enterCostCenter(String costCenter_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), costCenter, costCenter_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), costCenter);
	}
	
	@FindBy(name="zzreqDesiredBldgSeatLocation_RTiCustomReq")
	private WebElement desiredBuilding_SeatLocation;
	public void enterDesiredBuilding_SeatLocation(String desiredBuilding_SeatLocation_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), desiredBuilding_SeatLocation, desiredBuilding_SeatLocation_Text);
	}
	
	@FindBy(name="zzreqEligibleForRelocation_RTiCustomReq")
	private WebElement eligibleForRelocation;
	public void selectEligibleForRelocation(String eligibleForRelocation_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), eligibleForRelocation, eligibleForRelocation_Text);
	}
	
	@FindBy(name="erpBonusType_RTiReq")
	private WebElement eligibleForReferalProgram;
	public void selectEligibleForReferalProgram(String eligibleForReferalProgram_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), eligibleForReferalProgram, eligibleForReferalProgram_Text);
	}
	
	@FindBy(name="zzreqDOTpipelineOPorCDLRequired_RTiCustomReq")
	private WebElement dot_PipelineOperationsOrCDLRequired;
	public void selectDOT_PipelineOperationsOrCDLRequired(String dot_PipelineOperationsOrCDLRequired_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), dot_PipelineOperationsOrCDLRequired, dot_PipelineOperationsOrCDLRequired_Text);
	}
	
	@FindBy(name="gridControl3_RTiReq")
	private WebElement dot_SafetySensitive;
	public void selectDOT_SafetySensitive(String dot_SafetySensitive_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), dot_SafetySensitive, dot_SafetySensitive_Text);
	}
	
	@FindBy(name="veID_RTiReq")
	private WebElement veReq;
	public void enterVEReq(String veReq_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), veReq, veReq_Text);
	}
	
	@FindBy(xpath="//textarea[@name='locationCode_RTiReq_ms_ac_sf']")
	private WebElement location;
	public void enterLocation(String location_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), location, location_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), location);
	}
	@FindBy(xpath="//textarea[@name='positionCode_RTiReq_ms_ac_sf']")
	private WebElement internalJobTitle_JobCode;
	public void enterInternalJobTitle_JobCode(String internalJobTitle_JobCode_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), internalJobTitle_JobCode, internalJobTitle_JobCode_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), internalJobTitle_JobCode);
	}
	
	@FindBy(name="ptitle_RTiReq")
	private WebElement external_PublishedJobTitle;
	public void enterExternal_PublishedJobTitle(String external_PublishedJobTitle_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), external_PublishedJobTitle, external_PublishedJobTitle_Text);
		//wu.sendKeysToWebElement(getDriver(), external_PublishedJobTitle);
	}
	
	@FindBy(name="payType_RTiReq")
	private WebElement basePayType;
	public void selectPayType(String payType_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), basePayType, payType_Text);
	}
	
	@FindBy(name="zzreqICPTarget_RTiCustomReq")
	private WebElement icpTarget;
	public void enterICPTarget(String icpTarget_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), icpTarget, icpTarget_Text);
	}
	
	@FindBy(name="typeOfFulltime_RTiReq")
	private WebElement positionType;
	public void selectPositionType(String positionType_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), positionType, positionType_Text);
	}
	
	@FindBy(name="zzregTemp_RTiCustomReq")
	private WebElement regular_Temp;
	public void selectRegular_Temp(String regular_Temp_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), regular_Temp, regular_Temp_Text);
	}
	
	@FindBy(name="zzreqEmployeeClass_RTiCustomReq")
	private WebElement employeeClass;
	public void selectEmployeeClass(String employeeClass_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), employeeClass, employeeClass_Text);
	}
	
	@FindBy(name="zzreqECDuration_RTiCustomReq")
	private WebElement ecDuration;
	public void selectECDuration(String ecDuration_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), ecDuration, ecDuration_Text);
	}
	
	@FindBy(name="typeOfNew_RTiReq")
	private WebElement replacement_Addition;
	public void selectReplacement_Addition(String replacement_Addition_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), replacement_Addition, replacement_Addition_Text);
	}
	
	@FindBy(name="zzreqReplacementReasonforLeaving_RTiCustomReq")
	private WebElement replacementReasonForLeaving;
	public void selectReplacementReasonForLeaving(String replacementReasonForLeaving_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), replacementReasonForLeaving, replacementReasonForLeaving_Text);
	}
	
	@FindBy(name="zzrepFor_RTiCustomReq")
	private WebElement replacementFor;
	public void enterReplacementFor(String replacementFor_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), replacementFor, replacementFor_Text);
	}
	
	@FindBy(name="zzreqRepFor2_RTiCustomReq")
	private WebElement replacementFor2;
	public void enterReplacementFor2(String replacementFor2_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), replacementFor2, replacementFor2_Text);
	}
	
	@FindBy(name="zzreqRepFor3_RTiCustomReq")
	private WebElement replacementFor3;
	public void enterReplacementFor3(String replacementFor3_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), replacementFor3, replacementFor3_Text);
	}
	
	@FindBy(name="zzreqRepFor4_RTiCustomReq")
	private WebElement replacementFor4Plus;
	public void enterReplacementFor4Plus(String replacementFor4Plus_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), replacementFor4Plus, replacementFor4Plus_Text);
	}
	
	@FindBy(name="lockMultiOwners_RTiReq")
	private WebElement autoAssignMultipleOwners;
	
	
	@FindBy(xpath="//textarea[@name='_recruiterID00004010_RTiReq_ms_ac_sf']")
	private WebElement hiringmgr1;
	public void enterHiringmgr1(String hiringmgr1_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), hiringmgr1, hiringmgr1_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), hiringmgr1);
	}
	
	@FindBy(name="_recruiterID00004020_RTiReq")
	private WebElement recruiter;
	public void selectRecruiter(String recruiter_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), recruiter, recruiter_Text);
	}
	
	
	@FindBy(name="_recruiterID00004580_RTiReq")
	private WebElement recruiterAssistant;
	public void selectRecruiterAssistant(String recruiterAssistant_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), recruiterAssistant, recruiterAssistant_Text);
	}
	
	@FindBy(name="grp_RTiReq")
	private WebElement areaOfInterest;
	public void selectAreaOfInterest(String areaOfInterest_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), areaOfInterest, areaOfInterest_Text);
	}
	
	@FindBy(name="postingLocationCode_RTiReq")
	private WebElement postingLocation;
	public void selectPostingLocation(String postingLocation_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), postingLocation, postingLocation_Text);
	}
	
	@FindBy(name="altPostingLocationCodes_RTiReq")
	private WebElement alternatePostingLocations;
	public void selectAlternatePostingLocations(String alternatePostingLocations_Text)throws Exception {
		wu.selectValueFromDropDown(getDriver(), alternatePostingLocations, alternatePostingLocations_Text);
	}
	
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_description_RTiReq']/a")
	private WebElement externalDescriptionLink;
	public void clickExternalDescriptionLink() throws Exception{
		wu.clickWebElement(getDriver(), externalDescriptionLink);
	}
	
	@FindBy(id="description_RTiReq")
	private WebElement externalDescriptionText;
	public void enterExternalDescriptionText(String text) throws Exception{
		wu.sendKeysToWebElement(getDriver(), externalDescriptionText,text);
	}
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_requirements_RTiReq']/a")
	private WebElement externalQualificationsLink;
	public void clickExternalQualificationsLink() throws Exception{
		wu.clickWebElement(getDriver(), externalQualificationsLink);
	}
	
	@FindBy(id="requirements_RTiReq")
	private WebElement externalQualificationsText;
	public void enterExternalQualificationsText(String text) throws Exception{
		wu.sendKeysToWebElement(getDriver(), externalQualificationsText,text);
	}
	@FindBy(xpath="//div[@id='tinymce_rmvlink_internalDescription_RTiReq']/a")
	private WebElement internalDescriptionLink;
	public void clickInternalDescriptionLink() throws Exception{
		wu.clickWebElement(getDriver(), internalDescriptionLink);
	}
	
	@FindBy(id="internalDescription_RTiReq")
	private WebElement internalDescriptionText;
	public void enterInternalDescriptionText(String text) throws Exception{
		wu.sendKeysToWebElement(getDriver(), internalDescriptionText,text);
	}
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_zzreqInternalQualifications_RTiCustomReq']/a")
	private WebElement internalQualificationsLink;
	public void clickInternalQualificationsLink() throws Exception{
		wu.clickWebElement(getDriver(), internalQualificationsLink);
	}
	
	@FindBy(id="zzreqInternalQualifications_RTiCustomReq")
	private WebElement internalQualificationsText;
	public void enterInternalQualificationsText(String text) throws Exception{
		wu.sendKeysToWebElement(getDriver(), internalQualificationsText,text);
	}
	@FindBy(xpath="//textarea[@name='approver1ID_RTiReq_ms_ac_sf']")
	private WebElement approver1;
	public void enterApprover1(String approver1_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver1, approver1_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver1);
	}
	
	@FindBy(xpath="//textarea[@name='approver2ID_RTiReq_ms_ac_sf']")
	private WebElement approver2;
	public void enterApprover2(String approver2_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver2, approver2_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver2);
	}
	
	@FindBy(xpath="//textarea[@name='approver3ID_RTiReq_ms_ac_sf']")
	private WebElement approver3;
	public void enterApprover3(String approver3_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver3, approver3_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver3);
	}
	
	@FindBy(xpath="//textarea[@name='approver4ID_RTiReq_ms_ac_sf']")
	private WebElement approver4;
	public void enterApprover4(String approver4_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver4, approver4_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver4);
	}
	
	@FindBy(xpath="//textarea[@name='approver5ID_RTiReq_ms_ac_sf']")
	private WebElement approver5;
	public void enterApprover5(String approver5_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver5, approver5_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver5);
	}
	
	@FindBy(xpath="//textarea[@name='approver6ID_RTiReq_ms_ac_sf']")
	private WebElement approver6;
	public void enterApprover6(String approver6_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver6, approver6_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver6);
	}
	
	@FindBy(xpath="//textarea[@name='approver7ID_RTiReq_ms_ac_sf']")
	private WebElement approver7;
	public void enterApprover7(String approver7_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver7, approver7_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver7);
	}
	@FindBy(xpath="//textarea[@name='approver8ID_RTiReq_ms_ac_sf']")
	private WebElement approver8;
	public void enterApprover8(String approver8_Text)throws Exception {
		wu.sendKeysToWebElement(getDriver(), approver8, approver8_Text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver8);
	}
	@FindBy(name="_reqform_create2_button")
	private WebElement create;
	public void clickCreate() {
		wu.clickWebElement(getDriver(), create);
	}
	
	public void clickReqCreateCorpGlobalAlertAccept() {
		wu.clickOnAlertToAccept(getDriver());
	}
	public void clickReqCreateCorpGlobalAlertDismiss() {
		wu.clickOnAlertToAccept(getDriver());
	}
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/table/tbody/tr/td/div/div/table/tbody/tr[6]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/span")
	private WebElement requisitionNumber;
	public String readRequisitionNumber(){
		String text=wu.getTextFromWebElement(getDriver(), requisitionNumber);
		return text;
	}	
	
}
