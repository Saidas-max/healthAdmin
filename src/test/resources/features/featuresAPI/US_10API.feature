@US_10API

Feature:Api_Feature

  @Api
  @GetRegistrantRequirement
  Scenario:US_TC05_Get_Request
    Given user set the urlulf "https://medunna.com/api/user?ssn=301-20-3030"
    And Call the Pojo to create expected dataulf
    And sends a get-request to get all registrant dataulf
    Then HTTP Status Code shouldulf be 200
    Then  Verify response content type isulf "application/json"
    Then Verify expected values and actual values should be sameulf
