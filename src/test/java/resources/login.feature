Feature: Login feature
Scenario: To check if the login feature works with right username and password
Given User enters valid username and password
When user clicks on submit button
Then user logs into the homepage
Scenario Outline: Check login feature with invalid set of username and Password
Given User enters invalid "<username>" and "<password>" 
When user clicks on submit button
Then user fails to log into the homepage with error message
Examples:
 | username			| password  |
 | standard_user	| sauce 	|	
 |standard_user		| labs		|	 
 |standard			| labs		|	
  