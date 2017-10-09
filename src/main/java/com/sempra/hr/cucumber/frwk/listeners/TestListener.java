package com.sempra.hr.cucumber.frwk.listeners;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;		

public class TestListener implements ITestListener						
{		
	private static final Logger logger = LoggerFactory.getLogger(TestListener.class);
    @Override		
    public void onFinish(ITestContext Result) 					
    {		
                		
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
            		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
   @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    logger.debug("The name of the testcase failed is :"+Result.getName());					
    }		

    // When Test case get Skipped, this method is called.		
   @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    logger.debug("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    logger.debug(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
   @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    logger.debug("The name of the testcase passed is :"+Result.getName());					
    }		

}			