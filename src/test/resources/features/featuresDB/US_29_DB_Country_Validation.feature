@US29_DB_Testing
Feature:DB_Country_Validation
  Scenario: TC_06 Verify Country information
    Given user connects to the databaseYA
    When user sends the query to getYA "name" column from "country" table
    Then user verifyYA in "country" table "name" column contains "Belgium"
    Then close the connectionYA