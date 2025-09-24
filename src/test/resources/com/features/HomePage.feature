Feature: Home Page functionality
  As a user
  I want to view and interact with the home page
  So that I can navigate to products and cart sections

  Background:
    Given I open the application

  Scenario: Verify home page loads successfully
    Then I should see the logo displayed
    And I should see the "Home" menu highlighted
    And I should see Products, Cart links
