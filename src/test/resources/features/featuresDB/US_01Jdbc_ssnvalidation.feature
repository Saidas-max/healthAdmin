@db_validation_ssn
 Feature: db_customer_testing


   Scenario Outline: TC07_validation_registerant_ssn
    Given user connects to the application database

     And user gets the column "ssn" from table "jhi_user"

     And user reads all the  column data

     When user goes to medunna homePage
     When admin clicks on user icon
     And admin clicks Sign in option
     And admin enters user's name "<adminusername>" in field
     And admin enterspasswords's   "<adminpassword>" in field
     And admin on Remember Me checkbox
     And admin click on Sign In submit button
     And admin clicks Administration section
     And admin clicks usermanagement option

     And get the ssn number from first row


     Then verify  ssnNumber should be in jhi_user list
     Then close the applicationmb
    Examples: ssn_verify_data
     | adminusername | adminpassword |
     | AdminTeam01  | Team01+       |














