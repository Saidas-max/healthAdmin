@US_14
Feature: My Appointments / Edit / Test Results by Physician (Doctor)


  Scenario:US_14 Doctor sees patient test background

    Given  Doctor is in "https://medunna.com" Medunna_US14
    When Click on ICON on the menu_US14
    And  click on Sign In option_US14
    And input registered Username_US14
    And input registered  password_US14
    And check rememmber me checkbox_US14
    And click submit button confirm submission_US14
    And click My page

    And click My Appointment control patient Tests_US14
    And clik edit to be able to go Sedats test results_US14
    And click Show test Results to see patient tests_US14
    And click View results get patient's tests details_US14
    Then Assert that patients test outcomes is displayed on Appointments_US14




  Scenario: Doctor can also request Impatient ( patient can stay in hospital )
    And click My page
    And Click on My Inpatient_US14
    And Click edit In Patient_US15
    And click Status to change the inpatient status_US14
    And change status from Canceled to Staying_US14
   And Select ROOM number from dropdown_US14
    And Click SAVE  button confirm changes_US14
    Then take a screenshot of notification after clicking save_US14

    Then close the application14







