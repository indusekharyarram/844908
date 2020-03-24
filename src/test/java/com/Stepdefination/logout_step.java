package com.Stepdefination;

import com.pages.logout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logout_step {
	 logout enter=new  logout();
@Given("^open the browser$")
public void open_the_browser() throws Throwable {
	enter.launch3();
   
}

@When("^access Taskmanager website$")
public void access_Taskmanager_website() throws Throwable {
	enter.open3();
   
}

@Then("^click the administration$")
public void click_the_administration() throws Throwable {
	enter.admin();
   
}

@Then("^click the log$")
public void click_the_log() throws Throwable {
	enter.Logout();
   
}

}
