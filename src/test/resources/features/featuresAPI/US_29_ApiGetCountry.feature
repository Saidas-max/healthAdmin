@US_29_Api
Feature: Country Get Request

  Scenario: TC_03 Verify Country by sending GET request
    Given user set the url for GET RequestYA
    When user send GET request to see the countryYA
    Then verifyYA HTTP Status is 200
    Then verify user get the country data as expectedYA

  Scenario: TC_04 Verify Country by sending POST request
    Given user set the url for POST RequestYA
    When user send POST request to see the countryYA
    Then verifyYA HTTP Status is 201
    Then verify user get the country data as expectedYA after post request

  Scenario: TC_05 Verify Country by sending PUT request
    Given user set the url for PUT RequestYA
    When user send PUT request to see the countryYA
    Then verifyYA HTTP Status is 200
    Then verify user get the country data as expectedYA after put request

