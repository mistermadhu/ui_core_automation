package com.sempra.hr.cucumber.frwk.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;
import com.sempra.hr.cucumber.frwk.util.XLReader;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class TestDataExtractor {
private List<String> testDataHeaders;
private Map<String, List<String>> testDataMap;
private List<String> commonDataHeaders;
private Map<String, List<String>> commonDataMap;
private List<String> featureDataHeaders;
private Map<String, List<String>> featureDataMap;
private String xlsFile;
private XLReader xlReader;
private static final Logger logger = LoggerFactory.getLogger(TestDataExtractor.class);
public TestDataExtractor(String filePath, String fileName)
{
	this.xlsFile=filePath+fileName;
	// Get XL Workbook ready
	xlReader=new XLReader(filePath,fileName);
	// Open the workbook
	xlReader.openXLWorkBook();
	
}
public static void main(String ...args)
{
	TestDataExtractor tde=new TestDataExtractor("src/test/resources/testdata/", "Eligibility_TestData.xlsx");
	 tde.populateTestData("Credentials");
	//tde.populateCommonData();
	//tde.populateFeatureData("RM_01");
	//tde.getFeatureDataHeaders();
	//tde.getFeatureDataMap();
}
public void populateTestData(String sheetName )
{
	try {
		List<List<String>> xlRecords=xlReader.readExcel(sheetName, false);
		this.testDataHeaders=new ArrayList<>();
		this.testDataMap=new Hashtable<String,List<String>>();
		List<String>valueList;
		boolean isHeader=true;
	   logger.debug("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv["+sheetName+"]vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		for(List<String> row: xlRecords)
		{
			if(row==null||row.size()==0)
				continue;
			valueList=new ArrayList<String>();
			for(String value:row)
			{
				System.out.print(value+"||");
				if(isHeader)
				{
					testDataHeaders.add(value);
				}
				else
				{
					valueList.add(value);
				}
				
			}
		   if(!isHeader)
		   {
			   String key=valueList.get(0).replaceAll(" ", "");
			   if(!testDataMap.containsKey(key))
			      testDataMap.put(key,valueList.subList(1,valueList.size()));
			   else
				   logger.debug("Duplicate key = ["+key+"] in Sheet ["+sheetName+"] inside Workbook ["+this.xlsFile+"]");
		   }
		   isHeader=false;
		   logger.debug("																																			");
		}                                                       
		logger.debug("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^["+sheetName+"]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}            
}
public void populateCommonData()
{
	
	try {
		List<List<String>> xlRecords=xlReader.readExcel(FrameworkConstants.TEST_DATA_SHEET_COMMON, true);
		this.commonDataHeaders=new ArrayList<>();
		this.commonDataMap=new Hashtable<String,List<String>>();
		List<String>valueList;
		boolean isHeader=true;
		logger.debug("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv["+FrameworkConstants.TEST_DATA_SHEET_COMMON+"]vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		for(List<String> row: xlRecords)
		{
			if(row==null||row.size()==0)
				continue;
			valueList=new ArrayList<String>();
			for(String value:row)
			{
				System.out.print(value+"||");
				if(isHeader)
				{
					commonDataHeaders.add(value);
				}
				else
				{
					valueList.add(value);
				}
				
			}
		   if(!isHeader)
		   {
			   String key=(valueList.get(1)+"-"+valueList.get(2)+"-"+valueList.get(4)).replaceAll(" ", "");
			   if(!commonDataMap.containsKey(key))
				   commonDataMap.put(key,valueList.subList(1,valueList.size()));
			   else
				   logger.debug("Duplicate key = ["+key+"] in Sheet ["+FrameworkConstants.TEST_DATA_SHEET_COMMON+"] inside Workbook ["+this.xlsFile+"]");
		   }
		   isHeader=false;
		   logger.debug("																																			");
		}
		logger.debug("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^["+FrameworkConstants.TEST_DATA_SHEET_COMMON+"]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}            
}
public void populateFeatureData(String sheetName)
{
	try {
		List<List<String>> xlRecords=xlReader.readExcel(sheetName,true);
		this.featureDataHeaders=new ArrayList<>();
		this.featureDataMap=new Hashtable<String,List<String>>();
		List<String>valueList;
		boolean isHeader=true;
		logger.debug("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv["+sheetName+"]vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		for(List<String> row: xlRecords)
		{
			if(row==null||row.size()==0)
				continue;
			valueList=new ArrayList<String>();
			for(String value:row)
			{
				System.out.print(value+"||");
				if(isHeader)
				{
					featureDataHeaders.add(value);
				}
				else
				{
					valueList.add(value);
				}
				
			}
		   if(!isHeader)
		   {
			   String key=(valueList.get(1)+"-"+valueList.get(2)+"-"+sheetName).replaceAll(" ", "");
			   if(!featureDataMap.containsKey(key))
				   featureDataMap.put(key,valueList.subList(1,valueList.size()));
			   else
				   logger.debug("Duplicate key = ["+key+"] in Sheet ["+sheetName+"] inside Workbook ["+this.xlsFile+"]");
		   }
		   isHeader=false;
		   logger.debug("																																			");
		}
		logger.debug("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^["+sheetName+"]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}            
}
public List<String> getTestDataHeaders() {
	return testDataHeaders;
}
public Map<String, List<String>> getTestDataMap() {
	return testDataMap;
}
public List<String> getCommonDataHeaders() {
	return commonDataHeaders;
}
public Map<String, List<String>> getCommonDataMap() {
	return commonDataMap;
}
public List<String> getFeatureDataHeaders() {
	return featureDataHeaders;
}
public Map<String, List<String>> getFeatureDataMap() {
	return featureDataMap;
}
public List<List<String>> getRawTestData(String sheetName,boolean isTestScriptData)
{
	try {
		return this.xlReader.readExcel(sheetName,false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}


}
