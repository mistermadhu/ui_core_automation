package com.sempra.hr.cucumber.frwk.main;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sempra.hr.cucumber.frwk.testdrivers.SynchronizedIEDriver;
import com.sempra.hr.cucumber.frwk.util.DataAnnoteBeanPopulator;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class WebTestHelper { // Cucumber runtime creates a default instance of this class
	private ExtentReports extent;
	private ExtentTest extentReporter;
	private static WebDriver driver = null;
	private TestDataExtractor tde;
	private static final Logger logger = LoggerFactory.getLogger(WebTestHelper.class);
	public  WebTestHelper(String workflowName){
		logger.info("Web Test :Workflow Name="+workflowName);
		try
		{
			setupExtentReport();
			tde=new TestDataExtractor(FrameworkConstants.TESTDATA_XLS_LOCATION+"/",FrameworkConstants.TEST_DATA_FILE);
		}
		catch(Exception exp)
		{
			logger.error("Exception while initializing" +exp);
		}
	}
   public WebDriver getDriver()
   {
	   return driver;
   }
  public void launchBrowser()
  {
	    try {
		openBrowser();
		maximizeWindow();
		//implicitWait(30);
		deleteAllCookies();
		openUrl();
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception while launching the site::"+e);
		}
  }
   public void logExtentScreenCapture(LogStatus ls,String msgTitle, String description)
   {
	   String CSpage;
	try {
		CSpage = extentReporter.addScreenCapture(getscreenshot());
		extentReporter.log(ls, msgTitle,description+ CSpage);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   }
   private void setupExtentReport() throws Exception {
		
		extent = new ExtentReports("Report.html", false, DisplayOrder.NEWEST_FIRST);
		extentReporter = extent.startTest("Report", "EligibilityStepFile report");
	}
 
public void tearDown(Scenario scenario) { 
	try {
	if (scenario.getStatus().equalsIgnoreCase("failed")) {
	       	File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName = scenario.getName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
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

 

 protected String getscreenshot() throws Exception {
	UUID uuid = UUID.randomUUID();
	String strFile = "src/test/results/screenshot-" + uuid + ".png";
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File(strFile));
	return strFile;
}
//print the path
private void openBrowser() throws Exception {
	if (FrameworkConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		 System.setProperty("webdriver.gecko.driver",
				 System.getProperty("user.dir") +"/"+FrameworkConstants.WEBDRIVER_FOLDER_LOCATION+"/geckodriver.exe");
		driver = new FirefoxDriver(); 
	} else if (FrameworkConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") +"/"+ FrameworkConstants.WEBDRIVER_FOLDER_LOCATION+"/chromedriver.exe");
		driver = new ChromeDriver();
		/* Windows Defender wants to reset your settings -Fix for this ERROR IN CHROME BROWSER
		HKEY_CURRENT_USER\Software\Google\Chrome\TriggeredReset
		There are a couple of values in this key; product name i.e. Windows Defender 
		or whatever other AV you are using and a timestamp. 
		These don't matter. Make sure your browser is closed and then delete the TriggeredReset Key
*/	}
	else
	{
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		System.setProperty("webdriver.ie.driver", 
				 System.getProperty("user.dir") + "/"+ FrameworkConstants.WEBDRIVER_FOLDER_LOCATION+"/IEDriverServer.exe");
		driver = new SynchronizedIEDriver(capability);
	}
}

private void maximizeWindow() {
	driver.manage().window().maximize();
}

public void waitForDOMtoBeLoaded(){//implicitWait(int time) {
	//driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	WebDriverWait wdw=new WebDriverWait(this.driver,FrameworkConstants.VERY_LARGE_TIMEOUT);
	wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[src*='logoff']")));
}

private void deleteAllCookies() {
	driver.manage().deleteAllCookies();
}

private void openUrl() throws Exception {
	driver.get(FrameworkConstants.SITE_URL);
}
public Object loadDataTable(Class class1, DataTable dtObj) {
	// TODO Auto-generated method stub
  try
  {
	Map<String,List<String>> dataMap=new Hashtable<String,List<String>>();
	List<List<String>> dataTableList=dtObj.raw();
	for(List<String> row : dataTableList)
	{
		String key=row.get(0).trim();
		if(!key.contains(FrameworkConstants.SHEET_AND_KEY_SEPARATOR))
		{
			if(!dataMap.containsKey(key))
			dataMap.put(row.get(0), row.subList(1,row.size()));
		}
		else
		{
			String fetchDataDetails[]=key.split(FrameworkConstants.SHEET_AND_KEY_SEPARATOR,-1);
			String sheetName=fetchDataDetails[0].trim();
			String keyColumnHeaderName=fetchDataDetails[1].trim();
			List<List<String>> rawTestDataList= tde.getRawTestData(sheetName,false);
			if(rawTestDataList==null || rawTestDataList.size()==0)
				throw new Exception("Unable to fetch raw test data from the sheet ["+sheetName+"]");
			//tde.populateTestData(sheetName);
			List<String> tdHeader=rawTestDataList.get(0); // 1st row is header
			int keyColumnHeaderIndex=-1;
			for(int i=0;i<tdHeader.size();i++)
			{
				String colName=tdHeader.get(i);
				if(colName!=null&&colName.trim().equalsIgnoreCase(keyColumnHeaderName))
					{
					keyColumnHeaderIndex=i;
					break;
					}
			}
		    if(keyColumnHeaderIndex==-1)
		    {
		    	throw new Exception("The Column Header ["+keyColumnHeaderName+"] is not found in data Sheet, Please check the feature file");
		    }
			for(int rowIdx=1;rowIdx<rawTestDataList.size();rowIdx++) //exclude the 1st rows, which is a header
			{
				List<String> rowData=rawTestDataList.get(rowIdx);
				String keyColumnValue=rowData.get(keyColumnHeaderIndex);
				if(keyColumnValue.trim().equalsIgnoreCase(row.get(1).trim()))
				{
					int index=0;
					for(String cellValue:rowData )
					{
					  if(index<tdHeader.size())
					  {
						List<String> valueInList=new ArrayList<>();
						valueInList.add(cellValue);
						dataMap.put(tdHeader.get(index).trim(),valueInList);
						index++;
					  }
					}
					break;
				}
				
			}

		}
	}
	DataAnnoteBeanPopulator populator = new DataAnnoteBeanPopulator(dataMap);
	Object dataInfo =populator.populate(class1);
	return dataInfo;
  }
  catch(Exception exp)
  {
	  logger.error("Exception while loading the datatable ::"+exp.getMessage());
	  return null;
  }
}

public Object getFeatureTestData(Class class1,String featureID,String testcaseID,String iterationNo, boolean isCommon)
{
	try
	{
	Map<String,List<String>> dataMap;
	List<String>dataList=null;
	List<String>dataHeaders;
	if(isCommon)
	{
		tde.populateCommonData();
		dataMap=tde.getCommonDataMap();
		dataHeaders=tde.getCommonDataHeaders();
	}
	else
	{
	   tde.populateFeatureData(featureID);
	   dataMap=tde.getFeatureDataMap();
	   dataHeaders=tde.getFeatureDataHeaders();
	}
	if(dataMap.size()!=0)
		dataList=dataMap.get((testcaseID+"-"+iterationNo+"-"+featureID).replaceAll(" ", ""));
	if(dataList==null || dataList.size()==0)
		throw new Exception("Unable to fetch test data");
	// Convert data map with value as List
	Map<String,List<String>> dataMapList=new Hashtable<>();
	int idx=0;
	for(String val:dataList)
	{
        List<String> aList=new ArrayList();
        aList.add(val);
		dataMapList.put(dataHeaders.get(idx+1), aList);
		idx++;
	}
	DataAnnoteBeanPopulator populator = new DataAnnoteBeanPopulator(dataMapList);
	Object dataInfo =populator.populate(class1);
	return dataInfo;
	}
	catch(Exception exp)
	{
		logger.error("Exception while fetching the test data for the Feature["+featureID+"]::"+exp);
		return null;
	}
}

}
