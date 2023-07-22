@medunna_UserName_Email

Feature:UsernameEmail_Validation

#  Background: user_goes_to_medunna_page
#    Given user goes to medunna homePage


  @medunna_usernameemail_data
  Scenario: TC01_UserNameEmail
    Given user goes to medunna homePage
    When user clicks user icon
    And user clicks Register option
    And user enters the SsnNumber "SSN_number"
    And user enters the firstName "first_name"
    And user enters the lastName "last_name"
    And user enters the userName "user_name"
    And user enters the userEmail "user_email"
    And user enters the userNewPasword and confirm password "user_password"
    And user clicks the register button


  Scenario: TC01_Validation_username
    When admin clicks on user icon
    And admin clicks Sign in option
    And admin enters user's name "AdminTeam01" in field
    And admin enterspasswords's   "Team01+" in field
    And admin on Remember Me checkbox
    And admin click on Sign In submit button
    And admin clicks Administration section
    And admin clicks usermanagement option
    And admin clicks ID sign
    And admin click the edit button

    Then verify that  username should have any chars
    Then  verify that username cannot be blank



  @medunna_username_Unique_API
  Scenario: TC02_Validation_username_Unique
    Given user set the Medunna healty url
    And sends a get-request to get all users registrants data
    Then HTTP Status Code is 200
    Then  Verify response content should be "application/json"
    Then Verify expected username "steven.turner" unique

  @medunna_email_has_@_and_"."
  Scenario: TC03_Validation_email_@ and "."
    Then verify that email has @ and .

  @medunna_email_not_blank
  Scenario: TC04_Validation_not_blank
    Then verify that email is not blank
    Then verify email length should be greater zero
    Then close the applicationYA


