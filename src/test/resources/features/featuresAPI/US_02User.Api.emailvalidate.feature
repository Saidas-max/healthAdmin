@email_validation_api
Feature: Email_Validate

  Scenario: TC05_user_email_validate
    Given user sets the url "https://medunna.com/api/user?ssn=553-49-3919"
    And sends a get request to get all registrant data
     And get the email from response
     Then HTTP StatusCode should be 200
     Then  Verify Response ContentType is "application/json"
     Then verify that responseemail has @ and .
    Then verify that responseemail is not blank
     Then verify responseemail length should be greater zero




