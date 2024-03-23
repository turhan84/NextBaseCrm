@wip
Feature:
  As a user, I should be able to see all the options on the Activity stream page


  Scenario : Verify options on Activity Stream Page
    Given user is on the Activity Stream Page page
    Then user should see options as expected

      | option  |
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |


  Scenario  : Verify options on more
    Given user is on the Activity Stream Page page
    Then user should see options as expected


      | option       |
      | File         |
      | Appreciation |
      | Announcement |
      | Work Flow    |
