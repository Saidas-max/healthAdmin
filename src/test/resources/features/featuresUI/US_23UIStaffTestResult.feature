@staff_search_byssn
Feature:Staff_Search


  Scenario Outline: TC_01_Staff_Search_ByPatient_ssn
    Given user goes to medunna homePage
    When admin clicks on user icon
    And staff clicks Sign in option
    And staff enters user's name "<staffusername>" in field
    And staff enterspasswords's   "<staffpassword>" in field
    And staff click Remember Me checkbox
    And staff click on Sign In submit buttonAnd
    And staff click on MY PAGES on menuYA
    And staff click on Search Patient from dropdownYA
    And staff enters the SsnNumber "<ssnNumber>" into patient ssn field
    And staff clicks show appointments button to see appointment


    Examples: SignIn
      | staffusername | staffpassword | ssnNumber   |
      | PersonelSedat | Serinhisar20  | 744-02-3219 |

  Scenario: TC_02_Staff_click_apppointments_testbutton

    And staff clicks show test button to reach test
    And staff clicks view result button to view results
    And staff clicks view Edit Button to edit results

  Scenario: TC_03_Staff_edit_result_and_description
    And staff enter test result in result field
    And staff enter test description in description field
    And staff click test result save button






