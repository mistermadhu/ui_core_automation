package com.sempra.hr.cucumber.frwk.listeners;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import com.sempra.hr.cucumber.frwk.opts.TestResult;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class ExecutionReport {

	private static Long startTime;
	private static Long endTime;

	private static String buildNum;
	private static String environment;
	private static final String execId = UUID.randomUUID().toString();;

	private static String jwt;
	private static String domain;
	private static String project;
	private static String testSetId;
	private static boolean useAlmProxy;

	private static String tepLocation;

	private static List<TestResult> resultList = new LinkedList<TestResult>();

	private ExecutionReport() {
	}

	public static Long getStartTime() {
		return startTime;
	}

	public static void setStartTime(Long startTime) {
		ExecutionReport.startTime = startTime;
	}

	public static void setEndTime(Long endtime) {
		ExecutionReport.endTime = endtime;
	}

	public static String getBuildNum() {
		return buildNum;
	}

	public static void setBuildNum(String buildNum) {
		ExecutionReport.buildNum = buildNum;
	}

	public static String getEnvironment() {
		return environment;
	}

	public static void setEnvironment(String environment) {
		ExecutionReport.environment = environment;
	}

	public static List<TestResult> getResultList() {
		return resultList;
	}

	public static void setResultList(List<TestResult> resultList) {
		ExecutionReport.resultList = resultList;
	}

	public static Long getEndTime() {
		return endTime;
	}

	public static void addResult(TestResult result) {
		resultList.add(result);
	}

	public static String getExecId() {
		return execId;
	}

	public static String getJwt() {
		return jwt;
	}

	public static void setJwt(String jwt) {
		ExecutionReport.jwt = jwt;
	}

	public static String getDomain() {
		return domain;
	}

	public static void setDomain(String domain) {
		ExecutionReport.domain = domain;
	}

	public static String getProject() {
		return project;
	}

	public static void setProject(String project) {
		ExecutionReport.project = project;
	}

	public static String getTestSetId() {
		return testSetId;
	}

	public static void setTestSetId(String testSetId) {
		ExecutionReport.testSetId = testSetId;
	}

	public static boolean isUseAlmProxy() {
		return useAlmProxy;
	}

	public static void setUseAlmProxy(boolean useAlmProxy) {
		ExecutionReport.useAlmProxy = useAlmProxy;
	}

	public static String getTepLocation() {
		return tepLocation;
	}

	public static void setTepLocation(String tepLocation) {
		ExecutionReport.tepLocation = tepLocation;
	}

}
