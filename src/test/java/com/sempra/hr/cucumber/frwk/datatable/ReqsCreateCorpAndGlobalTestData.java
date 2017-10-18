package com.sempra.hr.cucumber.frwk.datatable;

import java.io.Serializable;

import com.sempra.hr.cucumber.frwk.annotations.Data;

public class ReqsCreateCorpAndGlobalTestData implements Serializable{

	private static final long serialVersionUID = 1L;

	@Data(name = "Feature_Id")
	private String featureID;
	@Data(name="Skip_Test")	
	private String skip_Test;
	@Data(name="Test_Script_Id")	
	private String test_Script_Id;
	@Data(name="Permutation_Number")	
	private String permutation_Number;
	@Data(name="Helix_Test_Case_Number")	
	private String helix_Test_Case_Number;
	@Data(name="Recruiting Type")	
	private String recruitingType;
	@Data(name="Union Job")	
	private String unionJob;
	@Data(name="Requisition Status Detail")	
	private String requisitionStatusDetail;
	@Data(name="EC Renewal/Quick Hire")	
	private String ecRenewal_QuickHire;
	@Data(name="Confidential")	
	private String confidential;
	@Data(name="Number of Positions")	
	private String numberofPositions;
	@Data(name="Company")	
	private String company;
	@Data(name="Paygroup")	
	private String paygroup;
	@Data(name="Department")
	private String department;
	@Data(name="Cost Center")	
	private String costCenter;
	@Data(name="Desired Building/SeatLocation")	
	private String desiredBuilding_SeatLocation;
	@Data(name="Eligible for Relocation")	
	private String eligibleforRelocation;
	@Data(name="Eligible for Referral Program")	
	private String eligibleforReferralProgram;
	@Data(name="DOT-Pipeline Operations or CDL")	
	private String dot_PipelineOperationsorCDL;
	@Data(name="DOT-SafetySensitive")	
	private String dot_SafetySensitive;
	@Data(name="VERequ#")	
	private String veRequ_;
	@Data(name="Location")	
	private String location;
	@Data(name="Internal Job Title/JobCode")	
	private String internalJobTitle_JobCode;
	@Data(name="External/Published Job Title")	
	private String external_PublishedJobTitle;
	@Data(name="Base Pay Type")	
	private String basePayType;
	@Data(name="ICP Target")	
	private String icpTarget;
	@Data(name="Exempt/NonExempt(FLSA)")
	private String exempt_NonExempt_FLSA;
	@Data(name="Position Type")	
	private String positionType;
	@Data(name="Regular/Temp")	
	private String regular_Temp;
	@Data(name="Employee Class")
	private String employeeClass;
	@Data(name="EC Duration")	
	private String ecDuration;
	@Data(name="Replacement/Addition")	
	private String replacement_Addition;
	@Data(name="Replacement Reason for Leaving*")	
	private String replacementReasonforLeaving;
	@Data(name="ReplacementFor*")	
	private String replacementFor_;
	@Data(name="Replacement For 2")	
	private String replacementFor2;
	@Data(name="Replacement For 3")	
	private String replacementFor3;
	@Data(name="Replacement For 4+")	
	private String replacementFor4_;
	@Data(name="Auto-Assign Multipel Owners?")	
	private String auto_AssignMultipelOwners;
	@Data(name="Hiring Mgr I")	
	private String hiringMgrI;
	@Data(name="Recruiter")	
	private String recruiter;
	@Data(name="Recruiter Assistant")	
	private String recruiterAssistant;
	@Data(name="Area of Interest")	
	private String areaofInterest;
	@Data(name="Posting Location")	
	private String postingLocation;
	@Data(name="Alternate Posting Locations")	
	private String alternatePostingLocations;
	@Data(name="External Description")	
	private String externalDescription;
	@Data(name="External Qualifications")	
	private String externalQualifications;
	@Data(name="Internal Description")	
	private String internalDescription;
	@Data(name="Internal Qualification")	
	private String internalQualification;
	@Data(name="Approver #1")	
	private String approver_1;
	@Data(name="Approver #2")	
	private String approver_2;
	@Data(name="Approver #3")	
	private String approver_3;
	@Data(name="Approver #4")	
	private String approver_4;
	@Data(name="Approver #5")	
	private String approver_5;
	@Data(name="Approver #6")	
	private String approver_6;
	@Data(name="Approver#7")	
	private String approver_7;
	@Data(name="Approver #8")	
	private String approver_8;
	@Data(name="Comments / Questions")	
	private String comments_Questions;
	@Data(name="TestScriptId + PermutationNumber")	
	private String testScriptId_PermutationNumber;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFeatureID() {
		return featureID.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getSkip_Test() {
		return skip_Test.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getTest_Script_Id() {
		return test_Script_Id.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPermutation_Number() {
		return permutation_Number.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getHelix_Test_Case_Number() {
		return helix_Test_Case_Number.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRecruitingType() {
		return recruitingType.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getUnionJob() {
		return unionJob.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRequisitionStatusDetail() {
		return requisitionStatusDetail.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEcRenewal_QuickHire() {
		return ecRenewal_QuickHire.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getConfidential() {
		return confidential.replaceAll("\\[", "").replaceAll("\\]", "");
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
	public String getCostCenter() {
		return costCenter.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDesiredBuilding_SeatLocation() {
		return desiredBuilding_SeatLocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEligibleforRelocation() {
		return eligibleforRelocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getEligibleforReferralProgram() {
		return eligibleforReferralProgram.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDot_PipelineOperationsorCDL() {
		return dot_PipelineOperationsorCDL.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getDot_SafetySensitive() {
		return dot_SafetySensitive.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getVeRequ_() {
		return veRequ_.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getLocation() {
		return location.replaceAll("\\[", "").replaceAll("\\]", "");
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
	public String getIcpTarget() {
		return icpTarget.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExempt_NonExempt_FLSA() {
		return exempt_NonExempt_FLSA.replaceAll("\\[", "").replaceAll("\\]", "");
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
	public String geteCDuration() {
		return ecDuration.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacement_Addition() {
		return replacement_Addition.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacementReasonforLeaving() {
		return replacementReasonforLeaving.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacementFor_() {
		return replacementFor_.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacementFor2() {
		return replacementFor2.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacementFor3() {
		return replacementFor3.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getReplacementFor4_() {
		return replacementFor4_.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getAuto_AssignMultipelOwners() {
		return auto_AssignMultipelOwners.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getHiringMgrI() {
		return hiringMgrI.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRecruiter() {
		return recruiter.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getRecruiterAssistant() {
		return recruiterAssistant.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getAreaofInterest() {
		return areaofInterest.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getPostingLocation() {
		return postingLocation.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getAlternatePostingLocations() {
		return alternatePostingLocations.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExternalDescription() {
		return externalDescription.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getExternalQualifications() {
		return externalQualifications.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getInternalDescription() {
		return internalDescription.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getInternalQualification() {
		return internalQualification.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_1() {
		return approver_1.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_2() {
		return approver_2.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_3() {
		return approver_3.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_4() {
		return approver_4.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_5() {
		return approver_5.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_6() {
		return approver_6.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_7() {
		return approver_7.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getApprover_8() {
		return approver_8.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getComments_Questions() {
		return comments_Questions.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	public String getTestScriptId_PermutationNumber() {
		return testScriptId_PermutationNumber.replaceAll("\\[", "").replaceAll("\\]", "");
	}
	
	
}
