package com.sempra.hr.cucumber.frwk.opts;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class CucumberRuntimeOptions {
	private String feature;
	private String tags;
	// private cucumber.runtime.Runtime runtime;
	private RuntimeOptions ro;
	private static final Logger logger = LoggerFactory.getLogger(CucumberRuntimeOptions.class);

	public CucumberRuntimeOptions(String feature, String tags) {
		this.feature = feature;
		this.tags = tags;
	}

	public RuntimeOptions getCucumberRuntimeOptions() throws Throwable {

		/*
		 * ClassLoader classLoader = getClass().getClassLoader(); ResourceLoader
		 * resourceLoader = new MultiLoader(classLoader);
		 */

		RuntimeOptionsFactory roFactory = new RuntimeOptionsFactory(getClass());
		List<String> pluginList = new ArrayList<String>();
		pluginList.add("--plugin");
		pluginList.add("pretty");
		pluginList.add("--plugin");
		pluginList.add("html:target/cucumber-html-report");

		ro = roFactory.create();
		ro.addPlugin(pluginList);

		ro.getGlue().clear();
		ro.getGlue().add("classpath:");

		ro.getFeaturePaths().clear();
		ro.getFeaturePaths().add(this.feature);

		if (!this.tags.isEmpty()) {
			for (String s : this.tags.split("--tags")) {
				if (!s.trim().isEmpty()) {
					ro.getFilters().add(s.trim());
				}
			}
		}
		/*
		 * ClassFinder classFinder = new
		 * ResourceLoaderClassFinder(resourceLoader, classLoader); this.runtime
		 * = new cucumber.runtime.Runtime(resourceLoader, classFinder,
		 * classLoader, ro); try { logger.info(String.format("Run Feature - %s",
		 * this.feature)); this.runtime.run(); } catch (IOException ex) { throw
		 * new RuntimeException(ex); } if (!this.runtime.getErrors().isEmpty())
		 * { logger.debug(this.runtime.getErrors().toString()); throw new
		 * CucumberException(this.runtime.getErrors().get(0)); }
		 */
		return ro;
	}
}
