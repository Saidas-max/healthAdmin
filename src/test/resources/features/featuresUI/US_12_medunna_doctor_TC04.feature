@us_12_13_medunnadoctor_TC04
Feature: US_12_medunna_doctor_TC04

  Background: Signin Medunna
    Given user is on "https://medunna.com" page12
    When click on user icon12
    And click on Sign In option12
    And enter "doktorfazilet" in username input12
    And enter "unutma." in password input12
    And click on Sign In submit button12
    And click on MY PAGES12
    And click on My Appointments12
    And clicks on edit button to create or edit an appointment12

  Scenario: US12_TC04_prescription and description can be optional
    Then verify prescription is optional12
    Then verify description is optional12
