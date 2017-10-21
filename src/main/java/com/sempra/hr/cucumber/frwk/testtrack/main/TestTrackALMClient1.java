package com.sempra.hr.cucumber.frwk.testtrack.main;

import java.net.URL;
import java.util.Calendar;

import com.sempra.hr.cucumber.frwk.testtrack.util.CEvent;
import com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack;
import com.sempra.hr.cucumber.frwk.testtrack.util.CProject;
import com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase;
import com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun;
import com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub;

public class TestTrackALMClient1 {
public static void main(String args[])
{
	
 try
 {
	/*
    **************************************************************************************
    Login to TT (with Username and Password)
    Select Correct TT Project to Login to
    ****************************************************************************************/


	String url="https://sempra.seapine.net/scripts/ttsoapcgi.exe";    // "http://localhost/scripts/ttsoapcgi.exe"; 
	 
	TtsoapcgiStub objTT =new TtsoapcgiStub(new URL(url),null);
	CTestCase objTTestCase =new CTestCase();
	CTestRun objTTTestRun =new CTestRun();
	CItemToTrack[] objTTTrackItem;
	CEvent objTTEvent = new CEvent();
    CEvent[] objTTEvents=new CEvent[1];
    long lngCookie = 0;
    String strTTUser = "SempraHQ";//"Administrator";
    String strTTPassword = "Vantage2018!";
    String strTTUserFull ="Automation Team, ProKarma";// "Administrator, System";
    long testRunID =-1;
    String projectName="Sandbox My Info";//NEW My Info,the next generations";//"Sandbox - My Info, the next gen";      
	long testCaseRecordID=22746L;  
	String testRunSet="UAT Cycle 1";//"Beta 4 Tests";//"Alpha 1 Tests";      // ??????
	String testStatus="PASSED";


 
      
 
	


	CProject[] objTTProject = objTT.getProjectList(strTTUser, strTTPassword);

    for(CProject objProject : objTTProject)
    {
    	if(objProject.getDatabase().getName().equalsIgnoreCase(projectName))
            {
            //Now login to that project to get Cookie
            lngCookie = objTT.projectLogon(objProject, strTTUser, strTTPassword);
            }
    }
    //**************************************************************************************


    /***************************************************************************************
    Get the Test Case to Execute
    ***************************************************************************************/
    long recordID=-1;
    if(lngCookie > 0)
    	{
 
        objTTestCase = objTT.getTestCaseByRecordID(lngCookie, testCaseRecordID, false);
        recordID=objTTestCase.getRecordid();
        System.out.println("Test Record ID="+recordID);
        System.out.println("Cookie="+lngCookie);
         //Generate Test Run
        objTTTrackItem= objTT.generateTestRuns(lngCookie, recordID, null, testRunSet);

        if ( objTTTrackItem!=null )
        {
            for( CItemToTrack objTrackItem : objTTTrackItem)
             {
            	testRunID = objTrackItem.getRecordid();
             }
        } 
      
        System.out.println("Test Run ID="+testRunID);
        //Enter Pass or Failed Status
        switch (testStatus)
           {
             case "PASSED":

                objTTTestRun = objTT.editTestRunByRecordID(lngCookie, testRunID, false);//.editTestRun(lngCookie, testRunID, "Updated by ui framework", false);//.editTestRunByRecordID(lngCookie, testRunID, false);////.getTestRun(lngCookie, strNewTestRunID, "Updated by ui framework", false);

                objTTEvent = new CEvent();
                //String assigntoList[]=new String[1];
               // assigntoList[0]=("Automation Team, ProKarma");
               // objTTEvent.setAssigntolist(assigntoList);
                Long parrentEventID=0L;
                objTTEvent.setParenteventid(parrentEventID);
                objTTEvent.setName("Pass");
                objTTEvent.setResultingstate("Passed");
                objTTEvent.setNotes("Selenium Test Run Execution.");
                objTTEvent.setUser(strTTUserFull);
                objTTEvent.setDate(Calendar.getInstance()); 
                objTTEvent.setHours(0.0);
                objTTEvent.setTotaltimespent(0.0);

                //Add to array of events
                objTTEvents[0] = objTTEvent;

                objTTTestRun.setEventlist(objTTEvents);

                //Custom Fields for Event
                //We will have to set required fields for events
                //objTTEvent.fieldlist

                objTT.saveTestRun(lngCookie, objTTTestRun);
              break;
             case "FAILED":

                objTTTestRun = objTT.editTestRunByRecordID(lngCookie, testRunID, false);

                objTTEvent = new CEvent();
                 parrentEventID=0L;
                objTTEvent.setParenteventid(parrentEventID);
                objTTEvent.setName("Fail");
                objTTEvent.setResultingstate("Failed");
                objTTEvent.setNotes("[Selenium Generated] Selenium Test Run Execution.");
                objTTEvent.setUser(strTTUserFull);
                objTTEvent.setDate(Calendar.getInstance()); 
                objTTEvent.setHours(0.0);
                objTTEvent.setTotaltimespent(0.0);
                
                //Add to array of events
                objTTEvents[0] = objTTEvent;

                objTTTestRun.setEventlist(objTTEvents);

                //Custom Fields for Event
                //We will have to set required fields for events
                //objTTEvent.fieldlist

               objTT.saveTestRun(lngCookie, objTTTestRun);
               break;

               default:

                break;

           }

     }
        //**************************************************************************************
        System.out.println("Logging off with cookie:"+lngCookie);
        objTT.databaseLogoff(lngCookie);
        //Return Status to Browser
        System.out.println("Success");
 }
catch (Exception exp)
 {
	exp.printStackTrace();
    System.out.println("Exception while connecting to HP ALM ::"+exp.getMessage());	 
 }
    
}
}
