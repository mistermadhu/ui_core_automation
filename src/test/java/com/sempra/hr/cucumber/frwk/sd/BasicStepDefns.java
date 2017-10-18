package com.sempra.hr.cucumber.frwk.sd;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.PreConditionDataTable;
import com.sempra.hr.cucumber.frwk.main.TestDataExtractor;
import com.sempra.hr.cucumber.frwk.pageobjects.LoginPage;
import com.sempra.hr.cucumber.frwk.testdrivers.WebDriverFactory;
import com.sempra.hr.cucumber.frwk.testtrack.main.TestCaseInfo;
import com.sempra.hr.cucumber.frwk.testtrack.main.TestTrackALMClient;
import com.sempra.hr.cucumber.frwk.util.AESEncryption;
import com.sempra.hr.cucumber.frwk.util.DataAnnoteBeanPopulator;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.DataTable;
import cucumber.api.Scenario;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class BasicStepDefns { // Cucumber runtime creates a default instance of
								// this class
	private ExtentReports extent;
	private ExtentTest extentReporter;
	private TestDataExtractor tde;
	private WebDriver driver = null;
	private PreConditionDataTable cdTable;
	protected TestCaseInfo trdObj;
	private static final Logger logger = LoggerFactory.getLogger(BasicStepDefns.class);

	public BasicStepDefns(String workflowName, WebDriverFactory driverFactory) {
		logger.info("Web Test :Workflow Name=" + workflowName);
		try {
			setupExtentReport();
			tde = new TestDataExtractor(FrameworkConstants.TESTDATA_XLS_LOCATION + "/",
					FrameworkConstants.TEST_DATA_FILE);
			trdObj = new TestCaseInfo();
			driver = driverFactory.getDriver();
		} catch (Exception exp) {
			logger.error("Exception while initializing" + exp);
		}
	}
    protected <T> T initializeScenario(Class<T> testDataclassType, DataTable dtObj) throws Exception
    {
    	       // Populate Precondition data table object
    			cdTable=getPreConditionDataTable(dtObj);
    			
    			// Load the test data for this Workflow
    			Object etdObj = getTestDataObject(testDataclassType,cdTable); 
    			
    			logger.info("Test data loaded=" + etdObj);
    			// Launch Browser
    			launchBrowser();
    			new LoginPage(getDriver()).Login(AESEncryption.decryptText(cdTable.getUserName(), FrameworkConstants.HEXX), AESEncryption.decryptText(cdTable.getPassWord(), FrameworkConstants.HEXX));
    			logger.info("Waiting for some time ...");
    			waitForDOMtoBeLoaded();
    			logExtentScreenCapture(LogStatus.PASS, "Launch Vantage Home Page as Admin",
    					"Expected: User should be able to navigate to Home Page | Actual: Vantage Home Page launched successfully");
    			T tObj=testDataclassType.cast(etdObj);
    			return tObj;
    }
	private PreConditionDataTable getPreConditionDataTable(DataTable dtObj)
	{
		// Load the update the DataTable
		        PreConditionDataTable cdTable = (PreConditionDataTable) loadDataTable(PreConditionDataTable.class, dtObj);
				logger.info("Updated data table =" + cdTable);
		return cdTable;

	}
	private  <T> T getTestDataObject( Class<T> testDataclassType, PreConditionDataTable cdTable)
	{
		 Object obj=getFeatureTestData(testDataclassType, cdTable.getWorksheetID(),
					cdTable.getTestcaseID(), cdTable.getPermutationNo(), FrameworkConstants.IS_COMMON);
		 T tObj=testDataclassType.cast(obj);
		return tObj;
	}
	protected WebDriver getDriver() {
		return this.driver;
	}
    
	private void launchBrowser() {
		try {
			maximizeWindow();
			// implicitWait(30);
			deleteAllCookies();
			openUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception while launching the site::" + e);
		}
	}

	protected void logExtentScreenCapture(LogStatus ls, String msgTitle, String description) {
		String CSpage;
		try {
			CSpage = extentReporter.addScreenCapture(getscreenshot());
			extentReporter.log(ls, msgTitle, description + CSpage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void setupExtentReport() throws Exception {

		extent = new ExtentReports("Report.html", false, DisplayOrder.NEWEST_FIRST);
		extentReporter = extent.startTest("Report", "EligibilityStepFile report");
	}

	private String getscreenshot() throws Exception {
		UUID uuid = UUID.randomUUID();
		String strFile = "src/test/results/screenshot-" + uuid + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(strFile));
		return strFile;
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

	private Object getFeatureTestData(Class class1, String featureID, String testcaseID, String iterationNo,
			boolean isCommon) {
		try {
			Map<String, List<String>> dataMap;
			List<String> dataList = null;
			List<String> dataHeaders;
			if (isCommon) {
				tde.populateCommonData();
				dataMap = tde.getCommonDataMap();
				dataHeaders = tde.getCommonDataHeaders();
			} else {
				tde.populateFeatureData(featureID);
				dataMap = tde.getFeatureDataMap();
				dataHeaders = tde.getFeatureDataHeaders();
			}
			if (dataMap.size() != 0)
				dataList = dataMap.get((testcaseID + "-" + iterationNo + "-" + featureID).replaceAll(" ", ""));
			if (dataList == null || dataList.size() == 0)
				throw new Exception("Unable to fetch test data");
			// Convert data map with value as List
			Map<String, List<String>> dataMapList = new Hashtable<>();
			int idx = 0;
			for (String val : dataList) {
				List<String> aList = new ArrayList();
				aList.add(val);
				dataMapList.put(dataHeaders.get(idx + 1), aList);
				if(idx == dataHeaders.size()-2)
					break;
				idx++;
			}
			DataAnnoteBeanPopulator populator = new DataAnnoteBeanPopulator(dataMapList);
			Object dataInfo = populator.populate(class1);
			return dataInfo;
		} catch (Exception exp) {
			logger.error("Exception while fetching the test data for the Feature[" + featureID + "]::" + exp);
			return null;
		}
	}

	protected String getCurrentDate(String format) {
		DateFormat df = new SimpleDateFormat(format);
		String date = df.format(new Date());
		return date;
	}

	protected PreConditionDataTable getCdTable() {
		return cdTable;
	}

	private  void passTestCase()
	{
		// Set Test Case Status
		trdObj.setStrTTUser(FrameworkConstants.ALM_USER);
		trdObj.setStrTTPassword(FrameworkConstants.ALM_PASS);
		trdObj.setTestRunSet(FrameworkConstants.ALM_TEST_RUN);
		trdObj.setStrTTUserFull(FrameworkConstants.ALM_USER_FULL);
		trdObj.setProjectName(FrameworkConstants.ALM_PROJECT);
	}

	protected void tearDown(Scenario scenario) {
		try {
			//Update Test case info
			 passTestCase();
			// Update ALM
			if (FrameworkConstants.IS_ALM_UPDATE) {
				TestTrackALMClient.INSTANCE.createAndUpdateTestRun(trdObj);
			}
			if (scenario.getStatus().equalsIgnoreCase("failed")) {
				File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String failureImageFileName = scenario.getName()
						+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
				File failureImageFile = new File(
						System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
				FileUtils.copyFile(imageFile, failureImageFile);
			}
			extent.endTest(extentReporter);
			extent.flush();
			extent.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
