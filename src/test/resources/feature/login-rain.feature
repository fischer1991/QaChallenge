Feature: Login at Rain Platform
  As an user I want to go to https://rain-web-staging-0.rain.bh/en/ and perform Login into my account

  @loginAtRainPlatform
  Scenario: Perform Login at Rain platform
    Given the user is on Tamanna website
    And the user clicks on kids menu
    And the user clicks on shoes kids menu
    And the user chooses Nike Air Max shoes
    When the user clicks Add to Cart button
    And the confirmation message is displayed: Added to your shopping bag!
    And the user clicks on beauty menu
    And the user clicks on hair menu
    And the user chooses Babyliss Pro Rotating Hot Air Styler
    When the user clicks Add to Cart button
    And the confirmation message is displayed: Added to your shopping bag!

#    And set the password into the "<Password>" input field
#    When click in Login Button
#    Then a session should be create placing the user in the home page