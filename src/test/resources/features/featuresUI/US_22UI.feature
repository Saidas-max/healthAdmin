@US22_UI

Feature:Show appointments for patients by Staff

  Scenario:TC_01 Staff can only update appointments
    Given user goes to medunna urlha
    When Click account menuha
    And Click sign In dropdownha
    And Enter registered staff usernameha
    And Enter registered staff passwordha
    And Click Sign In submit buttonHA
    And Click my pages on menuha
    And Click search patient dropdownha
    And Enter SSN numberha
    And Click show appointments buttonha
    And Click edit buttonha
    And Update start dateha
    And Update end dateha
    And Select appointment-physicianha
    And Click Save Buttonha
    And Verify updated appointment date massage alert is appeardha
    Then Close an applicationha

  Scenario:TC_02 Staff can make the status UNAPPROVED, PENDING or CANCELLED, but cannot make it COMPLETED
    Given user goes to medunna urlha
    When Click account menuha
    And Click sign In dropdownha
    And Enter registered staff usernameha
    And Enter registered staff passwordha
    And Click Sign In submit buttonHA
    And Click my pages on menuha
    And Click search patient dropdownha
    And Enter SSN numberha
    And Click show appointments buttonha
    And Click edit buttonha
    And Click status buttonha
    And click UNAPPROVED dropdownha
    And click PENDING dropdownha
    And click CANCELLED  dropdownha
    Then verify COMPLETED dropdown is not display to clickha
    Then Close an applicationha

  Scenario:TC_03 Staff does not need to provide Anamnesis, Treatment or Diagnosis as required fields
    Given user goes to medunna urlha
    When Click account menuha
    And Click sign In dropdownha
    And Enter registered staff usernameha
    And Enter registered staff passwordha
    And Click Sign In submit buttonHA
    And Click my pages on menuha
    And Click search patient dropdownha
    And Enter SSN numberha
    And Click show appointments buttonha
    And Click edit buttonha
    And Leave Anamnesis field emptyha
    And Leave Treatment field emptyha
    And Leave Diagnosis field emptyha
    And Select appointment-physicianha
    And Click Save Buttonha
    And Verify updated appointment date massage alert is appeardha
    Then Close an applicationha

  Scenario:TC_04 They can select the current doctor that needs to be selected for the patient
    Given user goes to medunna urlha
    When Click account menuha
    And Click sign In dropdownha
    And Enter registered staff usernameha
    And Enter registered staff passwordha
    And Click Sign In submit buttonHA
    And Click my pages on menuha
    And Click search patient dropdownha
    And Enter SSN numberha
    And Click show appointments buttonha
    And Click edit buttonha
    And verify selectable appointment-physicianha
    And Click Save Buttonha
    And Verify updated appointment date massage alert is appeardha
    Then Close an applicationha

  Scenario:TC_05 They can view the patients test results
    Given user goes to medunna urlha
    When Click account menuha
    And Click sign In dropdownha
    And Enter registered staff usernameha
    And Enter registered staff passwordha
    And Click Sign In submit buttonHA
    And Click my pages on menuha
    And Click search patient dropdownha
    And Enter SSN numberha
    And Click show appointments buttonha
    And Click show test button
    And Click View Result buttonha
    Then Verify the patient test result is appear



