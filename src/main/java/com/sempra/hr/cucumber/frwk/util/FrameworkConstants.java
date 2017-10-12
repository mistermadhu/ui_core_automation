package com.sempra.hr.cucumber.frwk.util;

import java.util.Set;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class FrameworkConstants {

	private FrameworkConstants() {

	}

	// Files names
	public static final String TEST_CONFIG_PROPERTIES_FILENAME="testconfig.properties";
	public static final String BROWSER_TYPE_PROP="browser.type";
	public static final String SITE_URL_PROP="site.url";
	public static final String ALM_URL_PROP="alm.url";
	public static final String TESTDATA_XLS_LOCATION_PROP="testdata.xls.location";
	public static final String WEBDRIVER_FOLDER_LOCATION_PROP="driver.location";
	public static final String IS_ALM_UPDATE_PROP="isALMUpdate";
	public static final boolean IS_ALM_UPDATE=new Boolean(System.getProperty(IS_ALM_UPDATE_PROP)).booleanValue();
	
	//Fetch from properties file and assign it to constants
	public static PropertyUtils myPropertyUtils = PropertyUtils
			.getInstance(TEST_CONFIG_PROPERTIES_FILENAME);

	public static Set<String> allPropertyNames = myPropertyUtils
			.getAllPropertyNames();
	public static String TEST_DATA_FILE="";
	public static boolean IS_COMMON;
	
	public static final String TESTDATA_XLS_LOCATION = myPropertyUtils
			.getProperty(TESTDATA_XLS_LOCATION_PROP);
	public static final String WEBDRIVER_FOLDER_LOCATION = myPropertyUtils
			.getProperty(WEBDRIVER_FOLDER_LOCATION_PROP);
	public static final String BROWSER_TYPE = myPropertyUtils
			.getProperty(BROWSER_TYPE_PROP);
	public static final String SITE_URL = myPropertyUtils
			.getProperty(SITE_URL_PROP);
	
	public static final String ALM_URL = myPropertyUtils
			.getProperty(ALM_URL_PROP);
	
	public static final int UNAUTHORIZED = 401;
	public static final int GET_SUCCESS = 200;
	public static final int POST_SUCCESS = 201;
	public static final String TEST_SUCCESS = "Passed";
	public static final String TEST_FAILED = "Failed";
	public static final String NOT_RUN = "No Run";
	
	public static final String TEST_DATA_SHEET_COMMON="Common";
	public static final String EMTPY_LABEL="<<empty>>";
	
	public static final String SHEET_AND_KEY_SEPARATOR="::";
	
	
	/**
	 * Represents a very timeout for quick checks to be done on some optional
	 * conditions.
	 */
	public static final int VERY_FAST_TIMEOUT = 3;

	/**
	 * 5 seconds
	 */
	public static final int FAST_TIMEOUT = 5;

	/**
	 * 8 seconds
	 */
	public static final int GENERAL_TIMEOUT = 8;

	/**
	 * 20 seconds
	 */
	public static final int LARGE_TIMEOUT = 40;

	/**
	 * 60 seconds
	 */
	public static final int VERY_LARGE_TIMEOUT = 60;
	


/*	public static List<String> getTestProperties() {
		List<String> allTestProperties = new ArrayList<String>();

		for (String property : allPropertyNames) {
			if (property.startsWith("testPath")) {
				allTestProperties.add(property);
			}
		}

		return allTestProperties;
	}

	public static List<String> getTestSetProperties() {
		List<String> allTestSetProperties = new ArrayList<String>();

		for (String property : allPropertyNames) {
			if (property.startsWith("testSetPath"))
				allTestSetProperties.add(property);
		}

		return allTestSetProperties;
	}
	
	public static List<String> getTestResourcesProperties() {
		List<String> allTestResourcesProperties = new ArrayList<String>();

		for (String property : allPropertyNames) {
			if (property.startsWith("testResourcesPath"))
				allTestResourcesProperties.add(property);
		}

		return allTestResourcesProperties;
	}*/

}
