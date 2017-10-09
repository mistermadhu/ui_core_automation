/**
 * 
 */
package com.sempra.hr.cucumber.frwk.testdrivers;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.Response;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class SynchronizedIEDriver extends InternetExplorerDriver {


	public SynchronizedIEDriver() {
		super();
	}

	/**
	 * @param capabilities
	 */
	public SynchronizedIEDriver(Capabilities capabilities) {
		super(capabilities);
	}

	/**
	 * @param port
	 */
	public SynchronizedIEDriver(int port) {
		super(port);
	}

	/**
	 * @param service
	 * @param capabilities
	 * @param port
	 */
	public SynchronizedIEDriver(InternetExplorerDriverService service, Capabilities capabilities, int port) {
		super(service, capabilities, port);
	}

	/**
	 * @param service
	 * @param capabilities
	 */
	public SynchronizedIEDriver(InternetExplorerDriverService service, Capabilities capabilities) {
		super(service, capabilities);
	}

	/**
	 * @param service
	 */
	public SynchronizedIEDriver(InternetExplorerDriverService service) {
		super(service);
	}

	@Override
	protected Response execute(String driverCommand, Map<String, ?> parameters) {
		synchronized (this) {
			return super.execute(driverCommand, parameters);
		}
	}
}
