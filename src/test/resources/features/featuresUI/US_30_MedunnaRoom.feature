@US30_UI
Feature: Medunna Room

  Scenario: TC_01 Room Creation-Read info_Update room info
              Given user is "https://www.medunna.com/" pageha
              When Click on user icon on menuha
              And Click on Sign In optionha
              And Enter registered  admin usernameha
              And Enter registered  admin passwordha
              And Click on Sign In submit buttonha
              And Click Ittem&Titles Menuha
              And Click room dropdown optionha
              And Click Creat a new Room Buttonha
              And Enter a room numberha
              And Choose Room Typeha
              And Click Status Checkboxha
              And Enter room priceha
              And Enter Descriptionha
              And Choose created dateha
              Then Click save buttonha
              Then Verify created roomha
              Then Clear pricebuttonha
              Then enter new roomPriceha
              Then Clear descriptionbuttonha
              Then Change description buttonha
              Then click again savebuttonha
              Then verify updated messageha
              Then close the applicationHA

        Scenario:TC_02 Room Delete
              Given user is "https://www.medunna.com/" pageha
              When Click on user icon on menuha
              And Click on Sign In optionha
              And Enter registered  admin usernameha
              And Enter registered  admin passwordha
              And Click on Sign In submit buttonha
              And Click Ittem&Titles Menuha
              And Click room dropdown optionha
              When Click delete buttonha
              Then click delete pop up messageha
              Then verify appear deleted room alert messageha
              Then  close the applicationHA




