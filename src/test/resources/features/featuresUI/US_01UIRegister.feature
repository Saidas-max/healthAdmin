@medunna_register

Feature:SSN_Validation

#  Background: user_goes_to_medunna_page
#    Given user goes to medunna homePage


  @medunna_register_validation_ssn
  Scenario Outline: TC01_Register
    Given user goes to medunna homePage
    When user clicks user icon
    And user clicks Register option
    And user enters the SSN number "<SSN_number>"
    And user enters the first name "<first_name>"
    And user enters the last name "<last_name>"
    And user enters the user name "<user_name>"
    And user enters the user email "<user_email>"
    And user enters the user new pasword "<user_password>"
    And user enters the user confirm new password "<user_confirm_password>"
    And user clicks the register button

    Examples: register_ssn
      | SSN_number  | first_name | last_name | user_name        | user_email        | user_password | user_confirm_password |
      | 472-59-9569 | Tommb     | Cruisemb   | DoctorCruisemb | cruisemb@gmail.com | Tom20mb        | Tom20mb                |


  Scenario Outline: TC01_Validation_SSN_Number
    When admin clicks on user icon
    And admin clicks Sign in option
    And admin enters user's name "<adminusername>" in field
    And admin enterspasswords's   "<adminpassword>" in field
    And admin on Remember Me checkbox
    And admin click on Sign In submit button
    And admin clicks Administration section
    And admin clicks usermanagement option
    And admin clicks ID sign
    Then verify that fourth character  of SSN should be dash
    Then verify that seventh character  of SSN should be dash
    Then verify that SSN number length should be nine digits

    Examples: ssn_verify_data
      | adminusername | adminpassword |
      | AdminTeam01  | Team01+       |

  @medunna_Validation_SSN_Not_Blank
  Scenario Outline: TC02_Validation_SSN_Number

    Then verify that SSN number should not be blank

    Examples: ssn_verify_data
      | adminusername | adminpassword |
      | AdminTeam01  | Team01+       |

  @medunna_Validation__firstname
  Scenario Outline: TC03_Validation_Firstname
    And admin clicks Administration section
    And admin clicks usermanagement option
    And admin clicks ID sign
    Then verify that firstname should not be blank
    Examples: ssn_verify_data
      | adminusername | adminpassword |
      | AdminTeam01  | Team01+       |

  @medunna_Validation__lastname
  Scenario Outline: TC04_Validation_Lastname
    And admin clicks Administration section
    And admin clicks usermanagement option
    And admin clicks ID sign

    Then verify that lastname should not be blank

    Then close the applicationmb

    Examples: ssn_verify_data
      | adminusername | adminpassword |
      | AdminTeam01  | Team01+       |

