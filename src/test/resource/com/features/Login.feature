Feature: Login page feature

	Scenario: Login page title
		Given user is on login page
		When user gets the title of the page
		Then page title should be "LoginPage Practise | Rahul Shetty Academy"
		
	Scenario: Forget Password Link
		Given user is on login page
		Then forgot password link should be displayed
		
	Scenario: Login with correct credentials
		Given user is on login page
		When user enters username "vikasqa@gmail.com"
		And user enters password "Newpass@13"
		And user clicks on Login button
		Then user gets the title of the home page
		And page title should be "My Account"  