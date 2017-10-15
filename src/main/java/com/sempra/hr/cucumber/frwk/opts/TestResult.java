package com.sempra.hr.cucumber.frwk.opts;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class TestResult {

	private long id;
	private ResultType result;
	private String webDriver;
	private String almResult;
	private String testname;
	private String method;
	private String testId;
	private long duration;
	private long startTime;
	private long endTime;
	private String description;
	private Long executionId;

	public TestResult() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ResultType getResult() {
		return result;
	}

	public void setResult(ResultType result) {
		this.result = result;
	}

	public String getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(String webDriver) {
		this.webDriver = webDriver;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getAlmResult() {
		return almResult;
	}

	public void setAlmResult(String almResult) {
		this.almResult = almResult;
	}

	public String getTestname() {
		return testname;
	}

	public void setTestname(String testname) {
		this.testname = testname;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getExecutionId() {
		return executionId;
	}

	public void setExecutionId(Long executionId) {
		this.executionId = executionId;
	}

	@Override
	public String toString() {
		return "testId[" + testId + "] method[" + method + "] result[" + result + "] duration[" + duration + "]";
	}

}
