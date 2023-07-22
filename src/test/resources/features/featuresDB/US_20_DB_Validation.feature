@us20_database
  Feature: us_20_database
    Scenario:us20database
      #Given user   Given user connects to the databaseFC
      When user sends the query to get the name of "last_name" column from "staff" tableFC
      #And user get all column dataFC
      Then assert that there is  a lastname  "fazilet"
      #And close the connection
