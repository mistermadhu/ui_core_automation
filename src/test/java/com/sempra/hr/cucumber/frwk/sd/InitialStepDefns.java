package com.sempra.hr.cucumber.frwk.sd;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.datatable.PreConditionDataTable;
import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.main.TestDataExtractor;
import com.sempra.hr.cucumber.frwk.pageobjects.LoginPage;
import com.sempra.hr.cucumber.frwk.testdrivers.WebDriverFactory;
import com.sempra.hr.cucumber.frwk.util.AESEncryption;
import com.sempra.hr.cucumber.frwk.util.DataAnnoteBeanPopulator;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class InitialStepDefns {
	private WebDriver driver;
	private TestDataExtractor tde;
	private PreConditionDataTable cdTable;
	private CucumberContext cucContext;
	private static final Logger logger = LoggerFactory.getLogger(InitialStepDefns.class);
	public InitialStepDefns(WebDriverFactory driverFactory, CucumberContext cucContext) throws Exception {
		driver=driverFactory.getDriver();
		tde = new TestDataExtractor(FrameworkConstants.TESTDATA_XLS_LOCATION + "/",
				FrameworkConstants.TEST_DATA_FILE);
		this.cucContext=cucContext;
		this.cucContext.setTestDataHandle(tde);
		this.cucContext.setDriver(this.driver);
	 }
  @Given("^I am on Home Page as (.*)$")
	public void i_am_on_Home_Page_as_Admin(String userType, DataTable dtObj) throws Exception {
		// Initialize Scenario - setsPrecondition data, Launches the Browser, Logins as a given user
		logger.info("Logged in as "+userType);
		initializeScenario(dtObj);
	}
  private void initializeScenario(DataTable dtObj) throws Exception
	    {
	              
	               // Populate Precondition data table object
			       cdTable=getPreConditionDataTable(dtObj); 
			       cucContext.setPreConditionDataTable(cdTable);
    			   // Launch Browser
	    	 		launchBrowser();
	    			new LoginPage(this.driver).Login(AESEncryption.decryptText(cdTable.getUserName(), FrameworkConstants.HEXX), AESEncryption.decryptText(cdTable.getPassWord(), FrameworkConstants.HEXX));
	    			logger.info("Waiting for some time ...");
	    			waitForDOMtoBeLoaded();
	    			/*logExtentScreenCapture(LogStatus.PASS, "Launch Vantage Home Page as Admin",
	    					"Expected: User should be able to navigate to Home Page | Actual: Vantage Home Page launched successfully");*/
    }
  private PreConditionDataTable getPreConditionDataTable(DataTable dtObj)
	{
		// Load the update the DataTable
		        PreConditionDataTable cdTable = (PreConditionDataTable) loadDataTable(PreConditionDataTable.class, dtObj);
				logger.info("Updated data table =" + cdTable);
		return cdTable;

	}
  private void launchBrowser() {
		try {
			maximizeWindow();
			// implicitWait(30);
			//deleteAllCookies();
			openUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception while launching the site::" + e);
		}
	}

private void maximizeWindow() {
		driver.manage().window().maximize();
	}

  private void waitForDOMtoBeLoaded() {// implicitWait(int time) {
		// driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		WebDriverWait wdw = new WebDriverWait(this.driver, FrameworkConstants.VERY_LARGE_TIMEOUT);
		wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='logoff']")));
	}

	private void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	private void openUrl() throws Exception {
		driver.get(FrameworkConstants.SITE_URL);
	}

	private Object loadDataTable(Class dataTableClass, DataTable dtObj) {
		// TODO Auto-generated method stub
		try {
			Map<String, List<String>> dataMap = new Hashtable<String, List<String>>();
			List<List<String>> dataTableList = dtObj.raw();
			for (List<String> row : dataTableList) {
				String key = row.get(0).trim();
				if (!key.contains(FrameworkConstants.SHEET_AND_KEY_SEPARATOR)) {
					if (!dataMap.containsKey(key))
						dataMap.put(row.get(0), row.subList(1, row.size()));
				} else {
					String fetchDataDetails[] = key.split(FrameworkConstants.SHEET_AND_KEY_SEPARATOR, -1);
					String sheetName = fetchDataDetails[0].trim();
					String keyColumnHeaderName = fetchDataDetails[1].trim();
					List<List<String>> rawTestDataList = tde.getRawTestData(sheetName, false);
					if (rawTestDataList == null || rawTestDataList.size() == 0)
						throw new Exception("Unable to fetch raw test data from the sheet [" + sheetName + "]");
					// tde.populateTestData(sheetName);
					List<String> tdHeader = rawTestDataList.get(0); // 1st row
																	// is header
					int keyColumnHeaderIndex = -1;
					for (int i = 0; i < tdHeader.size(); i++) {
						String colName = tdHeader.get(i);
						if (colName != null && colName.trim().equalsIgnoreCase(keyColumnHeaderName)) {
							keyColumnHeaderIndex = i;
							break;
						}
					}
					if (keyColumnHeaderIndex == -1) {
						throw new Exception("The Column Header [" + keyColumnHeaderName
								+ "] is not found in data Sheet, Please check the feature file");
					}
					for (int rowIdx = 1; rowIdx < rawTestDataList.size(); rowIdx++) // exclude the 1st row, which is a header
					{
						List<String> rowData = rawTestDataList.get(rowIdx);
						String keyColumnValue = rowData.get(keyColumnHeaderIndex);
						if (keyColumnValue.trim().equalsIgnoreCase(row.get(1).trim())) {
							int index = 0;
							for (String cellValue : rowData) {
								if (index < tdHeader.size()) {
									List<String> valueInList = new ArrayList<>();
									valueInList.add(cellValue);
									dataMap.put(tdHeader.get(index).trim(), valueInList);
									index++;
								}
							}
							break;
						}

					}

				}
			}
			DataAnnoteBeanPopulator populator = new DataAnnoteBeanPopulator(dataMap);
			Object dataInfo = populator.populate(dataTableClass);
			return dataInfo;
		} catch (Exception exp) {
			logger.error("Exception while loading the datatable ::" + exp.getMessage());
			return null;
		}
	}

}
