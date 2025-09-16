Feature: Login page feature
		
	Scenario: Login with incorrect credentials
		Given user is on login page
		When user enters email "vcvikas@gmail.com"
		And user enters password "Sign@13"
		And user clicks on Login button
		Then page contains "Your email or password is incorrect!" message 
		
	Scenario: Login with correct credentials
		Given user is on login page
		When user enters email "vcvikas@gmail.com"
		And user enters password "Newpass@13"
		And user clicks on Login button
		Then page contains "Logged in as Virat" message 