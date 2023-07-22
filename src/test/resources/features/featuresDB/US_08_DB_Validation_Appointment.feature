@US_08_DatabaseTest
Feature: Database_Feature
  Scenario:TC_04 Connection database
    Given user connects to the  database HA
    And user gets the column "id" from table "appointment"HA
    And user reads all the  columnIds data
    Then verify that 10586 should be in appointment list
    And close the connectionHA



