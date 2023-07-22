@US_21_UserManagement
Feature: User Management Activation and Editing By Admin

  Background: Sign In As Admin
    Given Admin should navigate to "https://www.medunna.com/" pageYA
    When click on user icon optionYA
    And click on sign in optionYA
    And Enter Admin "AdminTeam03" into username inputYA
    And Enter Admin "Team03+" into password inputYA
    And Click on Sign In submit buttonYA
    And Click on Administration dropdown iconYA
    And Click on User management optionYA
    And Click on Login option to sort in desc orderYA

  @TC_01_UM
  Scenario Outline: TC_01 Verify Admin can view registered user info as firstname,lastname etc...
    When Click on View option of registered userYA
    Then Verify registered user info "<firstname>", "<lastname>" and "<email>" displayed on the pageYA
    Then close the applicationYA
    Examples:
      | firstname | lastname | email              |
      | zeynep    | Can      | aazeynep@gmail.com |

  @TC_02_UM
  Scenario: TC_02 Verify Admin can activate user and give user role as ADMIN
    When Click on Edit option of registered userYA
    And Click on Activated Checkbox if it is not selectedYA
    And Select "ROLE_ADMIN" from Profiles dropdownYA
    And Click on Save buttonYA
    And Click on Login option to sort in desc orderYA
    Then Verify user status is ActivatedYA
    Then Verify user profiles "ROLE_ADMIN" is displayed on the pageYA
    Then close the applicationYA

  @TC_03_UM
  Scenario: TC_03 Verify Admin can activate user and give user role as USER
    When Click on Edit option of registered userYA
    And Click on Activated Checkbox if it is not selectedYA
    And Select "ROLE_USER" from Profiles dropdownYA
    And Click on Save buttonYA
    And Click on Login option to sort in desc orderYA
    Then Verify user status is ActivatedYA
    Then Verify user profiles "ROLE_USER" is displayed on the pageYA
    Then close the applicationYA

  @TC_04_UM
  Scenario: TC_04 Verify Admin can activate user and give user role as PATIENT
    When Click on Edit option of registered userYA
    And Click on Activated Checkbox if it is not selectedYA
    And Select "ROLE_PATIENT" from Profiles dropdownYA
    And Click on Save buttonYA
    And Click on Login option to sort in desc orderYA
    Then Verify user status is ActivatedYA
    Then Verify user profiles "ROLE_PATIENT" is displayed on the pageYA
    Then close the applicationYA

  @TC_05_UM
  Scenario: TC_05 Verify Admin can activate user and give user role as STAFF
    When Click on Edit option of registered userYA
    And Click on Activated Checkbox if it is not selectedYA
    And Select "ROLE_STAFF" from Profiles dropdownYA
    And Click on Save buttonYA
    And Click on Login option to sort in desc orderYA
    Then Verify user status is ActivatedYA
    Then Verify user profiles "ROLE_STAFF" is displayed on the pageYA
    Then close the applicationYA

  @TC_06_UM
  Scenario: TC_06 Verify Admin can activate user and give user role as PHYSICIAN
    When Click on Edit option of registered userYA
    And Click on Activated Checkbox if it is not selectedYA
    And Select "ROLE_PHYSICIAN" from Profiles dropdownYA
    And Click on Save buttonYA
    And Click on Login option to sort in desc orderYA
    Then Verify user status is ActivatedYA
    Then Verify user profiles "ROLE_PHYSICIAN" is displayed on the pageYA
    Then close the applicationYA



