package com.sempra.hr.cucumber.frwk.testtrack.main;

public class TestCaseInfo {

   // Setting all default values
	private double hours = 0.0;
	private long parentEventId = 0L;
	private double totalTimeSpent = 0.0;
	private long testCaseRecordID = 22746L;
	private String testStatus = "Fail";
	private String strTTUser = "SempraHQ";// "Administrator";
	private String strTTPassword = "Vantage2018!";
	private String testRunSet = "UAT Cycle 1";//"Beta 4 Tests";// "Alpha 1 Tests";
	private String strTTUserFull = "Automation Team, ProKarma";
	private String projectName ="Sandbox My Info";// "NEW My Info,the next generations";//"Sandbox - My Info, the next gen";

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
		return testCaseRecordID;
	}
	public void setTestCaseRecordID(long testCaseRecordID) {
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
