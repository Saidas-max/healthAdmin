@US07
Feature: User info segment (User Settings) should be editable on Homepage


  Scenario:TC_01 Signin Medunna
    Given user is on "https://medunna.com" pageHA
    When click on user icon on menuHA
    And click on Sign In optionHA
    And enter registered usernameHA
    And enter registered  passwordHA
    And click on Sign In submit buttonHA


  Scenario:TC_02 There should be an option to update firstname
    Given user is on "https://medunna.com" pageHA
    When Click On User  Registered User Name iconHA
    And Click SettingHA
    And Edit the first nameHA
    And Click save buttonHA
    Then Verify  Setting saved is displayedHA




  Scenario:TC_03 There should be an option to update lastname
    When Click On User  Registered User Name iconHA
    And Click SettingHA
    And Edit the last nameHA
    And Click save buttonHA
    Then Verify  Setting saved is displayedHA



  Scenario:TC_04 There should be an option to update email
    When Click On User  Registered User Name iconHA
    And Click SettingHA
    And Edit the emailHA
    And Click save buttonHA
    Then Verify  Setting saved is displayedHA
    And close the applicationHA







