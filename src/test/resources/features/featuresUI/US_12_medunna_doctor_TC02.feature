@us_12_13_medunnadoctor_TC02
Feature: US_12_medunna_doctor_TC02

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




  Scenario: US12_TC02_doctor sees patiets info
    Then verify patient's id;12
    Then verify patient's start date time;12
    Then verify patient's end date time;12
    Then verify patient's status;12


