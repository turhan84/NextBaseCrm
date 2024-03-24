@LinkInMessage
Feature: As a user I should be able to add link in message


  Scenario: User should be able to add link in the message
    Given the user is logged in to the app
    When user clicks the message section
    Then user should be able to click the link button
    And user should be able to fill "ebay" and "www.ebay.com" section
    And user should be able to click save button
    And user clicks send button


  Scenario: Verify that by clicking on the link the user can navigate to the correct URL
    Given the user is logged in to the app
    When user clicks the message section
    Then user should be able to click the link button
    And user should be able to fill "Tesla" and "www.tesla.com" section
    And user should be able to click save button
    And user clicks send button
    When user clicks the text
    Then user should navigate to the correct "Tesla"

  Scenario: Verify that the link is opened in a new tab.
    Given the user is logged in to the app
    When user clicks the message section
    Then user should be able to click the link button
    And user should be able to fill "BMW" and "www.bmw.com" section
    And user should be able to click save button
    And user clicks send button
    When user clicks the text
    Then user should navigate to the correct "BMW"
    And verify the link opened in a new tab


