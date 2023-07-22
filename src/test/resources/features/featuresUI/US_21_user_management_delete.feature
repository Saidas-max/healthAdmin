@US_21_Deleting_User
Feature: Delete User By Admin

  Scenario Outline: : TC_07 Verify Admin can delete user
    Given Admin should navigate to "https://www.medunna.com/" pageYA
    When click on user icon optionYA
    And click on sign in optionYA
    And Enter Admin "AdminTeam03" into username inputYA
    And Enter Admin "Team03+" into password inputYA
    And Click on Sign In submit buttonYA
    And Click on Administration dropdown iconYA
    And Click on User management optionYA
    And Click on Create a new user buttonYA
    And Enter user "<login>" into login fieldYA
    And Enter user "<email>" into email fieldYA
    And Enter user "<ssn>" into ssn fieldYA
    And Click on Save submit buttonYA
    And Click on ID option to sort in desc orderYA
    And Click on delete buttonYA
    And Click on confirm delete buttonYA
    Then verify user deleted message displayed on the pageYA
    Then close the applicationYA
    Examples:
      | login     | email           | ssn         |
      | Cancagzim | cano@gmail.com  | 234-45-8765 |
      | selam     | selam@gmail.com | 234-37-5465 |
