Feature: Search and Add to Cart

  Scenario: Search iPhone and Add to Cart
    Given User is on the Amazon homepage
    When User searches for "iPhone"
    And User selects the first result
    And User goes to the product details page
    And User stores the price in a variable
    And User adds the product to the cart
    Then Product should be added to the cart successfully
