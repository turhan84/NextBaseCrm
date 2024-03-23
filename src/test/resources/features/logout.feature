@logout
Feature:Users should be able to logout

  @wip
  Scenario: User successfully logs out from the app
    Given the user is logged in to the app
    When the user can see logout button under the profile name.
    And   the user should click logout button
    Then verify user successfully logout


