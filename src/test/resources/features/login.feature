@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples: User types values
      | userType       |
      | hr user        |
      | helpdesk user  |
      | marketing user |

  Scenario: Verify login with username and password
    Given the user logged in with username as "helpdesk20@cydeo.com" and password as "UserUser"
