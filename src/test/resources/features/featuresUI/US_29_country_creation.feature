@US_29_CountryCreation
Feature: Country Creation
  Scenario: TC_01 Verify Admin can create a country
    Given Admin should navigate to "https://www.medunna.com/" pageYA
    When click on user icon optionYA
    And click on sign in optionYA
    And Enter Admin "AdminTeam03" into username inputYA
    And Enter Admin "Team03+" into password inputYA
    And Click on Sign In submit buttonYA
    And Click on Items&Titles dropdown iconYA
    And Click on Country optionYA
    When Click on Create a new Country buttonYA
    And Enter a Country name into Name fieldYA
    And Click on Save submit buttonYA
    Then Verify A new Country is created message displayed on the pageYA
    #And Verify created country is on country pageYA
    Then close the applicationYA
