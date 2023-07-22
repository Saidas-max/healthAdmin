@us_12_13_medunnadoctor_TC03
Feature: US_12_medunna_doctor_TC03

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


  Scenario: US12_TC03_doctor types required fields in patient appointment
    Then verify you see "this field is required" message on empty Anamnesis field when you enter the save button12
    Then verify you see "this field is required" message on empty Treatment field when you enter the save button12
    Then verify you see "this field is required" message on empty Diagnosis field when you enter the save button12

