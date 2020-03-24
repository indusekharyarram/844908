package Stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InvalidLogin;
import pageObjects.addTask;

public class c_addTask {
	addTask enter= new addTask();
	@Given("^open the Application$")
	public void open_the_Application() throws Throwable {
	    enter.open();
	}

	@When("^click on Administration(\\d+)$")
	public void click_on_Administration(int arg1) throws Throwable {
	    enter.clickAdministration();
	}

	@When("^login with valid credentials$")
	public void login_with_valid_credentials() throws Throwable {
	    enter.login();
	}

	@When("^click on add task$")
	public void click_on_add_task() throws Throwable {
	    enter.AddTask();
	}

	@When("^enter all fields$")
	public void enter_all_fields() throws Throwable {
	    enter.enterFields();
	}

	@When("^select Start Date$")
	public void select_Start_Date() throws Throwable {
	    enter.startDate();
	}

	@When("^select End Date$")
	public void select_End_Date() throws Throwable {
	    enter.endDate();
	}

	@When("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    enter.addButton();
	}

	@Then("^assert if added task is shown in task list table$")
	public void assert_if_added_task_is_shown_in_task_list_table() throws Throwable {
	    enter.Assert();
	}
}
