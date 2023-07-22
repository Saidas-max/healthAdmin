@US_28APIPost

Feature:Api_Feature

  @Api
  @PostMessageCreating
  Scenario:US_TC03_Post_Request
    Given user set the urlmedunna request
    When Call the Pojo to create expected dataul
    And post a request to create new message
    Then user should validate creating messages




