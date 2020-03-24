package com.Stepdefination;

import com.pages.print;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class print_step {
	 print enter=new  print();
@Given("^Open the browser$")
public void open_the_browser() throws Throwable {
	enter.launch3();
  
}

@When("^Access TaskManager website$")
public void access_TaskManager_website() throws Throwable {
    enter.open1();
}

@Then("^open the task list$")
public void open_the_task_list() throws Throwable {
	enter.open2();
   
}

@Then("^print the tasks list$")
public void print_the_tasks_list() throws Throwable {
	enter.print();
    
}


}
