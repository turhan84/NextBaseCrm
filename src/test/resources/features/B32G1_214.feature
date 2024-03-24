Feature: Company Items Features

  Scenario: Verify Company Menu Items
    Given the user logged in with username as "helpdesk20@cydeo.com" and password as "UserUser"
    When user clicks on CRM24 Menu Button
    Then user verifies that company menu contains the options below
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |