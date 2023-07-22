
@AnyUser_Contact_Message @smoke
Feature:Staff_Search

      Background:contact_info
      Given user goes to medunna homePage
      When user clicks CONTACT Option on homepage

  @contact_info
  Scenario: TC_01_Any_User_Provide_information_Request

    And verify that there is location text  and hospital address
    And verify that there is email text  and email
    And verify that there is call text  and phone number
    And close the applicationYA

  @contact_message
  Scenario Outline: TC_02_Any_User_Provide_information_Request
    And user enters Name "<nameUser>" in name field
    And user enters Email "<emailUser>" in email field
    And user enters Subject "<subjectUser>" in subject field
    And user enters Message "<messageUser>" in message field
    And close the applicationYA


    Examples: ContactInfo
      | nameUser  | emailUser          | subjectUser      | messageUser |
      | Tom Hanks | tomhanks@gmail.com | appointment info | hi          |


