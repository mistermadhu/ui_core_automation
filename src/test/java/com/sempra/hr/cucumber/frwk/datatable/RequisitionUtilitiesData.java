package com.sempra.hr.cucumber.frwk.datatable;

import java.io.Serializable;

import com.sempra.hr.cucumber.frwk.annotations.Data;

public class RequisitionUtilitiesData implements Serializable{
	
	@Data(name = "Test_Script_Id")
	private String testCaseID;
	@Data(name = "Permutation_Number")
	private String permutationNo;
	@Data(name = "Helix_Test_Case_Number")
	private String helixTestScriptId;
	@Data(name = "Scenario Name")
	private String scenarioName;
	@Data(name = "Feature_Id")
	private String featureID;
	@Data(name = "Union Job")
	private String unionJob;
	@Data(name = "EC Renewal/Quick Hire")
	private String ecRenewal_QuickHire;
	@Data(name = "Confidential")
	private String confidential;
	@Data(name = "Send to POS")
	private String sendtoPOS;
	@Data(name = "RV")
	private String RV;
	@Data(name = "Number of Positions")
	private String numberofPositions;
	@Data(name = "Company")
	private String company;
	@Data(name = "Paygroup")
	private String paygroup;
	@Data(name = "Department")
	private String department;
	@Data(name = "Division")
	private String division;
	@Data(name = "Division SVP/VP")
	private String divisionSVP_VP;
	@Data(name = "Cost Center")
	private String costCenter;
	@Data(name = "Region Section Code")
	private String regionSectionCode;
	@Data(name = "Budgeted Position")
	private String budgetedPosition;
	@Data(name = "Shared Services")
	private String sharedServices;
	@Data(name = "Eligible for Relocation")
	private String eligibleforRelocation;
	@Data(name = "Eligible for Referral Program")
	private String eligibleforReferralProgram;
	@Data(name = "Referral Amount")
	private String referralAmount;
	@Data(name = "DOT-Safety Sensitive")
	private String dot_SafetySensitive;
	@Data(name = "Location")
	private String Location;
	@Data(name = "Desired Building/Seat Location")
	private String desiredBuilding_SeatLocation;
	@Data(name = "Internal Job Title/Job Code")
	private String internalJobTitle_JobCode;
	@Data(name = "External/Published Job Title")
	private String external_PublishedJobTitle;
	@Data(name = "Base Pay Type")
	private String basePayType;
	@Data(name = "Position Type")
	private String positionType;
	@Data(name = "Regular/Temp")
	private String regular_Temp;
	@Data(name = "Employee Class")
	private String employeeClass;
	@Data(name = "EC Duration")
	private String ecDuration;
	@Data(name = "Agency Conversion Name")
	private String agencyConversionName;
	@Data(name = "Business Justification for Position")
	private String businessJustificationforPosition;
	@Data(name = "Replacement/Addition")
	private String replacement_Addition;
	@Data(name = "Hiring Manager I")
	private String hiringManagerI;
	@Data(name = "Recruiter")
	private String recruiter;
	@Data(name = "Area of Interest")
	private String areaOfInterest;
	@Data(name = "Posting Location")
	private String postingLocation;
	@Data(name = "External Description")
	private String externalDescription;
	@Data(name = "External Requirements")
	private String externalRequirements;
	@Data(name = "Internal Description")
	private String internalDescription;
	@Data(name = "Internal Qualification")
	private String internalQualification;
	@Data(name = "Approver #1")
	private String Approver_1;
	
	
	public String getTestCaseID() {
		return testCaseID.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPermutationNo() {
		return permutationNo.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getHelixTestScriptId() {
		return helixTestScriptId.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getScenarioName() {
		return scenarioName.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getFeatureID() {
		return featureID.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getUnionJob() {
		return unionJob.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEcRenewal_QuickHire() {
		return ecRenewal_QuickHire.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getConfidential() {
		return confidential.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getSendtoPOS() {
		return sendtoPOS.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRV() {
		return RV.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getNumberofPositions() {
		return numberofPositions.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getCompany() {
		return company.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPaygroup() {
		return paygroup.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDepartment() {
		return department.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDivision() {
		return division.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDivisionSVP_VP() {
		return divisionSVP_VP.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getCostCenter() {
		return costCenter.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRegionSectionCode() {
		return regionSectionCode.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getBudgetedPosition() {
		return budgetedPosition.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getSharedServices() {
		return sharedServices.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEligibleforRelocation() {
		return eligibleforRelocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEligibleforReferralProgram() {
		return eligibleforReferralProgram.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReferralAmount() {
		return referralAmount.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDot_SafetySensitive() {
		return dot_SafetySensitive.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getLocation() {
		return Location.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDesiredBuilding_SeatLocation() {
		return desiredBuilding_SeatLocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getInternalJobTitle_JobCode() {
		return internalJobTitle_JobCode.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExternal_PublishedJobTitle() {
		return external_PublishedJobTitle.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getBasePayType() {
		return basePayType.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPositionType() {
		return positionType.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRegular_Temp() {
		return regular_Temp.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEmployeeClass() {
		return employeeClass.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEcDuration() {
		return ecDuration.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getAgencyConversionName() {
		return agencyConversionName.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getBusinessJustificationforPosition() {
		return businessJustificationforPosition.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacement_Addition() {
		return replacement_Addition.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getHiringManagerI() {
		return hiringManagerI.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRecruiter() {
		return recruiter.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getAreaOfInterest() {
		return areaOfInterest.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPostingLocation() {
		return postingLocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExternalDescription() {
		return externalDescription.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExternalRequirements() {
		return externalRequirements.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getInternalDescription() {
		return internalDescription.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getInternalQualification() {
		return internalQualification.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_1() {
		return Approver_1.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	
	

	

		
	
	

	
	
	

}
