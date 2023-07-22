@us_13_TC02
Feature: US_13_medunna_doctor_TC02

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


  Scenario: US13_TC02_Doctor request test
    And click on "Request A Test" button13
    Then verify "Glucose" "Urea" "Creatinine" "Sodium Potassium" "Total protein" "Albumin"  "Hemoglobin" has checkmark options13
