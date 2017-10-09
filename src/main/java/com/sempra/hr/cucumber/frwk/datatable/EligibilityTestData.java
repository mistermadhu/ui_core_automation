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
	
	@Data(name="TC ID")
	 private String testCaseID;
	@Data(name="IterationNo")
	 private String iterationNo;
	@Data(name="Scenario Name")
	 private String scenarioName;
	@Data(name="RM ID")
	 private String rmID;
	@Data(name="Emp ID")
	 private String empID;
	@Data(name="Employee Name")
	 private String employeeName;
	
	public String getTestCaseID() {
		return testCaseID.replaceAll("\\[", "").replaceAll("\\]","");
	}
	public String getIterationNo() {
		return iterationNo.replaceAll("\\[", "").replaceAll("\\]","");
	}
	public String getScenarioName() {
		return scenarioName.replaceAll("\\[", "").replaceAll("\\]","");
	}
	public String getRmID() {
		return rmID.replaceAll("\\[", "").replaceAll("\\]","");
	}
	public String getEmpID() {
		return empID.replaceAll("\\[", "").replaceAll("\\]","");
	}
	public String getEmployeeName() {
		return employeeName.replaceAll("\\[", "").replaceAll("\\]","");
	}
	@Override
	public String toString() {
		return "EligibilityTestData [testCaseID=" + testCaseID + ", iterationNo=" + iterationNo + ", scenarioName="
				+ scenarioName + ", rmID=" + rmID + ", empID=" + empID + ", employeeName=" + employeeName + "]";
	}
	


}
