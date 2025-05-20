Feature: Login

Scenario: Successful Login with valid Credential
	Given User Lunch Chrome Browser
	When User Open URL "https://admin-demo.nopcommerce.com/login"
	And User enter Email as "admin@yourstore.com" and password as "admin"
	And Click login
	Then page title should be "Dashboard / nopCommerce administration"
	When User click on logout Link
	Then Page title should be "nopCommerce demo store. Login"
	And Close browser
	
Scenario Outline: Login DataDriven
	Given User Lunch Chrome Browser
	When User Open URL "https://admin-demo.nopcommerce.com/login"
	And User enter Email as "<email>" and password as "<password>"
	And Click login
	Then page title should be "Dashboard / nopCommerce administration"
	When User click on logout Link
	Then Page title should be "nopCommerce demo store. Login"
	And Close browser
	
Examples:
	
		| email | password |
		| admin@yourstore.com | admin |
		| asdfd@gmail.com | zxy |
