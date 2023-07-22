@US16
Feature: Create or Edit Patient by just Admin

  Background:
    Given user goes to medunna url3
    When clicks on account icon3
    And clicks on user sign in option4
    And send admin username into username input4
    And send admin password into password input4
    And clicks on Sign in button4
    And clicks on Items and Titles option
    And clicks on Patient option

    Scenario:TC_01 Patient firstname box is clickable

    And clicks on Create a new patient
    And enters firstname
    And enters lastname
    And enters birthdate
    And enters email
    And enters phone
    And enters gender
    And enters blood group
    And enters address
    And enters description
    And select country
    And select state
    And clicks on save button
    Then verify A new patient is created with identifier text is visible
      And click on adminTeam03
      And click on sign out
      And close the applicationfu

    Scenario: TC_02 Patient first name is visible
      When admin clicks first patient id
      Then verify patient firstname is visible.
      And click on adminTeam03
      And click on sign out
      And close the applicationfu

    Scenario: TC_03 Patient last name is visible
      When admin clicks first patient id
      Then verify patient lastname is visible.
      And click on adminTeam03
      And click on sign out
      And close the applicationfu

  Scenario: TC_04 Patient birthdate is visible
    When admin clicks first patient id
    Then verify patient birthdate is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

  Scenario: TC_05 Patient phone is visible
    When admin clicks first patient id
    Then verify patient phone is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

  Scenario: TC_06 Patient gender is visible
    When admin clicks first patient id
    Then verify patient gender is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

  Scenario: TC_07 Patient blood group is visible
    When admin clicks first patient id
    Then verify patient blood group is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

  Scenario: TC_08 Patient address is visible
    When admin clicks first patient id
    Then verify patient address is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu


  Scenario: TC_09 Patient country is visible
    When admin clicks first patient id
    Then verify patient country is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

  Scenario: TC_10 Patient state is visible
    When admin clicks first patient id
    Then verify patient state is visible.
    And click on adminTeam03
    And click on sign out
    And close the applicationfu

   Scenario: TC_11 Country box cannot be blank
    When clicks on Create a new patient
    Then verify country box  is selectable
     And click on adminTeam03
     And click on sign out
     And close the applicationfu

  Scenario: TC_11 State box cannot be blank
    When clicks on Create a new patient
    Then verify  state box is selectable
    And click on adminTeam03
    And click on sign out
    And close the applicationfu








