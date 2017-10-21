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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.datatable.PreConditionDataTable;
import com.sempra.hr.cucumber.frwk.main.TestDataExtractor;
import com.sempra.hr.cucumber.frwk.testtrack.main.TestCaseInfo;
import com.sempra.hr.cucumber.frwk.testtrack.main.TestTrackALMClient;
import com.sempra.hr.cucumber.frwk.util.DataAnnoteBeanPopulator;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

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

	public BasicStepDefns(String workflowName,CucumberContext cucContext){
		logger.info("Web Test :Workflow Name=" + workflowName);
		try {
			setupExtentReport(workflowName);
			this.trdObj = new TestCaseInfo();
			this.driver = cucContext.getDriver();
			this.tde=cucContext.getTestDataHandle();
			this.cdTable=cucContext.getPreConditionDataTable();
		} catch (Exception exp) {
			logger.error("Exception while initializing" + exp);
		}
	}
    protected <T> T retrieveTestData(Class<T> testDataclassType)
    {
    	// Load the test data for this Workflow
		Object etdObj = getTestDataObject(testDataclassType,this.cdTable);
		logger.info("Test data loaded=" + etdObj);
		T tObj=testDataclassType.cast(etdObj);
		return tObj;
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
 	protected void logExtentScreenCapture(LogStatus ls, String msgTitle, String description) {
		/*String CSpage;
		try {
			CSpage = extentReporter.addScreenCapture(getscreenshot());
			extentReporter.log(ls, msgTitle, description + CSpage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

	private void setupExtentReport(String workFlowName) throws Exception {

		extent = new ExtentReports("Report.html", false, DisplayOrder.NEWEST_FIRST);
		extentReporter = extent.startTest("Report",workFlowName+ " Report");
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
