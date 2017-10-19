package com.sempra.hr.cucumber.frwk.pageobjects.rm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RequisitionUtilitiesPage extends RequisitionsPage{
	
	private static final Logger logger = LoggerFactory.getLogger(RequisitionsPage.class);
	
	public RequisitionUtilitiesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name = "gridControl2_RTiReq")
	protected WebElement unionJob;
	public void selectUnionJob(String text) throws Exception 
		{
			wu.selectValueFromDropDown(getDriver(), unionJob, text);
		}
	
	@FindBy(name = "gridControl_RTiReq")
	private WebElement ECRenewalORQuickHire;
	
	public void selectECRenewalORQuickHire(String text) throws Exception
		{
			wu.selectValueFromDropDown(getDriver(), ECRenewalORQuickHire, text);
		}
	
	@FindBy(name = "zzreqSendtoPOS_RTiCustomReq")
	private WebElement sendToPOS;
	
	public void selectSendToPOS(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), sendToPOS, text);
	}
	
	@FindBy(name = "zzreqRV_RTiCustomReq")
	private WebElement RV;
	
	public void selectRV(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), RV, text);
	}
	
	
	@FindBy(name = "numOpenings_RTiReq_numberCtr")
	private WebElement numberOfPositions;
	
	public void enterNumberOfPositions(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), numberOfPositions, text);
	}
	
	@FindBy(name = "companyCode_RTiReq")
	private WebElement company;
	public void selectCompany(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), company, text);
	}
	
	@FindBy(name = "payGroupCode_RTiReq")
	private WebElement payGroup;
	public void selectPayGroup(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), payGroup, text);
	}
	
	@FindBy(name = "departmentCode_RTiReq_ms_ac_sf")
	private WebElement department;
	public void enterDepartment(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), department, text);
	}
	
	
	
	@FindBy(name = "zzreqDivisionSempra_RTiCustomReq")
	private WebElement division;
	public void selectDivision(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), division, text);
	}	
	
	@FindBy(name = "zzreqDivisionSVPVP_RTiCustomReq")
	private WebElement divisionSVPORVP;
	public void selectDivisionSVPorVP(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), divisionSVPORVP, text);
	}	
	
	
	@FindBy(name = "costNumCode_RTiReq_ms_ac_sf")
	private WebElement CostCenter;
	public void enterCostCenter(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), CostCenter, text);
	}
		
	@FindBy(name = "zzreqRegionSectionCode_RTiCustomReq")
	private WebElement regionSelectionCode;
	public void selectRegionSelectionCode(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), regionSelectionCode, text);
	}
	
	
	@FindBy(name = "zzreqBudgetedPosition_RTiCustomReq")
	private WebElement budgetedPosition;
	public void selectBudgetedPosition(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), budgetedPosition, text);
	}
	
	@FindBy(name = "zzreqSharedServices2_RTiCustomReq")
	private WebElement sharedServices;
	public void enterSharedServices(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), sharedServices, text);
	}
	
	@FindBy(name = "zzreqEligibleForRelocation_RTiCustomReq")
	private WebElement eligibleForRelocation;
	public void selectEligibleForRelocation(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), eligibleForRelocation, text);
	}
	
	@FindBy(name = "erpBonusType_RTiReq")
	private WebElement eligibleForReferral;
	public void selectEligibleForReferral(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), eligibleForReferral, text);
	}	
	
	@FindBy(name = "zzreqReferralAmount_RTiCustomReq")
	private WebElement referralAmount;
	public void selectReferralAmount(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), referralAmount, text);
	}
	
	
	
	
	@FindBy(name = "gridControl3_RTiReq")
	private WebElement dotSafetySensitive;	
	public void selectDOTSafetySensitive(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), dotSafetySensitive, text);
	}
	
	@FindBy(name = "locationCode_RTiReq_ms_ac_sf")
	private WebElement location;
	public void enterLocation(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), location, text);
	}
	
	@FindBy(name = "zzreqDesiredBldgSeatLocation_RTiCustomReq")
	private WebElement desiredBuildingORSeatLocation;
	public void enterDesiredBuildingORSeatLocation(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), desiredBuildingORSeatLocation, text);
	}
	
	
	@FindBy(name = "positionCode_RTiReq_ms_ac_sf")
	private WebElement internalJobTitleORJobCode;
	public void enterInternalJobTitleORJobCode(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), internalJobTitleORJobCode, text);
	}	
	
	
	@FindBy(name = "ptitle_RTiReq")
	private WebElement externalPublishedJobTitle;
	public void enterExternalPublishedJobTitle(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), externalPublishedJobTitle, text);
	}	
	
	
	@FindBy(name = "payType_RTiReq")
	private WebElement basePayType;
	public void selectBasePayType(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), basePayType, text);
	}	
	
	@FindBy(name = "typeOfFulltime_RTiReq")
	private WebElement positionType;
	public void selectPositionType(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), positionType, text);
	}
	
	@FindBy(name = "zzregTemp_RTiCustomReq")
	private WebElement regularOrTemp;	
	public void selectRegularOrTemp(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), regularOrTemp, text);
	}	
	@FindBy(name = "zzreqEmployeeClass_RTiCustomReq")
	private WebElement employeeClass;
	public void selectEmployeeClass(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), employeeClass, text);
	}	
	
	@FindBy(name = "zzreqECDuration_RTiCustomReq")
	private WebElement ecDuration;
	public void selectECduration(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), ecDuration, text);
	}	
	
	
	@FindBy(name = "zzreqAgencyConversionName_RTiCustomReq")
	private WebElement agencyConverionName;
	public void enterAgencyConversionName(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), agencyConverionName, text);
	}
	
	@FindBy(name = "zzreqBizJustificationforPosition2_RTiCustomReq")
	private WebElement businessJustificationForPosition;
	public void enterBusinessJustificationForPosition(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), businessJustificationForPosition, text);
	}
	
	@FindBy(name = "typeOfNew_RTiReq")
	private WebElement replacementOrAddition;
	public void selectReplacementOrAddition(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), replacementOrAddition, text);
	}	
	
	
	@FindBy(name = "_recruiterID00004010_RTiReq_ms_ac_sf")
	private WebElement hiringManager1;
	public void enterHiringManager(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), hiringManager1, text);
	}
	
	
	@FindBy(name = "_recruiterID00004020_RTiReq")
	private WebElement recruiter;
	public void selectRecruiter(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), recruiter, text);
	}		
	
	@FindBy(name = "grp_RTiReq")
	private WebElement areaOfInterest;
	public void selectAreaOfInterest(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), areaOfInterest, text);
	}	
	
	
	@FindBy(name = "postingLocationCode_RTiReq")
	private WebElement postingLocation;
	public void selectPostingLocation(String text) throws Exception
	{
		wu.selectValueFromDropDown(getDriver(), postingLocation, text);
	}	
	
	@FindBy(id = "description_RTiReq_ifr")
	private WebElement externalDescription;
	public void enterExternalDescription(String text) throws Exception
	{
		wu.iframesSwitchToChild(getDriver(), externalDescription);
		wu.sendKeysToWebElement(getDriver(), externalDescription, text);
		wu.iframesSwitchToParent(getDriver());
	}	
	
	@FindBy(id = "requirements_RTiReq_ifr")
	private WebElement externalRequirement;	
	public void enterExternalRequirement(String text) throws Exception
	{
		wu.iframesSwitchToChild(getDriver(), externalRequirement);
		wu.sendKeysToWebElement(getDriver(), externalRequirement, text);
		wu.iframesSwitchToParent(getDriver());
	}
	
	@FindBy(id = "internalDescription_RTiReq_ifr")
	private WebElement internalDescription;
	public void enterInternalDescription(String text) throws Exception
	{
		wu.iframesSwitchToChild(getDriver(), internalDescription);
		wu.sendKeysToWebElement(getDriver(), internalDescription, text);
		wu.iframesSwitchToParent(getDriver());
	}	
	
	@FindBy(id = "zzreqInternalQualifications_RTiCustomReq_ifr")
	private WebElement internalQualification;
	public void enterInternalQualification(String text) throws Exception
	{
		wu.iframesSwitchToChild(getDriver(), internalQualification);
		wu.sendKeysToWebElement(getDriver(), internalQualification, text);
		wu.iframesSwitchToParent(getDriver());
	}	
		
	@FindBy(name = "approver1ID_RTiReq_ms_ac_sf")
	private WebElement approver1;
	
	public void enterApprover1(String text) throws Exception
	{
		wu.sendKeysToWebElement(getDriver(), approver1, text);
	}
	
	
	@FindBy(id = "_reqform_create2_button")
	private WebElement createButton;
	public void clickCreateButton() throws Exception
	{
		wu.clickWebElement(getDriver(), createButton);
	}
	
}
