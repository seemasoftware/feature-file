Feature: Refer a Product to friend

  @RegisterReferAFriend
  Scenario: As a register user should be able to refer a product to friend successfully
    Given user is on registration page
    When user enter all required details
    And click on continue button
    And user click on jewellery category
    And click on bracelet
    And click on email a friend button
    And enter friend details
    Then user should be able to refer to a product to a friend successfully

   @UnregisterReferAFriend
  Scenario: As a unregister user should not be able to refer a product to email friend
    Given user is on home page
    When user click on jewellery category
    And click on bracelet
    And click on email a friend button
    And enter friend details as a unregister
    Then user should not be able to refer a product to email friend


