package com.sempra.hr.cucumber.frwk.sd;

import org.openqa.selenium.WebDriver;

import com.sempra.hr.cucumber.frwk.datatable.CucumberContext;
import com.sempra.hr.cucumber.frwk.pageobjects.ADPHomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HomePageMenuStepDefns {
 private ADPHomePage adpHomePage;
 private WebDriver driver;
 public HomePageMenuStepDefns(CucumberContext cucContext)
     {
	   this.driver=cucContext.getDriver();
		adpHomePage=new ADPHomePage(driver);
     }
	@When("^I click on People from the Menu bar$")  
	public void i_click_on_People_from_the_Menu_bar() throws Exception {
		// Initialize the Landing page after Login
		adpHomePage.click_PeopleMenu();
	}

	@And("^I click on Benefits from the list$")
	public void i_click_on_Benefits_from_the_list() throws Exception {
		adpHomePage.click_Benefits();

	}
	
	@And("^I click on Process form the Menu bar$")
	public void i_click_on_Process_from_the_Menu() throws Exception {
		adpHomePage.click_ProcessMenu(); 

	}
	
	@And("^I click on Additional services from the Sub Menu$")
	public void i_click_on_Additional_Services_from_the_Menu() throws Exception {
		adpHomePage.click_AdditionalServices(); 

	}
	@And("^I click on Recruiting from the Sub Menu$")
	public void i_click_on_Recruiting_from_the_Sub_Menu() throws Exception {
		adpHomePage.click_Recruiting(); 

	}
}
