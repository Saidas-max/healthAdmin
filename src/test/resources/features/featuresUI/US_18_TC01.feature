@us18_tc01 @smoke
  Feature:us18_tc01


    Scenario:us18_tc01_Admin can create new test items

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us
      And click on test item18us
      And click on create a new test item18us
      And enter the name18us
      And enter the price18us
      And click on save button18us
      Then verify user see success popup message18us
      Then close the applicationYA


      Scenario: us18_tc02

        Given user is on "https://medunna.com" page12
        When click on user icon12
        And click on Sign In option12
        And enter "AdminTeam03" in username input12
        And enter "Team03+" in password input12
        And click on Sign In submit button12
        And click on items titles button18us
        And click on test item18us
        And click on create a new test item18us
        Then verify test itemsUsonsekiz
        Then close the applicationYA


    Scenario: us18_tc03

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us
      And click on test item18us
      And click on IDFC;
      Then verify admin can delete test itemsUsonsekiz
      Then close the applicationYA



   Scenario: us18_tc04

     Given user is on "https://medunna.com" page12
     When click on user icon12
     And click on Sign In option12
     And enter "AdminTeam03" in username input12
     And enter "Team03+" in password input12
     And click on Sign In submit button12
     And click on items titles button18us
     And click on test item18us
     Then verify admin sees test items








