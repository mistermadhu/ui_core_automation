package com.sempra.hr.cucumber.frwk.datatable;

import java.io.Serializable;

import com.sempra.hr.cucumber.frwk.annotations.Data;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class EligibilityTestData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Data(name = "Test_Script_Id")
	private String testCaseID;
	@Data(name = "Permutation_Number")
	private String permutationNo;
	@Data(name = "Scenario Name")
	private String scenarioName;
	@Data(name = "Feature_Id")
	private String featureID;
	@Data(name = "Emp ID")
	private String empID;
	@Data(name = "Employee Name")
	private String employeeName;

	public String getTestCaseID() {
		return testCaseID.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	public String getScenarioName() {
		return scenarioName.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	public String getRmID() {
		return featureID.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	public String getEmpID() {
		return empID.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	public String getEmployeeName() {
		return employeeName.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	public String getPermutationNo() {
		return permutationNo.replaceAll("\\[", "").replaceAll("\\]", "");
	}

	@Override
	public String toString() {
		return "EligibilityTestData [testCaseID=" + testCaseID + ", permutationNo=" + permutationNo + ", scenarioName="
				+ scenarioName + ", rmID=" + featureID + ", empID=" + empID + ", employeeName=" + employeeName + "]";
	}

}
