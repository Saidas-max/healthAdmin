@DB_Dr_Validate
Feature: US_31 Database

  Scenario: Validate all Physicians
    Given admin connects to the databasehuy
    When admin gets "first_name" as a list from "physician"
    Then admin validates all physicianshuy
    Then verify that "name" should be in listhuy