package com.sempra.hr.cucumber.frwk.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IExecutionListener;

import com.sempra.hr.cucumber.frwk.opts.TestResult;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class ExecutionListener implements IExecutionListener {

	private static final Logger logger = LoggerFactory.getLogger(ExecutionListener.class);

	// @Override
	public void onExecutionStart() {
		ExecutionReport.setStartTime(System.currentTimeMillis());

		String buildNum;
		String testEnv;

		if (System.getProperty("buildNum") != null) {
			buildNum = System.getProperty("buildNum");
			ExecutionReport.setBuildNum(buildNum);
		} else {
			buildNum = "";
		}

		if (System.getProperty("testEnv") != null) {
			testEnv = System.getProperty("testEnv");
			ExecutionReport.setEnvironment(testEnv);
		} else {
			testEnv = "";
		}

		logger.info("Execution Start: Exec Id[{}] Build Number[{}] Test Env[{}]", ExecutionReport.getExecId(), buildNum,
				testEnv);

	}

	// @Override
	public void onExecutionFinish() {
		ExecutionReport.setEndTime(System.currentTimeMillis());
		publishExecReport();
	}

	private void publishExecReport() {
		logger.info("Execution Report: Exec Id[{}] Build Number[{}] Test Env[{}] Start Time[{}] End Time[{}]",
				ExecutionReport.getExecId(), ExecutionReport.getBuildNum(), ExecutionReport.getEnvironment(),
				ExecutionReport.getStartTime(), ExecutionReport.getEndTime());

		for (TestResult tResult : ExecutionReport.getResultList()) {
			logger.info("Test: {}", tResult);
		}
	}

}
