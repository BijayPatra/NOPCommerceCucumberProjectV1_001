Feature: Customers
Scenario: Add new Customer
	Given User Lunch Chrome Browser
	When User Open URL "https://admin-demo.nopcommerce.com/login"
	And User enter Email as "admin@yourstore.com" and password as "admin"
	And Click login
	Then User can View Dashbord
	When User click on Customer menu
	And click on Customer menu Item
	And click on Add new button
	Then user can view add new customer page
	When user enter customer info
	And click on Save button
	Then user can view conformation message "The new customer has been added successfully"
	And Close the browser