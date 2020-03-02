Feature: Hotel booking in Adactin Application 

Background:
Given User launch the adactic application
Then user logout thr current scenerio

Scenario Outline: User will Create and booking the hotel 
	Given User enter the adactic application 
	When user enter the Registered username '<username>' is username 
	And user enter the Registered Password '<password>' is password 
	Then user click the Login button 
	
	Examples: 
		|username|password|
		|aaaaaaa|1234y4uu|
		|ananthamechkumar|ananth123|
		|vinovicky|Jan@2020|
		
		
		
Scenario: User will Create and booking the hotel 
	Given User enter the adactic application 
	When user enter the Registered username "ananthamechkumar" is username 
	And user enter the Registered Password "ananth123" is password 
	Then user click the Login button 
	
	
Scenario: : Hotel book in adactin application 

	When  user select the location of hotel 
	And user select the hotel name 
	And user select the Room type 
	And user select the number of rooms 
	And user selecting the checkin date 
	And user select the checkout date 
	And user select the Adults room 
	And user select the children room 
	Then user select the search operation for hotel 
	
Scenario: Confirm the hotel booking 

	When User select the hotel 
	Then user Confirm the hotel 
	
Scenario: User book a hotel 

	When user enter the firstname 
	And user enter the lastname 
	And user enter the billing address and details 
	And user enter the credit card sixteen digit number 
	And user select the credit card type 
	And User select the credit card Expiry month 
	And user select the credit card expiry year 
	And user enter the cvv number 
	And user click the booking function 
	Then user logout in the adactin application 
	
	
	
	
	
	
	 