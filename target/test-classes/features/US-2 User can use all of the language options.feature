@hooks
Feature: US-2 User_can_use_all_of_the_language_options
  Scenario: TC02_Testing_the_language_portal
  Given user is on the global trader page
  And user click on the Language Portal
  And user select the Norwegian language
  Then verify on the language portal box and language is selected Norwegian