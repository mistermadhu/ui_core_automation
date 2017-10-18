package com.sempra.hr.cucumber.frwk.testtrack.main;

public class TestCaseInfo {

	// Setting all default values
	private double hours = 0.0;
	private long parentEventId = 0L;
	private double totalTimeSpent = 0.0;
	private String testCaseRecordID;
	private String testStatus = "Fail";
	private String strTTUser;
	private String strTTPassword;
	private String testRunSet;
	private String strTTUserFull;
	private String projectName;
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public long getParentEventId() {
		return parentEventId;
	}

	public void setParentEventId(long parentEventId) {
		this.parentEventId = parentEventId;
	}

	public double getTotalTimeSpent() {
		return totalTimeSpent;
	}

	public void setTotalTimeSpent(double totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
	}

	public long getTestCaseRecordID() {
		return Long.parseLong(testCaseRecordID);
	}

	public void setTestCaseRecordID(String testCaseRecordID) {
		this.testCaseRecordID = testCaseRecordID;
	}

	public String getTestStatus() {
		return testStatus;
	}

	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}

	public String getStrTTUser() {
		return strTTUser;
	}

	public void setStrTTUser(String strTTUser) {
		this.strTTUser = strTTUser;
	}

	public String getStrTTPassword() {
		return strTTPassword;
	}

	public void setStrTTPassword(String strTTPassword) {
		this.strTTPassword = strTTPassword;
	}

	public String getTestRunSet() {
		return testRunSet;
	}

	public void setTestRunSet(String testRunSet) {
		this.testRunSet = testRunSet;
	}

	public String getStrTTUserFull() {
		return strTTUserFull;
	}

	public void setStrTTUserFull(String strTTUserFull) {
		this.strTTUserFull = strTTUserFull;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
