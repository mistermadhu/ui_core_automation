package com.sempra.hr.cucumber.frwk.testdrivers;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sempra.hr.cucumber.frwk.util.FrameworkConstants;

import cucumber.api.java.Before;

public class WebDriverFactory {
	private WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(WebDriverFactory.class);

	public WebDriverFactory() {
		initialize();
	}

	@Before
	public void initalizeDriver() {
		logger.info("Initializing driver ...");
	}

	public void initialize() {
		if (driver == null)
			createNewDriverInstance();
	}

	private void createNewDriverInstance() {
		DesiredCapabilities capabilities;
		if (FrameworkConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
			// Create FireFox Profile object
			/*
			 * FirefoxProfile profile = new FirefoxProfile();
			 * 
			 * // Set Location to store files after downloading.
			 * profile.setPreference("browser.download.dir",
			 * System.getProperty("user.home") + "//Downloads");
			 * profile.setPreference("browser.download.folderList", 2);
			 * 
			 * // Set Preference to not show file download confirmation //
			 * dialogue using MIME types Of different file extension types.
			 * profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
			 * "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"
			 * );
			 * 
			 * profile.setPreference(
			 * "browser.download.manager.showWhenStarting", false);
			 * profile.setPreference("browser.helperApps.alwaysAsk.force",
			 * false);
			 * profile.setPreference("browser.download.manager.closeWhenDone",
			 * true); profile.setPreference(
			 * "browser.download.manager.focusWhenStarting", false);
			 * profile.setPreference("pdfjs.disabled", true);
			 */
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/"
					+ FrameworkConstants.WEBDRIVER_FOLDER_LOCATION + "/geckodriver.exe");
			driver = new FirefoxDriver();
			/*
			 * FirefoxOptions options = new FirefoxOptions()
			 * .setProfile(profile); driver = new FirefoxDriver(options);
			 */
		} else if (FrameworkConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
			capabilities = DesiredCapabilities.firefox();
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("disable-extensions");
			cOptions.addArguments("disable-infobars");
			cOptions.addArguments("chrome.switches", "--disable-extensions");
			cOptions.addArguments("--test-type");
			cOptions.addArguments("no-sandbox");
			cOptions.addArguments("--enable-precise-memory-info");
			cOptions.addArguments("--disable-popup-blocking");
			cOptions.addArguments("--disable-default-apps");
			capabilities.setCapability(ChromeOptions.CAPABILITY, cOptions);
			capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/"
					+ FrameworkConstants.WEBDRIVER_FOLDER_LOCATION + "/chromedriver.exe");
			driver = new ChromeDriver(cOptions);
			/*
			 * Windows Defender wants to reset your settings -Fix for this ERROR
			 * IN CHROME BROWSER
			 * HKEY_CURRENT_USER\Software\Google\Chrome\TriggeredReset There are
			 * a couple of values in this key; product name i.e. Windows
			 * Defender or whatever other AV you are using and a timestamp.
			 * These don't matter. Make sure your browser is closed and then
			 * delete the TriggeredReset Key
			 */ } else {
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/"
					+ FrameworkConstants.WEBDRIVER_FOLDER_LOCATION + "/IEDriverServer.exe");
			driver = new SynchronizedIEDriver(capabilities);
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void destroyDriver() {
		driver.quit();
		driver = null;
	}
}
