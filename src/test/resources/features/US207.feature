@B32G1-248
  Feature:user should be able to access the Employees page.

  User Story:As a user, I should be able to access the Employees page;
  Accounts are: HR, Marketing, Helpdesk

  @B32G1-246
  Scenario: Verify that the user views the following 8 modules in the Employees page.
    Given the user is logged in
    When user sees Employees option and click it.
    Then user sees the following modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |


  @B32G1-247
  Scenario: Verify that the user views the Company Structure as default by clicking the Employees Module.
    Given the user is logged in
    When user sees Employees option and click it.
    Then user sees the Company Structure should be displayed by default