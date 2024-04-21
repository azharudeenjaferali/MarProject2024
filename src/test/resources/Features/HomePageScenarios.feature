#This to study BDD framework

Feature: This feature is to test the Home Page scenarios

	Scenario: This scenario is to test the Mobile search on Amazon site
		Given Launch the browser and load the amazon url
		When Provide the key on search box and click on search button
		Then validate if the results are for the Mobiles
		
	Scenario: This scenario is to test the Laptop search on Amazon site
		Given Launch the browser and load the amazon url
		When Provide the key Laptop on search box and click on search button
		Then validate if the results are for the Laptops
		
	Scenario: This scenario is to test purchase samsung phone with CC
		Given Launch the browser and load the amazon url
		And Login to the account
		When Select the samsung phone and add it to cart
		And Provide the payment detail on checkout page and submit order
		Then Validate if the order placed successfully
		