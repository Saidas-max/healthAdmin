

@US_18_DB

  Feature:Us_18_Db

    Scenario: us_18_db

      Given user   Given user connects to the databaseFC
      When user sends the query to get the id of "id" column from "c_test_item" tableFC
      And user get all column dataFC
      Then assert that there is  a test_item id  13244
      And close the connection




