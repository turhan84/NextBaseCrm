@B32G1-245
Feature: Default

  @B32G1-235
  Scenario Outline: Verify default delivery option is 'All employees'
    Given the user is logged in to the app as user "<userType>"
    When the user navigates to the Poll tab under Activity Stream
    Then the default delivery option should be 'All employees'
    Examples:
      | userType  |
      | hr        |
      | helpDesk  |
      | marketing |


  @B32G1-238
  Scenario Outline: Create a poll with questions and multiple answers
    Given the user is logged in to the app as user "<userType>"
    And the user navigates to the Poll tab under Activity Stream
    When the user creates a poll with title "New Office Poll", question "What is your favorite coffee?", and answers "Latte", "Espresso", "Cappuccino"
    And the user submits the poll
    Then the poll with question "What is your favorite coffee?" should be visible in the Activity Stream

    Examples:
      | userType  |
      | hr        |
      | helpDesk  |
      | marketing |

  @B32G1-240
  Scenario Outline: Allow multiple choices in a poll
    Given the user is logged in to the app as user "<userType>"
    And the user navigates to the Poll tab under Activity Stream
    When the user creates a poll with title "New Office Poll", question "What is your favorite coffee?", and answers "Latte", "Espresso", "Cappuccino"
    When  the user creates a poll with the "Allow multiple choice" option enabled
    And the user submits the poll
    Then the poll should allow multiple selections

    Examples:
      | userType  |
      | hr        |
      | helpDesk  |
      | marketing |

  @B32G1-242
  Scenario Outline: Verify error messages for mandatory fields in poll creation
    Given the user is logged in to the app as user "hr"
    And the user navigates to the Poll tab under Activity Stream
    And the user creates a poll with title "New Office Poll", question "What is your favorite coffee?", and answers "Latte", "Espresso", "Cappuccino"
    When the user attempts to create a poll with "<Field>" missing
    And the user submits the poll
    Then the error message "<ErrorMessage>" should be displayed

    Examples:
      | Field           | ErrorMessage                        |
      | message title   | The message title is not specified  |
      | recipient       | Please specify at least one person. |
      | question text   | The question text is not specified. |
      | question answer | The question "..." has no answers.  |

#    Examples:
#    | userType    | Field           | ErrorMessage                        |
 #   | hr          | message title   | The message title is not specified  |
#    | helpDesk    | recipient       | Please specify at least one person. |
 #   | marketing   | question text   | The question text is not specified. |
 #   |             | question answer | The question "..." has no answers.  |

@wip1
  Scenario Outline: Verify error messages for mandatory fields in poll creation
    Given the user is logged in to the app as user "helpDesk"
    And the user navigates to the Poll tab under Activity Stream
    And the user creates a poll with title "New Office Poll", question "What is your favorite coffee?", and answers "Latte", "Espresso", "Cappuccino"
    When the user attempts to create a poll with "<Field>" missing
    And the user submits the poll
    Then the error message "<ErrorMessage>" should be displayed

    Examples:
      | Field           | ErrorMessage                        |
      | message title   | The message title is not specified  |
      | recipient       | Please specify at least one person. |
      | question text   | The question text is not specified. |
      | question answer | The question "..." has no answers.  |

  @wip2
  Scenario Outline: Verify error messages for mandatory fields in poll creation
    Given the user is logged in to the app as user "marketing"
    And the user navigates to the Poll tab under Activity Stream
    And the user creates a poll with title "New Office Poll", question "What is your favorite coffee?", and answers "Latte", "Espresso", "Cappuccino"
    When the user attempts to create a poll with "<Field>" missing
    And the user submits the poll
    Then the error message "<ErrorMessage>" should be displayed

    Examples:
      | Field           | ErrorMessage                        |
      | message title   | The message title is not specified  |
      | recipient       | Please specify at least one person. |
      | question text   | The question text is not specified. |
      | question answer | The question "..." has no answers.  |