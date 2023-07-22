Feature: Create or Edit Patient by just Admin

  @US_16_TC_01
  Scenario: TC_01 New patients can only be created by admin
  Given user goes to medunna url3
  And clicks on user icon
  And clicks on user sign in option4
  When send admin username into username input4
  And send admin password into password input4
  And clicks on Sign in button4
  And clicks on Items and Titles option
  And admin select patient option
  And admin clicks on create a new patient button
  And admin fills the patient info boxes
  And admin clicks on save button
  Then verify a new patient with identifier message is displayed
