package com.sempra.hr.cucumber.frwk.main;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sempra.hr.cucumber.frwk.opts.CucumberRuntimeOptions;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.runtime.ClassFinder;
import cucumber.runtime.CucumberException;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;

/* @CucumberOptions(
		strict = true,
		monochrome = true//, 
		//glue = "com/sempra/hr/cucumber/frwk/sd",
		//plugin = {"pretty", "html:target/cucumber-html-report" },
		//tags={"@Regression"}
		)*/
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */ 
public class CucumberRunner {

	
	private static final Logger logger = LoggerFactory.getLogger(CucumberRunner.class);
	//private TestNGCucumberRunner testNGCucumberRunner;
    private String featureFileName;
    private String glue;
    private String tags;
    

	public static String currentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String cal1 = dateFormat.format(cal.getTime());
		return cal1;
	}
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
      //  testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }


	@BeforeSuite(alwaysRun = true)	
	public void setUp() throws Exception {
	
	}
	@BeforeTest(alwaysRun = true)
	@Parameters({"cucumber.features","cucumber.glue","cucumber.tags","testdata.file","isCommon"})
	public void beforeTest(String featureFileName, String glue, String tags, String testdataFile,Boolean isCommon)
	{
		FrameworkConstants.TEST_DATA_FILE=testdataFile;
		FrameworkConstants.IS_COMMON=isCommon;
		this.featureFileName=featureFileName;
		this.glue=glue;
		this.tags=tags;
		logger.info("This is a suite with featuerFileName="+featureFileName);
		
	}
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod()
	{
		 

	}
 
   @Test(groups = "cucumber", description = "Runs Cucumber Feature")
    public void runCucumberScenarioOutlines() {
	   if(FrameworkConstants.IS_DRY_RUN)
	   {
	    logger.info("<--------- DRY RUN MODE --------->");
	    System.setProperty("cucumber.options", "-d");
	   }
   	    logger.info("Inside Cucumber Scenario @Test ="+this.getTestName());
   	    logger.info(String.format("Run Feature - %s", this.featureFileName));
   	    runCucumber();
    }
   private void runCucumber()
   {
   	//testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
   	//logger.info("Name="+name);
  		try {
  			    // Set TestNG parameters and Get Runtime Options object
  		 	    RuntimeOptions ro=new CucumberRuntimeOptions(this.featureFileName,this.glue,this.tags).getCucumberRuntimeOptions();
		   		
  		 	    ClassLoader classLoader = getClass().getClassLoader();
		 	    ResourceLoader resourceLoader = new MultiLoader(classLoader);
		   		ClassFinder classFinder = new ResourceLoaderClassFinder(resourceLoader, classLoader);
		   		cucumber.runtime.Runtime runtime = new cucumber.runtime.Runtime(resourceLoader, classFinder, classLoader, ro);
		 	    try {
		 	        runtime.run();
		 	    } catch (IOException ex) {
		 	        throw new RuntimeException(ex);
		 	    }
		 	    if (!runtime.getErrors().isEmpty()) {
		 	        logger.debug(runtime.getErrors().toString());
		 	        throw new CucumberException(runtime.getErrors().get(0));
		 	    }
  			  logger.info("After setting cucumber runtime parameters");
		     /* Object[][] array=testNGCucumberRunner.provideFeatures();
		  	   if(array!=null)
		  	    {
		  	        for (Object[] row : array)
		  	        {
		  	            Arrays.fill(row, 0);
		  	           logger.info("*******="+Arrays.toString(row));
		  	        }
		  	    }*/
  		} catch (Throwable e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
   }
	
	@AfterMethod(alwaysRun = true)
	public void tearDownr(ITestResult result) throws IOException {
		/*if (result.isSuccess()) {
			File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName = result.getMethod().getMethodName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
			FileUtils.copyFile(imageFile, failureImageFile);
		}*/

	}

	@AfterTest(alwaysRun = true)
	public void afterTest()
	{
	}

	

	@AfterSuite(alwaysRun = true)
	public void quit() throws IOException, InterruptedException {
		//driver.quit();
	}
	/**
     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
     */
   /* @DataProvider
    public Object[][] features() {
    	logger.info("Provider=feature");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  	    Object[][] array=testNGCucumberRunner.provideFeatures();
	   if(array!=null)
	    {
	        for (Object[] row : array)
	        {
	            Arrays.fill(row, 0);
	           logger.info(Arrays.toString(row));
	        }
	    }
	  
	   
        return array;
    }
*/
	@AfterClass(alwaysRun = true)
	public void takeScreenshot() throws IOException {
		/*File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "//screenshots/screenshot.png"));
		   testNGCucumberRunner.finish();*/

	}
	public String getTestName() {
		if (org.testng.Reporter.getCurrentTestResult() != null) {
			return org.testng.Reporter.getCurrentTestResult().getName();
		} else {
			return "";
		}
	}
}
