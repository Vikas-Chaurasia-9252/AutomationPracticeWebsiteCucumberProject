Feature: Payment process
  As a user
  I want to pay for my order
  So that I can successfully complete my purchase

  Background:
    Given I launch the browser
    And I open the application
    And I login with valid credentials "vcvikas@gmail.com" and "Newpass@13"
    And I have products added to the cart
    And I proceed to checkout and place order

  Scenario: Enter payment details and confirm order
    When I enter payment details with card name "Vikas", card number "4111111111111111", cvc "123", expiry "12", year "2026"
    And I click on "Pay and Confirm Order"
    Then I should see a success message "Congratulations! Your order has been confirmed!"
