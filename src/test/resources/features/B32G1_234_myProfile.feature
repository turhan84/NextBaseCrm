@B32G1-234
Feature: Default

	
	@B32G1-233

		Scenario Outline: Verify that the user's email under My Profile tab matches the user's account
		    When the user logs in with "<username>" and "<password>"
		
		   # Given the user  logs in with "<username>" and "<password>"
		    Then the user navigates to  My Profile on the user page
		    Then  The user selects "My Profile" tab from the list
		    When the user selects the General tab
		    Then the user's email should be displayed under the General tab
		    And the displayed email should match "<username>"
		
		    Examples:
		      | username              | password |
		      | hr21@cydeo.com        | UserUser |
		      | helpdesk21@cydeo.com  | UserUser |
		      | marketing21@cydeo.com | UserUser |	

	
	@B32G1-232

		Scenario Outline: Verify that the user can view options on My Profile page
		    #Given the user is on the login page
		    When the user logs in with "<username>" and "<password>"
		    Then the user navigates to  My Profile on the user page
		    And the user should see the following options
		      | My Profile              |
		      | Edit Profile Settings   |
		      | Themes                  |
		      | Configure notifications |
		      | Log out                 |
		      Examples:
		      | username              | password |
		      | hr21@cydeo.com        | UserUser |
		      | helpdesk21@cydeo.com  | UserUser |
		      | marketing21@cydeo.com | UserUser |