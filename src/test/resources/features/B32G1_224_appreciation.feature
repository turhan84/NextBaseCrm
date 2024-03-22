@B32G1-224
Feature: Default

	#* Mandatory fields: 'Message Content' & 'To'.
	# * Error messages for mandatory fields:
	# ** "The message title is not specified."
	# ** "Please specify at least one person."
	@B32G1-223
	Scenario: user should be able to send appreciation by clicking on Appreciation tab in the Activity Stream
		Given user is on the Appreciation page
		Then user should verify the delivery is All employees by default
		And user should to see Error messages for mandatory fields "The message title is not specified" and "Please specify at least one person."
		When user can send an appreciation by filling in the mandatory fields
		When user should to see Mandatory fields: Message content & To
		And verify that the user can cancel sending appreciation at any time before sending