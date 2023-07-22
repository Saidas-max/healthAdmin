@us_12_13_medunnadoctor
Feature: US_12_medunna_doctor

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


    Scenario: US12_TC01_Populate info in appointment12
      Then  verifies patient's id,start datetime and end datetime, status12
      And  Doctor fills in required fields, anemnesis, treatment, diagnosis12
      And  click on save button12
      Then Verify appointment is saved successfully12
      Then click on user icon12
      Then close the applicationmb




