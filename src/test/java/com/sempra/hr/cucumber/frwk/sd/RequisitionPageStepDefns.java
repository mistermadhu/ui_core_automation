package com.sempra.hr.cucumber.frwk.sd;

import org.openqa.selenium.WebDriver;

import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.pageobjects.rm.RequisitionsPage;

import cucumber.api.java.en.And;

public class RequisitionPageStepDefns {
	 private RequisitionsPage reqsHomePage;
	 private WebDriver driver;
	 public RequisitionPageStepDefns(CucumberContext cucContext)
	     {
		   this.driver=cucContext.getDriver();
		   reqsHomePage=new RequisitionsPage(this.driver);
	     }	

	@And("^I click on Reqs form the Menu bar$")
		public void i_click_on_Reqs_from_the_Menu() throws Exception {
		 reqsHomePage.click_Reqs();

		}
}
