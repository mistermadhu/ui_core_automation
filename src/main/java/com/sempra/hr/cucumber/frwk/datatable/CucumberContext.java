package com.sempra.hr.cucumber.frwk.datatable;

import org.openqa.selenium.WebDriver;

import com.sempra.hr.cucumber.frwk.main.TestDataExtractor;

public class CucumberContext {
 
	private PreConditionDataTable preConditionDataTable;
    private TestDataExtractor testDataHandle;
    private WebDriver driver;	
	public PreConditionDataTable getPreConditionDataTable() {
		return preConditionDataTable;
	}

	public void setPreConditionDataTable(PreConditionDataTable preConditionDataTable) {
		this.preConditionDataTable = preConditionDataTable;
	}

	public TestDataExtractor getTestDataHandle() {
		return testDataHandle;
	}

	public void setTestDataHandle(TestDataExtractor testDataHandle) {
		this.testDataHandle = testDataHandle;
	}
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}