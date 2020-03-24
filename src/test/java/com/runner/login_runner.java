package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags= "@tc01_login",
		glue= "com/Stepdefination",dryRun=true,
		monochrome = true 
		)
public class login_runner {

}
