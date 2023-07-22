@US_26UIna

Feature: new appointment
  Scenario: user can make a new appointment
    Given user clicku the logIn dropdown
    And user clicku on the signIn button
    And user provideu the userName "<userName>"
    And user provideu the passWord "<passWord>"
    And user clicku on the SignIn button
    And user clicku on the MY PAGES(PATIENT)
    And user clicku on the Make an Appointment
    And user clicku on the First Name
    And user clicku on the Last Name
    And user clicku on the SSN
    And user clicku on the Email
    And user clicku on the Phone
    And user clicku on the Appointment DateTime
    Then user clicku on Send an Appointment Request Button




