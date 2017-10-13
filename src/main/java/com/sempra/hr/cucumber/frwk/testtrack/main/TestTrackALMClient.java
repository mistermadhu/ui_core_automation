package com.sempra.hr.cucumber.frwk.testtrack.main;

import java.net.URL;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.testtrack.util.CEvent;
import com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack;
import com.sempra.hr.cucumber.frwk.testtrack.util.CProject;
import com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase;
import com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun;
import com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub;
import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

// Test Track ALM Client is a Singleton class

public enum TestTrackALMClient {
INSTANCE;
private TtsoapcgiStub objTT;
private final Logger logger = LoggerFactory.getLogger(TestTrackALMClient.class);
private TestTrackALMClient()
	{
	 try
	   {
		 if(FrameworkConstants.ALM_URL==null||FrameworkConstants.ALM_URL.trim().length()==0)
			 throw new Exception("ALM Url not specified in properties file");
	   objTT =new TtsoapcgiStub(new URL(FrameworkConstants.ALM_URL),null);
	   }
	 catch(Exception exp)
	 {
	   logger.error("Exception while creating the SOAP UI Stub ::"+exp);	 
	 }
    } 

public long createAndUpdateTestRun(TestCaseInfo tcdObj)
{
 try
 {
	
	CTestCase objTTestCase =new CTestCase();
	CTestRun objTTTestRun =new CTestRun();
	CItemToTrack[] objTTTrackItem;
	CEvent objTTEvent = new CEvent();
    CEvent[] objTTEvents=new CEvent[1];
    long lngCookie = -1;
	long testRunID = -1;
    /***************************************************************************************
    Login to Helix ALM Project and get the cookie
    ***************************************************************************************/
    // Get Project List
	CProject[] objTTProject = objTT.getProjectList(tcdObj.getStrTTUser(), tcdObj.getStrTTPassword());
    // Login to the required project
    for(CProject objProject : objTTProject)
    {
    	if(objProject.getDatabase().getName().equalsIgnoreCase(tcdObj.getProjectName()))
            {
            //Now login to that project to get Cookie
            lngCookie = objTT.projectLogon(objProject, tcdObj.getStrTTUser(), tcdObj.getStrTTPassword());
            }
    }


    /***************************************************************************************
    Get the Test Case
    ***************************************************************************************/
    long recordID=-1;
    if(lngCookie > 0)
    	{
 
        objTTestCase = objTT.getTestCaseByRecordID(lngCookie, tcdObj.getTestCaseRecordID(), false);
        recordID=objTTestCase.getRecordid();
      
    /***************************************************************************************
     Generate Test Run
     ***************************************************************************************/
        objTTTrackItem= objTT.generateTestRuns(lngCookie, recordID, null, tcdObj.getTestRunSet());

        if ( objTTTrackItem!=null )
        {
            for( CItemToTrack objTrackItem : objTTTrackItem)
             {
            	testRunID = objTrackItem.getRecordid();
             }
        } 
        logger.info("Test Record ID="+recordID);
        logger.info("Test Run ID="+testRunID);
        /***************************************************************************************
         Set Pass or Fail status and upload attachment
        ***************************************************************************************/
        objTTTestRun = objTT.editTestRunByRecordID(lngCookie, testRunID, false);//.editTestRun(lngCookie, testRunID, "Updated by ui framework", false);//.editTestRunByRecordID(lngCookie, testRunID, false);////.getTestRun(lngCookie, strNewTestRunID, "Updated by ui framework", false);
        
        // Create and update Event
        objTTEvent = new CEvent();
        objTTEvent.setParenteventid(tcdObj.getParentEventId());
        if(tcdObj.getTestStatus().toUpperCase().contains("PASS"))
        {
        	objTTEvent.setName("Pass");
            objTTEvent.setResultingstate("Passed"); 
        }
        else
        {
        	objTTEvent.setName("Fail");
            objTTEvent.setResultingstate("Failed");
        }
        
        objTTEvent.setNotes("Selenium Test Run Execution.");
        objTTEvent.setUser(tcdObj.getStrTTUserFull());
        objTTEvent.setDate(Calendar.getInstance()); 
        objTTEvent.setHours(tcdObj.getHours());
        objTTEvent.setTotaltimespent(tcdObj.getTotalTimeSpent());

        //Add to array of events
        objTTEvents[0] = objTTEvent;

        objTTTestRun.setEventlist(objTTEvents);

        //Save the events details to a test run
        objTT.saveTestRun(lngCookie, objTTTestRun);
        
     }
        logger.info("Helix ALM Upload Successful");
        //Return Test case ID
        return testRunID;
 }
catch (Exception exp)
  {
	exp.printStackTrace();
    logger.error("Exception while connecting to Helix ALM ::"+exp.getMessage());	
    return -1L;
  }
    
 }
/*public static void main(String args[]) throws MalformedURLException
{
	String url="https://sempra.seapine.net/scripts/ttsoapcgi.exe";    // Replace FrameworkConstants.ALM_URL with this string
	TestCaseInfo trdObj=new TestCaseInfo();
	TestTrackALMClient.INSTANCE.createAndUpdateTestRun(trdObj);
}
*/

}
