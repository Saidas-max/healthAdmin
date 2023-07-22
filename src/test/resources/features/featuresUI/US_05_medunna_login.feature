@US_05_Login_Feature
Feature: Login_Feature

  Background: Login
    Given user navigate to "https://www.medunna.com/" pageYA
    When user click on user icon optionYA
    And user click on sign in optionYA

  @TC_01Login
  Scenario: TC_01_Login_With_Valid_Credentials
    When user enter valid usernameYA
    And user enter valid passwordYA
    And user click on remember me buttonYA
    And user click on sign in submit buttonYA
    Then verify user logged in with valid credentials and Welcome to medunna on the pageYA
    Then close the applicationYA

  @TC_02Login
  Scenario: TC_02_Login_With_Invalid_Password
    When user enter valid usernameYA
    And user enter invalid passwordYA
    And user click on remember me buttonYA
    And user click on sign in submit buttonYA
    Then verify failed to sign in message displayed on the pageYA
    Then close the applicationYA

  @TC_03Login
  Scenario: TC_03_Login_With_Invalid_Username
    When user enter invalid usernameYA
    And user enter valid passwordYA
    And user click on remember me buttonYA
    And user click on sign in submit buttonYA
    Then verify failed to sign in message displayed on the pageYA
    Then close the applicationYA

  @TC_04Login
  Scenario: TC_04_Verify_RememberMeOption
    When user enter valid usernameYA
    And user enter valid passwordYA
    Then verify remember me option is on the pageYA
    And user click on remember me buttonYA
    Then verify remember me button is selectableYA
    Then close the applicationYA

   @TC_06Login
    Scenario: TC_06_Verify_Registration_Link_option_on_the_login_page
      Then verify Register a new account link option is on the pageYA
      And user click on the Register a new account linkYA
      Then verify user is taken to Registration pageYA
      Then close the applicationYA

   @TC_07Login
    Scenario: TC_07_Verify_There_Is_Cancel_Option_On_The_Page
      When user enter valid usernameYA
      And user enter valid passwordYA
      And user click on remember me buttonYA
      Then verify there is cancel button on the login pageYA
      And user click on the cancel buttonYA
      Then verify user is taken to home pageYA
      Then close the applicationYA
