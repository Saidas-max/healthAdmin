@patient_search_appointment
Feature:Staff_Search


  Scenario Outline: TC_01_Patient_Search_ByAppintment
    Given user goes to medunna homePage
    When admin clicks on user icon
    And staff clicks Sign in option
    And staff enters user's name "<patientusername>" in field
    And staff enterspasswords's   "<patientpassword>" in field
    And staff click Remember Me checkbox
    And staff click on Sign In submit buttonAnd
    And patient click on MY PAGES on menu
    And patient click on My Appointments opotions
    And patient click to show Tests button to see test results
    And patient click on view Results button
    Then verify that Test Results table name is seen
    Then verify that sees id, name, default min and max value, test date and description are on table

    Examples: SignIn
      | patientusername | patientpassword |
      | HastaBilge      | Luzumsuz71      |


  Scenario: TC_02_Patient_Invoice
    Given patient click on MY PAGES on menu
    And patient click on My Appointments opotions
    And Patient click the Show Invoce button
    Then Verify that  name , SSNNumber , totalCost on invoice






#    And patient click on Search Patient from dropdownYA
#
#
#
#    And patient enters the SsnNumber "<ssnNumber>" into patient ssn field
#    And staff clicks show appointments button to see appointment




#  Scenario: TC_02_Staff_click_apppointments_testbutton
#
#    And staff clicks show test button to reach test
#    And staff clicks view result button to view results
#    And staff clicks view Edit Button to edit results
#
#  Scenario: TC_03_Staff_edit_result_and_description
#    And staff enter test result in result field
#    And staff enter test description in description field
#    And staff click test result save button
#


