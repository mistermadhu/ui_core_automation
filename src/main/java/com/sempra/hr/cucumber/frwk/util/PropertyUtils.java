package com.sempra.hr.cucumber.frwk.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class PropertyUtils {

	private static final Logger logger = LoggerFactory.getLogger(PropertyUtils.class);
	
	private final Properties myConfigProperties = new Properties();

	private PropertyUtils(final String aPropFile) {

		// String workingDir = System.getProperty("user.dir");
		InputStream systemResource = ClassLoader
				.getSystemResourceAsStream(aPropFile);
		// String file = systemResource.getFile();
		// InputStream in;
		try {
			// in = new FileInputStream(workingDir + aPropFile);
			// in = new FileInputStream(file);
			myConfigProperties.load(systemResource);
		} catch (FileNotFoundException fex) {
			logger.error("FileNotFoundException {}", fex.getMessage());
		} catch (IOException ioe) {
			logger.error("IOException {}", ioe.getMessage());
		}
	}

	public static PropertyUtils getInstance(final String propFile) {
		return new PropertyUtils(propFile);
	}

	public String getProperty(final String key) {
		return myConfigProperties.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return myConfigProperties.stringPropertyNames();
	}

	public boolean containsKey(final String key) {
		return myConfigProperties.containsKey(key);
	}

}
