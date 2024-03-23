@B32G1-228
Feature: Default

	
	@B32G1-225
	Scenario Outline: Verify that the Company Structure is visible for all user types
		Given the user type is "<UserType>"
		    When the user navigates to the Employee menu
		    Then the Company Structure option should be visible
		    
		    Examples:
		      | UserType  | Username              | Password |
		      | HR        | hr21@cydeo.com        | UserUser |
		      | Marketing | helpdesk21@cydeo.com  | UserUser |
		      | Helpdesk  | marketing21@cydeo.com | UserUser |	

	
	@B32G1-226
	Scenario Outline: Verify that the HR user can add a department from the Company Structure
		Given the user is "<UserType>"
		    And the user is on the Company Structure page
		    When the user navigates to the Employee menu
		    When the user clicks on the ADD DEPARTMENT button
		    And the user enters "<DepartmentName>" as the department name
		    And the user submits the form
		    Then a new department with the name "<DepartmentName>" should be added to the Company Structure
		
		    Examples:
		      | UserType | DepartmentName | UserName       | Password |
		      | HR       | HR Department  | hr21@cydeo.com | UserUser |	

	
	@B32G1-227
	Scenario Outline:  Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users 
		Given user type is "<UserType>"
		    And the user is on the Company Structure page
		    Then the "ADD DEPARTMENT" button should not be displayed
		
		    Examples:
		      | UserType  | Username              | Password |
		      | Marketing | helpdesk21@cydeo.com  | UserUser |
		      | Helpdesk  | marketing21@cydeo.com | UserUser |