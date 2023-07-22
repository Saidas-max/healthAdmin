@UI_10_staff_edits

Feature:patient edition
  Scenario Outline: staff should be able to edit patient
    Given user clicks the logIn dropdown
    When user clicks on the signIn button
    And user provides the userName as "<userName>"
    And user provides the passWord as "<passWord>"
    And user clicks on the signInButton
    And user clicks MY PAGEUI
    And user clicks SearchPatientUI button
    And user provides patient in SSNUI box "<SSN>"
    And user clicks edit button
    And user edit "<firstName>"
    And user editss "<lastName>"
    And user edit birthDateBox
    And user edit "<email>"
    And user  edit phoneNumberBox
    And user edit genderDropDown
    And user edit bloodGroupDropDown
    And user edit addressBox
    And user edit descriptionBox
    And user edit userPatientDropDown
    And user edit countryDropDown
    And user edit stateDropDown
    And user  edit saveButton

#    Then user verifies information changed successfully
    Examples: user info
      |userName        |passWord |        SSN        |      email           |  firstName | lastName|
      |talehmecid      |T2023$tm |     113-13-6789   |temkinabir@gmail.com  |   Temkin   |   Abir  |