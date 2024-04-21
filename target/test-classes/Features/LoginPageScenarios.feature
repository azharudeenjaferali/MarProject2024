Feature: This feature is to test the Login Page scenarios

	Scenario: This scenario is to test the Login functionality
		Given Launch browser and load facebook url
		When Provide the valid username and password and sign in
		Then Validate if the login successful the specific user.
		
	Scenario Outline: This scenario is to test the Login functionality
		Given Launch browser and load facebook url
		When Provide the valid "<UserName>" and "<Password>" and sign in
		Then Validate if the login successful the specific user.
	
	Examples: 
	|UserName|Password|
	|mathew@gmail.com|Test@123|
	|rekha@yopmail.com|Welcome$3|
	|mouli@yopmail.com|Dontcome$3|