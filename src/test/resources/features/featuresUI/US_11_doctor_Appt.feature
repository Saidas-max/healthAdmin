@UI_Dr_Appt
Feature: Ui_Feature

  Background:Login
    Given User navigate to "medunnaUrl"
    When Click Sign in iconHU
    And Choose Sign in from dropdownHU
    And Enter the usernameHU
    And Enter the passwordHU
    And Click the sign in buttonHU
    And Click on MY PAGEHU
    And Choose My Appointments from dropdownHU

  @TC_01
  Scenario:Doctor should be able to see his/her appointment listHU
    Then Verify that their Appointments list on My Appointments pageHU
    Then Verify that their Appointments time slots on My Appointments pageHU
    Then close the applicationHU


  @TC_02
  Scenario:User(doctor) can see patient id, start date, end date, status…HU
    Then Verify that patient id, start date, end date, statusHU
    Then close the applicationHU


