@B32G1-221
Feature: Default

	
	@B32G1-215
	Scenario Outline: Verify that the user can log in with valid credentials and land on the home page after successful login.
		When The user enters valid username "<Username>" and password "<Password>"
		    And The user clicks on the login button
		    Then The user is redirected to the <UserType> home page
		
		    Examples:
		      | UserType  | Username              | Password |
		      | HR        | hr21@cydeo.com        | UserUser |
		      | Marketing | helpdesk21@cydeo.com  | UserUser |
		      | Helpdesk  | marketing21@cydeo.com | UserUser |	

	
	@B32G1-216
	Scenario: Verify that "Incorrect login or password" error message is displayed for invalid (valid username-invalid password and invalid username-valid password) credentials.
		When The user enters an invalid username "invalidUser" and an invalid password "invalidPass"
		    Then An "Incorrect login or password" error message is displayed	

	
	@B32G1-217
	Scenario: Verify that "Incorrect login or password" error message is displayed for invalid (valid username-invalid password and invalid username-valid password) credentials.
		When The user enters a valid username "validUser" and an invalid password "invalidPass"
		    Then An "Incorrect login or password" error message is displayed	

	
	@B32G1-218
	Scenario:  Verify that the "Please fill out this field" error message is displayed if the password or username is empty.
		When The user attempts to login with an empty username or password
		    Then A "Please fill out this field" error message is displayed for the empty field	

	
	@B32G1-219
	Scenario: Verify that the "Remember me on this computer" link exists and is clickable on the login page.
		Then The "Remember me on this computer" option is visible and clickable	

	
	@B32G1-220
	Scenario: Verify that the password is in bullet signs by default
		Then The password is displayed in bullet signs