Feature: Login at Rain Platform
  As an user I want to go to https://rain-web-staging-0.rain.bh/en/ and perform Login into my account

  Scenario: Perform Login at Rain platform
    Given the user is on Tamanna website
    And the user clicks on kids menu
    And the user clicks on shoes kids menu
    And the user chooses Nike Air Max shoes
    When the user clicks Add to Cart button
    Then the confirmation message is displayed
    And the user clicks on beauty menu
    And the user clicks on hair menu
    And the user chooses Babyliss Pro Rotating Hot Air Styler
    And the user clicks Add to Cart button
    And the confirmation message is displayed
    And the user goes to the shopping bag
    And the quantity of items displayed is: 2
    And the total amount displayed is: KWD 91.900
    And the user deletes the 2 items on the shopping bag
    And the user validate the total price is zero