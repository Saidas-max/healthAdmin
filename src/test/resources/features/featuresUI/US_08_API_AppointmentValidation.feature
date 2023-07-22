@08_API
Feature:API Validation Appointment
  Scenario:TC_03 There should be an option to update lastname
    Given user is "https://www.medunna.com/" pageHA
    When Click on user icon on menu08
    And Click on Sign In optionHA
    And Enter registered  doctor usernameHA
    And Enter registered  doctor passwordHA
    And Click on Sign In submit buttonHA
    And click My pages iconHA
    And click My Appointments dropdownHA
    And enter  date in the "from date" boxHA
    And enter  date "to" date boxHA
    Then verify patient appointment appears on the pageHA
    Then close the applicationHA
