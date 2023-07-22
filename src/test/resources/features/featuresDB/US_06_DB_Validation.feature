@US06_DB_Testing
Feature:DB_Appointment_Validation
  Scenario: TC_13 Verify patient appointment information
    Given user connects to the databaseYA
    When user sends the query to get "id" column from "appointment" tableYA
    And user get all column dataYA
    Then user verify the appointment with id 10567 is existYA
    Then close the connectionYA
