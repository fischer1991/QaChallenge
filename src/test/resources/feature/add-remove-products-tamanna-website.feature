#Please run the full feature
Feature: Add and remove products from shopping bag at Tamanna website

  Scenario: Positive Test - Add kids Nike Air Max shoes to the shopping bag
    Given the user is on Tamanna website
    And the user clicks on kids menu
    And the user clicks on shoes kids menu
    And the user chooses Nike Air Max shoes
    When the user clicks Add to Cart button
    Then the confirmation message is displayed

  Scenario: Positive Test - Add beauty hair Babyliss Pro to the shopping bag
    Given the user is on Tamanna website
    And the user clicks on beauty menu
    And the user clicks on hair menu
    And the user chooses Babyliss Pro Rotating Hot Air Styler
    When the user clicks Add to Cart button
    Then the confirmation message is displayed

  Scenario: Positive Test - Remove two items from the shopping bag and returns to the home page
    Given the user is on Tamanna website
    And the user goes to the shopping bag
    And the quantity of items displayed is: 2
    And the total amount displayed is: KWD 91.900
    When the user deletes the 2 items on the shopping bag
    Then the user validate the total price is zero
    And the user clicks on the home page icon