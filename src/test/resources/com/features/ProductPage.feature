Feature: Add product to cart
  As a user
  I want to add products to my shopping cart
  So that I can purchase them later

  Background:
    Given I launch the browser
    And I open the application
    And I login with valid credentials "vcvikas@gmail.com" and "Newpass@13"

  Scenario: Add a single product to cart
    When I navigate to "Products" page
    And I add the product with description "Blue Top" to the cart
    Then I should see a success message "Your product has been added to cart."
    And I click on continue shopping button
   

  
