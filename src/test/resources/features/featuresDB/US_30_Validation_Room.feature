@US30DataBaseTest
Feature: Database_Feature

  Scenario: Validate Room By Room Number
    Given user connects to databaseha
    When get all "room_number" as a list fromha "room"
    Then verify list containsha "2555832"
    And close the connectionha


