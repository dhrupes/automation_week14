Feature: Delete Button Functionality

  Scenario: I should be able to delete the item from the basket
    Given I am on the homepage
    When I mouse hover on the product and add to the cart
    Then I click on add to cart button
    Then I mouse hover on the cart tab


  Scenario: I should be able to select the "Summer Dresses" option from navigation menu
    Given I am on the homepage
    When I mouse hover on the Women tab
    And I click on "Summer Dresses" option
    Then I can view Summer Dress items


  Scenario: I should be able to change the price range on the summer dresses page
    Given I am on the homepage
    When I mouse hover on the Women tab
    And I click on "Summer Dresses" option
    And I should be able to click and drag the price range slider to $20
    Then I should be able to see the search result updated within price range


  Scenario: I should be able to create a user account
    Given I am on the homepage
    When I click on the "Sign in" tab
    And I enter Email address "ABCey@gmail.com"
    And I click on "Create an account"
    And I enter my first name "Dgrupesh"
    And I enter my last name"Patell"
    And I enter my Email address in personal information "ABCey@gmail.com"
    And I enter password as "Victoria12345"
    And I enter my address as "123, Croydon, London, PO BOX 123"
    And I enter my city as "Croydon"
    And I select state from the dropdown menu as "Alabama"
    And I enter my Zip/Postal Code as "12345"
    And I enter my mobile phone number as "123456789"
    And I enter my alias name as "Dhruv"
    And I click on Register button
    Then I should be able to see my account name on top right