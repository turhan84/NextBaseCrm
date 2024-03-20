@login
Feature: User Login Functionality

  Background:
    Given The login page is displayed

  Scenario Outline: Verify that users can log in with valid credentials
    When The user enters valid username "<Username>" and password "<Password>"
    And The user clicks on the login button
    Then The user is redirected to the <UserType> home page

    Examples:
      | UserType  | Username              | Password |
      | HR        | hr21@cydeo.com        | UserUser |
      | Marketing | helpdesk21@cydeo.com  | UserUser |
      | Helpdesk  | marketing21@cydeo.com | UserUser |

  Scenario: Verify error message for invalid credentials
    When The user enters an invalid username "invalidUser" and an invalid password "invalidPass"
    Then An "Incorrect login or password" error message is displayed

  Scenario: Verify error message for valid username and invalid password
    When The user enters a valid username "validUser" and an invalid password "invalidPass"
    Then An "Incorrect login or password" error message is displayed

  Scenario: Verify error message for empty username or password
    When The user attempts to login with an empty username or password
    Then A "Please fill out this field" error message is displayed for the empty field

  Scenario: Verify the "Remember me on this computer" link is clickable
    Then The "Remember me on this computer" option is visible and clickable

  Scenario: Verify that the password is masked
    Then The password is displayed in bullet signs