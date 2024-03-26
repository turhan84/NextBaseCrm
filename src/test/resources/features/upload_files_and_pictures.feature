Feature: As a user, I should be able to upload files and pictures while sending appreciation
  Ac.
  1. Verify that the user can upload files and pictures.
  Supported file formats .pdf, .txt, .jpeg, .png, .docx
  2. Verify that the user can insert the files and images into the text.
  3. Verify that the user can remove files and images at any time before sending.

Background:User is on logged into the Application
  When User is on the Activity Stream page as "hr"


  Scenario: As a user, I should be able to upload files.
    When user is on the Activity Stream page and navigates to the Appreciation module
    Then user is able to see and clicks "upload" files button
    And user is able to upload the file

    Scenario: User can insert the files and images into the text.
      When user is on the Activity Stream page and navigate's to the Appriciation module
      Then user is able to insert files into texting mode
      And user can see the file into the text

      Scenario: User can remove files and images at any time before sending.
        When user is on the Activity Stream page and navigate's to the Appriciation module
        And user have inserted files and images into the text
        Then user is able to remove any file or picture before sending