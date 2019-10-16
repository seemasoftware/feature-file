Feature: As a user I want to register so I can use all the facilities within my  account
  @register
  Scenario: User should be able to register successfully
    Given user is on registration page
    When user enter all required details
    Then user should be able to see successful message
