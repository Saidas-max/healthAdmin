@US_10DB

Feature: US_10 Database_Feature
  Scenario:US_10DB Connection database
    Given user connects to the  database IU
    And user gets the column "id" from table "patient"IU
    And user reads all the  columnIds dataIU
    Then verify that 5972 should be in patient listIU
    And close the connectionIU




