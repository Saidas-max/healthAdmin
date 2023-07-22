@db_validation_email
Feature: db_customer_testing


 // @email_validation_jdbc
  Scenario Outline: TC05_validation_registerant_email
    Given user connects to the application database

    And user gets the column email "email" from table "jhi_user"

    And user reads all the  email data

     When user goes to medunna homePage
     When admin clicks on user icon
    And admin clicks Sign in option
    And admin enters user's name "<adminusername>" in field
    And admin enterspasswords's   "<adminpassword>" in field
    And admin on Remember Me checkbox
    And admin click on Sign In submit button
    And admin clicks Administration section
     And admin clicks usermanagement option

    And get the user email from first row

    Then verify  userEmail should be in jhi_user list
    Then close the applicationmb
    Examples: ssn_verify_data
      | adminusername | adminpassword |
      | AdminTeam01  | Team01+       |




