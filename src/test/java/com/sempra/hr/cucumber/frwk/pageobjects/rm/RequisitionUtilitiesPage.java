package com.sempra.hr.cucumber.frwk.pageobjects.rm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RequisitionUtilitiesPage extends RequisitionsPage{
	
	private static final Logger logger = LoggerFactory.getLogger(RequisitionsPage.class);
	@FindBy(name = "gridControl2_RTiReq")
	protected WebElement unionJob;	
	@FindBy(name = "gridControl_RTiReq")
	private WebElement ECRenewalORQuickHire;	
	@FindBy(name = "zzreqSendtoPOS_RTiCustomReq")
	private WebElement sendToPOS;	
	@FindBy(name = "zzreqRV_RTiCustomReq")
	private WebElement RV;	
	@FindBy(name = "numOpenings_RTiReq_numberCtrl")
	private WebElement numberOfPositions;
	@FindBy(xpath="//select[@name='companyCode_RTiReq']")
	private WebElement company;
	@FindBy(xpath="//select[@name='payGroupCode_RTiReq']")
	private WebElement payGroup;
	@FindBy(xpath="//textarea[@name='departmentCode_RTiReq_ms_ac_sf']")
	private WebElement department;
	@FindBy(name = "zzreqDivisionSempra_RTiCustomReq")
	private WebElement division;
	@FindBy(name = "zzreqDivisionSVPVP_RTiCustomReq")
	private WebElement divisionSVPORVP;	
	@FindBy(xpath="//textarea[@name='costNumCode_RTiReq_ms_ac_sf']")
	private WebElement CostCenter;	
	@FindBy(name = "zzreqRegionSectionCode_RTiCustomReq")
	private WebElement regionSelectionCode;
	@FindBy(name = "zzreqBudgetedPosition_RTiCustomReq")
	private WebElement budgetedPosition;	
	@FindBy(name = "zzreqSharedServices2_RTiCustomReq")
	private WebElement sharedServices;	
	@FindBy(name = "zzreqEligibleForRelocation_RTiCustomReq")
	private WebElement eligibleForRelocation;
	@FindBy(name = "erpBonusType_RTiReq")
	private WebElement eligibleForReferral;	
	@FindBy(name = "zzreqReferralAmount_RTiCustomReq")
	private WebElement referralAmount;
	@FindBy(name = "gridControl3_RTiReq")
	private WebElement dotSafetySensitive;
	
	@FindBy(xpath = "//textarea[@name='locationCode_RTiReq_ms_ac_sf']")
	private WebElement location;
	
	@FindBy(xpath = "//textarea[@name='zzreqDesiredBldgSeatLocation_RTiCustomReq']")
	private WebElement desiredBuildingORSeatLocation;
	
	@FindBy(xpath = "//textarea[@name='positionCode_RTiReq_ms_ac_sf']")
	private WebElement internalJobTitleORJobCode;
	@FindBy(name = "ptitle_RTiReq")
	private WebElement externalPublishedJobTitle;	
	@FindBy(name = "payType_RTiReq")
	private WebElement basePayType;
	@FindBy(name = "typeOfFulltime_RTiReq")
	private WebElement positionType;
	@FindBy(name = "zzregTemp_RTiCustomReq")
	private WebElement regularOrTemp;
	@FindBy(name = "zzreqEmployeeClass_RTiCustomReq")
	private WebElement employeeClass;
	@FindBy(name = "zzreqECDuration_RTiCustomReq")
	private WebElement ecDuration;
	@FindBy(name = "zzreqAgencyConversionName_RTiCustomReq")
	private WebElement agencyConverionName;	
	@FindBy(xpath = "//textarea[@name='zzreqBizJustificationforPosition2_RTiCustomReq']")
	private WebElement businessJustificationForPosition;
	@FindBy(name = "typeOfNew_RTiReq")
	private WebElement replacementOrAddition;	
	@FindBy(xpath = "//textarea[@name='_recruiterID00004010_RTiReq_ms_ac_sf']")
	private WebElement hiringManager1;	
	@FindBy(name = "_recruiterID00004020_RTiReq")
	private WebElement recruiter;	
	@FindBy(name = "grp_RTiReq")
	private WebElement areaOfInterest;	
	@FindBy(name = "postingLocationCode_RTiReq")
	private WebElement postingLocation;	
	@FindBy(id = "description_RTiReq_ifr")
	private WebElement externalDescription;	
	@FindBy(id = "requirements_RTiReq_ifr")
	private WebElement externalRequirement;	
	@FindBy(id = "zzreqInternalQualifications_RTiCustomReq_ifr")
	private WebElement internalQualification;
	@FindBy(id = "internalDescription_RTiReq_ifr")
	private WebElement internalDescription;
	
	@FindBy(xpath = "//textarea[@name='approver1ID_RTiReq_ms_ac_sf']")
	private WebElement approver1;
	@FindBy(id = "_reqform_create2_button")
	private WebElement createButton;
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_description_RTiReq']/a")
	private WebElement 	externalDescriptionLink;
	
	@FindBy(xpath="//textarea[@name='description_RTiReq']")
	private WebElement 	externalDescriptionTextArea;
	

	@FindBy(xpath="//div[@id='tinymce_rmvlink_requirements_RTiReq']/a")
	private WebElement 	externalRequirmentsLink;
	
	@FindBy(xpath="//textarea[@name='requirements_RTiReq']")
	private WebElement 	externalRequirmentsTextArea;	
	
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_internalDescription_RTiReq']/a")
	private WebElement 	internalDescriptionLink;
	
	@FindBy(xpath="//textarea[@name='internalDescription_RTiReq']")
	private WebElement 	internalDescriptionTextArea;	
	
	@FindBy(xpath="//div[@id='tinymce_rmvlink_zzreqInternalQualifications_RTiCustomReq']/a")
	private WebElement 	internalQualificationLink;
	
	@FindBy(xpath="//textarea[@name='zzreqInternalQualifications_RTiCustomReq']")
	private WebElement 	internalQualificationTextArea;
	
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td/table/tbody/tr[3]/td/div/table/tbody/tr/td[1]/table/tbody/tr/td/div/div/table/tbody/tr[6]/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/span")
	private WebElement 	reqNumberCreated;
	
	
	
	public RequisitionUtilitiesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void selectUnionJob(String text) throws Exception 
		{
			wu.selectValueFromDropDown(getDriver(), unionJob, text);
		}
	

	
	public void selectECRenewalORQuickHire(String text) throws Exception
		{
			wu.selectValueFromDropDown(getDriver(), ECRenewalORQuickHire, text);
		}
	

	
	public void selectSendToPOS(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), sendToPOS, text);
	}
	

	
	public void selectRV(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), RV, text);
	}
	
	

	
	public void enterNumberOfPositions(String text) throws Exception
	{
		wu.clearText(getDriver(), numberOfPositions);
		wu.sendKeysToWebElement(getDriver(), numberOfPositions, text);
	}
	

	public void selectCompany(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), company, text);
	}
	

	public void selectPayGroup(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), payGroup, text);
	}
	

	public void enterDepartment(String text) throws Exception
	{
		//wu.clickWebElement(getDriver(), department);
		wu.sendKeysToWebElement(getDriver(), department,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), department);
		
	}	

	public void selectDivision(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), division, text);
	}		

	public void selectDivisionSVPorVP(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), divisionSVPORVP, text);
	}		

	public void enterCostCenter(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), CostCenter,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), CostCenter);
	}		

	public void selectRegionSelectionCode(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), regionSelectionCode, text);
	}
	
	public void selectBudgetedPosition(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), budgetedPosition, text);
	}	

	public void enterSharedServices(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), sharedServices, text);
	}
	
	public void selectEligibleForRelocation(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), eligibleForRelocation, text);
	}	

	public void selectEligibleForReferral(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), eligibleForReferral, text);
	}		

	public void selectReferralAmount(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), referralAmount, text);
	}	

	public void selectDOTSafetySensitive(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), dotSafetySensitive, text);
	}
	

	public void enterLocation(String text) throws Exception
	{
		wu.clickWebElement(getDriver(), location);
		wu.sendKeysToWebElement(getDriver(), location, text);
		wu.sendKeysWithKeyBoardActions(getDriver(), location);
	}
	

	public void enterDesiredBuildingORSeatLocation(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), desiredBuildingORSeatLocation, text);
	}
	
	
	
	public void enterInternalJobTitleORJobCode(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), internalJobTitleORJobCode, text);
		wu.sendKeysWithKeyBoardActions(getDriver(), internalJobTitleORJobCode);
	}	
	
	

	public void enterExternalPublishedJobTitle(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), externalPublishedJobTitle, text);
	}	
	

	public void selectBasePayType(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), basePayType, text);
	}	
	

	public void selectPositionType(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), positionType, text);
	}
	

	public void selectRegularOrTemp(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), regularOrTemp, text);
	}	

	public void selectEmployeeClass(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), employeeClass, text);
	}	
	

	public void selectECduration(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), ecDuration, text);
	}	
	

	public void enterAgencyConversionName(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), agencyConverionName, text);
	}
	

	public void enterBusinessJustificationForPosition(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), businessJustificationForPosition, text);
	}
	

	
	public void selectReplacementOrAddition(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), replacementOrAddition, text);
	}	
	
	

	public void enterHiringManager(String text) throws Exception
	{
		//wu.sendKeysToWebElement(getDriver(), hiringManager1, text);
		//wu.sendKeysWithKeyBoardActions(getDriver(), hiringManager1);
		
		wu.sendKeysToWebElement(getDriver(), hiringManager1, "Ken");
		Thread.sleep(1000);
		hiringManager1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		hiringManager1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		hiringManager1.sendKeys(Keys.ENTER);		
	}
	
	

	public void selectRecruiter(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), recruiter, text);		
		
	}		
	

	public void selectAreaOfInterest(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), areaOfInterest, text);
	}	
	
	

	public void selectPostingLocation(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), postingLocation, text);
	}	
	

