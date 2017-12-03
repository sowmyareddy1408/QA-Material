package com.cucumber.framework.stepdefinition;



import com.cucumber.framework.Base.BaseClass;
import com.cucumber.framework.pageObjects.PageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToFacebook extends BaseClass {
	
	@Given("^User navigate to Facebook\\.com$")
	public void user_navigate_to_Facebook_com() throws Throwable {
	init();
	}

	@When("^user enters details$")
	public void user_enters_details() throws Throwable {
	  PageObjects pg = new PageObjects(driver);
      pg.details("sowmya7817@gmail.com","Sowmya@7817");
	
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		PageObjects pg = new PageObjects(driver);
		pg.submit();
	}

	@Then("^the login should be successful$")
	public void the_login_should_be_successful() throws Throwable {
	    System.out.println("Login successful");
	}
}
