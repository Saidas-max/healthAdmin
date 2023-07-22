@MedunnaApiPostTest
Feature:Api_Feature

  @Api
  @PostUserRequirement
  Scenario:US_TC06_Post_Request
    Given user set the url for post request
    And Call the Pojo to create new expected data
    And user sends a post-request to create a new registrant
    Then Verify expected values and actual values




