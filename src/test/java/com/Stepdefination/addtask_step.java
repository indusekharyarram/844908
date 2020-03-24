package com.Stepdefination;

import com.pages.addtask;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtask_step {
	 addtask enter=new 	 addtask();
	@Given("^launch the chrome browse$")
	public void launch_the_chrome_browse() throws Throwable {
		enter.launch3();
	    
	}

	@When("^Open the Taskmanager website$")
	public void open_the_Taskmanager_website() throws Throwable {
		enter.open1();
	   
	}

	@Then("^click on  tasklist1$")
	public void click_on_tasklist1() throws Throwable {
		enter.click();
	  
	}

	@Then("^Select Assined to as Alex kniel$")
	public void select_Assined_to_as_Alex_kniel() throws Throwable {
		enter.select();
	    
	}

	@Then("^click om search  button$")
	public void click_om_search_button() throws Throwable {
		enter.search();
	   
	}


}
