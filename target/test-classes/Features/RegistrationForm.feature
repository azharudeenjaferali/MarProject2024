Feature: This feature is to test the registration flow

#asList<>()
#Scenario: This scenario is to perform student registration
#	Given Launch the browser and load the url
#	When Provide the valid details of student
#	|Azhar|
#	|Mohamed|
#	|azharudeen@gmail.com|
#	|Male|
#	|Chennai|
#	Then Submit the request and validate if its registered successfully

#asLists<>()     //list of list	
#Scenario: This scenario is to perform student registration
#	Given Launch the browser and load the url
#	When Provide the valid details of student
#	|Mouli|Male|Chennai|
#	|Rekha|Female|Bangalore|
#	|Mathew|Male|Delhi|	
#	Then Submit the request and validate if its registered successfully
	
Scenario: This scenario is to perform student registration
	Given Launch the browser and load the url
	When Provide the valid details of student
	|FirstName|Gender|Location|
	|Mouli|Male|Chennai|
	|Rekha|Female|Bangalore|
	|Mathew|Male|Delhi|	
	Then Submit the request and validate if its registered successfully
	
	