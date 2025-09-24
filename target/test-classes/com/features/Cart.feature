Feature: Cart Page functionality
  As a user
  I want to view my shopping cart
  So that I can update or remove products before checkout

  Background:
    Given I open the application
    And I login with valid credentials "vcvikas@gmail.com" and "Newpass@13"
     When I navigate to Products page
    And I add the product with description "Blue Top" to the cart
    Then I should see a success message "Your product has been added to cart."
    And I click on continue shopping button

  Scenario: View cart contents
    When I click on Cart link
    Then I should see the product added with description "Blue Top" added 

 