/*	public void enterExternalDescription(String text) throws Exception
	{
		wu.iframesSwitchToChild(getDriver(), externalDescription);
		wu.sendKeysToWebElement(getDriver(), externalDescription, text);
		wu.iframesSwitchToParent(getDriver());
	}*/	
	
	public void clickExternalDescriptionLink() throws Exception 
	{
		wu.clickWebElement(getDriver(), externalDescriptionLink);
	}
	
	public void enterTextInExternalDescription(String text) throws Exception
	{
		//wu.clickWebElement(getDriver(), department);
		wu.sendKeysToWebElement(getDriver(), externalDescriptionTextArea,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), externalDescriptionTextArea);
		
	}
	
	public void clickExternalRequirmentLink() throws Exception 
	{
		wu.clickWebElement(getDriver(), externalRequirmentsLink);
	}
	
	public void enterTextInExternalRequirment(String text) throws Exception
	{
		//wu.clickWebElement(getDriver(), department);
		wu.sendKeysToWebElement(getDriver(), externalRequirmentsTextArea,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), externalRequirmentsTextArea);
		
	}	
	
	public void clickInternalDescriptionLink() throws Exception 
	{
		wu.clickWebElement(getDriver(), internalDescriptionLink);
	}
	
	public void enterTextInInternalDescriptionLink(String text) throws Exception
	{
		//wu.clickWebElement(getDriver(), department);
		wu.sendKeysToWebElement(getDriver(), internalDescriptionTextArea,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), internalDescriptionTextArea);
		
	}

	public void clickIinternalQualificationLink() throws Exception 
	{
		wu.clickWebElement(getDriver(), internalQualificationLink);
	}
	
	public void enterTextIninternalQualificationLink(String text) throws Exception
	{
		//wu.clickWebElement(getDriver(), department);
		wu.sendKeysToWebElement(getDriver(), internalQualificationTextArea,text);
		wu.sendKeysWithKeyBoardActions(getDriver(), internalQualificationTextArea);
		
	}
	
	public void enterApprover1(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), approver1, text);
		wu.sendKeysWithKeyBoardActions(getDriver(), approver1);
	}	

	public void clickCreateButton() throws Exception
	{
		wu.clickWebElement(getDriver(), createButton);
	}
	public void clickOnAlertToAccept() throws Exception
	{
		wu.clickOnAlertToAccept(getDriver());
	}
	
	public String getTheRequisitionNumberCreatedForUtilities() {
		
		String reqNumber = wu.getTextFromWebElement(getDriver(), reqNumberCreated);
		logger.info("Requision Number Generated:  " + reqNumber );
		
		return reqNumber;
	}
	
	
	
}
