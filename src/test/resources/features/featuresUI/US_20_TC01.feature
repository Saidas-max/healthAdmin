@us20_tc01
  Feature:us20_tc01

    @yalniz_us20_tc1
    Scenario:us20_tc01

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us

    And click on staff item20us
    And click on create a new staff button20us
    And click on use search box20us
    And enter registered staff ssn number20us
    And click on search user button20us

    Then verify admin sees user found success pop up message20us
      And close the applicationYA




    @yalniz_us20_tc2
      Scenario: us20_tc02

        Given user is on "https://medunna.com" page12
        When click on user icon12
        And click on Sign In option12
        And enter "AdminTeam03" in username input12
        And enter "Team03+" in password input12
        And click on Sign In submit button12
        And click on items titles button18us

        And click on staff item20us
        And click on create a new staff button20us
        And click on use search box20us
        And enter registered staff ssn number20us
        And click on search user button20us
        And populate their information20us
        And click on save button20us
        Then verify admin sees success pop up message20us

    @yalniz_us20_tc3
    Scenario: us20_tc03

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us

      And click on staff item20us
      And click on staff's id which is us"4362"FC
      Then verify admin can select staff from staff listFC
      And close the applicationYA


    @yalniz_us20_tc4
    Scenario: us20_tc04

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us
      And click on staff item20us

      Then verify admin can edit staff info
      And close the applicationYA


    @yalniz_us20_tc5
    Scenario: us20_tc05

      Given user is on "https://medunna.com" page12
      When click on user icon12
      And click on Sign In option12
      And enter "AdminTeam03" in username input12
      And enter "Team03+" in password input12
      And click on Sign In submit button12
      And click on items titles button18us
      And click on staff item20us

      Then verify admin can delete staff info
      And close the applicationYA














