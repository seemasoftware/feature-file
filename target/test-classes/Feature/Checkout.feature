Feature: user i want to checkout a product

  @CheckoutAsRegister
  Scenario: As a register user should be able to send a product successfully
    Given user is on home page
    When user is on registration page
    And user enter all required details
    And click on continue button
    And user click on jewellery category
    And click on bracelet
    And click on shopping cart
    And enter shopping details
    And enter checkout details
    Then register user should be able to checkout successfully

  @CheckoutAsUnregister
  Scenario: As a unregister user should be able to send a product successfully
    Given user is on home page
    When user click on jewellery category
    And click on bracelet
    And click on shopping cart
    And enter shopping details
    And enter checkout details as a unregister user
    Then unregister user should be able to checkout successfully


