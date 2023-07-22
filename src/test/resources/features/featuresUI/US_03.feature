@US03
Feature:Registration page should restrict password usage to a secure
  and high level passcode

  Background:
    Given user goes to medunna url3
    When clicks on account icon3
    And clicks on register button3
    And verify the url is medunnaRegistrationUrl
    And click on new password input

  Scenario:TC_01 Registration with 7 digit pwd without uppercase letter
    And send 7 or more digit pwd without uppercase letter
    Then verify the pwd strength is 4 bars
    And close the applicationfu

  Scenario:TC_02 Registration with 7 digit pwd with 1 uppercase letter
      And send 7 or more digit pwd with 1 uppercase letter
      Then verify the pwd strength is 5 bars
      And close the applicationfu

  Scenario: TC_03 Registration with 7 digit pwd without lowercase letter
    And send 7 or more digit pwd without lowercase letter
    Then verify the pwd strength is 4 bars
    And close the applicationfu

    Scenario: TC_04 Registration with 7 digit pwd with 1 lowercase letter
      And send 7 or more digit pwd with 1 lowercase letter
      Then verify the pwd strength is 5 bars
      And close the applicationfu

  Scenario: TC_05 Registration with 7 digit pwd without digit
    And send 7 or more digit pwd without digit
    Then verify the pwd strength is 4 bars
    And close the applicationfu

  Scenario: TC_06 Registration with 7 digit pwd with 1 digit
    And send 7 or more digit pwd with 1 digit
    Then verify the pwd strength is 5 bars
    And close the applicationfu

  Scenario: TC_07 Registration with 7 digit pwd without special character
    And send 7 or more digit pwd without special character
    Then verify the pwd strength is 4 bars
    And close the applicationfu

  Scenario: TC_08 Registration with 7 digit pwd with 1 special character
    And send 7 or more digit pwd with 1 special character
    Then verify the pwd strength is 5 bars
    And close the applicationfu

    Scenario:TC_09 Registration with 3 digit pwd
    And send 3 digit pwd
    And click on new password confirmation input
    Then verify error message
    And close the applicationfu

  Scenario:TC_10 Registration with 4 digit pwd
    And send 4 digit pwd
    Then verify Password strength: text is displayed
    And close the applicationfu

  Scenario:TC_11 Registration with 6 digit pwd including letters, char and digit
    And send 6 digit pwd including letters, char and digit
    Then verify the password is weak
    And close the applicationfu

  Scenario:TC_12 Registration with 7 digit pwd including letters, char and digit
    And send 7 digit pwd including letters, char and digit
    Then verify the pwd strength is 5 bars
    And close the applicationfu










