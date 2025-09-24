Feature: Payment process
  As a user
  I want to pay for my order
  So that I can successfully complete my purchase

  Background:
    Given I open the application
    And I login with valid credentials "vcvikas@gmail.com" and "Newpass@13"
   When I navigate to Products page
    And I add the product with description "Blue Top" to the cart
    Then I should see a success message "Your product has been added to cart."
    And I click on continue shopping button
    And I click on Cart link
    And I should see the product added with description "Blue Top" added 

  Scenario: Enter payment details and confirm order
    Given I click on Proceed to checkout button
    When I enter payment details with card name "Vikas", card number "4111111111111111", cvc "123", expiry "12", year "2026"
    And I click on Pay and Confirm Order
    Then I should see a payment success message "Congratulations! Your order has been confirmed!"
