Feature: Login feature
Scenario: To check if the login feature works with right username and password
Given User enters valid username and password
When user clicks on submit button
Then user logs into the homepage
Scenario Outline: Check login feature with invalid set of username and Password
Given User enters invalid "<username>" and "<password>" 
When user clicks on submit button
Then user fails to log into the homepage with error message "<Error Message>"
Examples:
   username		| password  | Error Message
  standard_user	| sauce	   	|	Epic sadface: Username and password do not match any user in this service
  standard_user	| labs		|	Epic sadface: Username and password do not match any user in this service
 	standard	| labs		|	Epic sadface: Username and password do not match any user in this service
  