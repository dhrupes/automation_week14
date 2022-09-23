Feature: Store Search Functionality


  Scenario: I should be able to see a store near West Palm Beach and should be able take a screen shot
    Given I am on the homepage
    When I click on Our stores link
    And I click on OK on Google popup screen
    And I drag and drop the map of "West Palm Beach" to the centre of the screen
    Then I take a screenshot of map

