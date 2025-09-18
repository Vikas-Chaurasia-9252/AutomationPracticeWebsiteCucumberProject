Feature: Cart Page functionality
  As a user
  I want to view my shopping cart
  So that I can update or remove products before checkout

  Background:
    Given I launch the browser
    And I open the application
    And I login with valid credentials "vcvikas@gmail.com" and "Newpass@13"
    And I have at least one product in the cart

  Scenario: View cart contents
    When I click on "Cart" link
    Then I should see the product added with description "Blue Top" added 

 
