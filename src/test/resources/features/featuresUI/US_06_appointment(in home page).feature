@US_06_Appointment_Feature
Feature: Appointment Feature

  Background:
    Given user navigate to "https://www.medunna.com/" pageYA

  @TC_01A
  Scenario: TC_01 Verify making an appointment with any chars in firstname input
    When user click on make an appointment buttonYA
    When user enter firstname that contains any charsYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify Appointment registration saved message is displayed on the pageYA
    Then close the applicationYA

  @TC_02A
  Scenario: TC_02 Verify making an appointment with any chars in lastname input
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter lastname that contains any charsYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify Appointment registration saved message is displayed on the pageYA
    Then close the applicationYA

  @TC_03A
  Scenario: TC_03 Verify that firstname input should not be blank
    When user click on make an appointment buttonYA
    When user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify your firstname is required message is pop up on the pageYA
    Then close the applicationYA

  @TC_04A
  Scenario: TC_04 Verify that lastname input should not be blank
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter registered SSN idYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify your lastname is required message is pop up on the pageYA
    Then close the applicationYA

  @TC_05A
  Scenario: TC_05 Verify that user can make an appointment with registered SSN id
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    And Verify Appointment registration saved message is displayed on the pageYA
    Then close the applicationYA

  @TC_07A
  Scenario: TC_07 Verify that SSN id input should not be blank
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify your SSN is required message is pop up on the pageYA
    Then close the applicationYA

  @TC_08A
  Scenario: TC_08 Verify that email input should not be blank
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify your email is required message is pop up on the pageYA
    Then close the applicationYA

  @TC_09A
  Scenario: TC_09 Verify that user can not make an appointment with invalid email
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter invalid email addressYA
    And user enter valid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    And Verify This field is invalid message is pop up on the pageYA
    Then close the applicationYA

  @TC_10A
  Scenario: TC_10 Verify that user can not make an appointment with invalid phone number
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user enter invalid phone numberYA
    And user click on Send and Appointment Request ButtonYA
    And Verify Phone number is invalid message is pop up on the pageYA
    Then close the applicationYA

  @TC_11A
  Scenario: TC_11 Verify that phone number input should not be blank
    When user click on make an appointment buttonYA
    When user enter registered firstnameYA
    And user enter  registered lastnameYA
    And user enter registered SSN idYA
    And user enter registered email addressYA
    And user click on Send and Appointment Request ButtonYA
    Then Verify Phone number is required message is pop up on the pageYA
    Then close the applicationYA

  @TC_12A
  Scenario: Tc_12 Verify patient's information saved when user making appointment
    When staff click on user icon optionYA
    And staff click on sign in optionYA
    And staff enter registered usernameYA
    And staff enter registered passwordYA
    And staff click on Sign in submit buttonYA
    And staff click on MY PAGES on menuYA
    And staff click on Search Patient from dropdownYA
    And staff enter patient registered SSN in in the search boxYA
    Then Verify patient information appears on the pageYA
    Then close the applicationYA


