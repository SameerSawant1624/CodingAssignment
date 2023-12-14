Feature: User Registration

  Scenario: Register a new user on Amazon
    Given User is on the Amazon homepage
    When User clicks on the "Sign In" button
    And User selects "Create a new account"
    And User fills in the registration form
    And User clicks on the "Create your Amazon account" button
    Then User should be registered successfully
