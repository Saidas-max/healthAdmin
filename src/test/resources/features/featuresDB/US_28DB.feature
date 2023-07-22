@US_28DB

Feature: US_28 Database_Feature
  Scenario:US_28DB Connection database
    Given user connectUI to the  database
    And user getUI the column "id" from table "cmessage"
    And user readUI all the  columnIds database
    Then verify that 23114 should be in cmessage id listUI
    And close data base connectionUI