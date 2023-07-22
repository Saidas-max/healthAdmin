
@US_15

Feature: Doctor should be able to edit patient info  - View / Edit Impatients by Physician (Doctor)

  Background:
    Given  Doctor is in "https://medunna.com" Medunna_US15
    When Click on ICON on the menu_US15
    And  click on Sign In option_US15
    And input registered Username_US15
    And input registered  password_US15
    And check rememmber me checkbox_US15
    And click submit button confirm submission_US15

  Scenario: Doctor can view all patient info such as; ID, start and end dates, description, created date
  appointment id, status, room and patient
    And click My page
    And click My Patients_US15
    Then verify doctor can see ID_US15
    And verify doctor can see start and_US15
    And verify doctor can see created end dates_US15
    And verify doctor can see  description_US15
    And verify doctor can see created data_US15


    And Click on My Inpatient
    And Click edit In Patient
    And click Status to change the inpatient status
    And change status from Canceled to  DISCHARGED
    And Select ROOM number from dropdown
    And Click SAVE  button confirm changes
    Then close the application