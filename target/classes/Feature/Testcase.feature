@Taskmanager_Feature
Feature: Taskmanager

@tc01_login
Scenario: To login the website

Given  Launch the Chrome browser
When open the Taskmanager website
Then  given the username and password
And click the login button

@tc02_Tasklist
Scenario: Ope the Tasklist in the taskmanager website

Given  launch the chrome browse
When Open the Taskmanager website 
Then click on  tasklist
Then Select Assined to as Alex kniel
And click on search  button

@tc03_Adddetails
Scenario: Search task in the TaskManager website

Given open the browser and  access TaskManager website 
When click on  tasklist1
Then Select Assined to as Alex kniel and click on search  button
Then click on add task and fill all the datails  
And click the add button

@tc04_Print
Scenario:  Print task in the TaskManager website

Given Open the browser
When Access TaskManager website
Then open the task list
And print the tasks list

@tc05_Logout
Scenario: To logout the Taskmanager website

Given open the browser
When  access Taskmanager website
Then click the administration
And click the log
 

