package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase1.feature",
		tags= "@tc03_Adddetails",
		glue= "com.Stepdefinition",
		monochrome = true 
		)
public class filldetails_runner {

}
