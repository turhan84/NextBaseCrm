@B32G1-224
Feature: Appreciation tab

	#* Mandatory fields: 'Message Content' & 'To'.
	# * Error messages for mandatory fields:
	# ** "The message title is not specified."
	# ** "Please specify at least one person."
  Background:
    Given user is on the Appreciation page

  @B32G1-223
  Scenario: user should be able to send appreciation by clicking on Appreciation tab in the Activity Stream
    Given user should verify the delivery is All employees by default
    Then user can send an appreciation by filling in the mandatory fields "Message Content & To"
    And user should to see Mandatory fields: Message content & To

    #This code include Bug
  Scenario: user should to see Error messages
    Given user should to see Error messages for mandatory fields "The message title is not specified" and "Please specify at least one person."

  Scenario:
    Given verify that the user can cancel sending appreciation at any time before sending