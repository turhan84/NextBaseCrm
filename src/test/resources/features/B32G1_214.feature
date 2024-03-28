Feature: Company Items Features

  Scenario: Verify Company Menu Items
    Given the user is logged in to the app
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