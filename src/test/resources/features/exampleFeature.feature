Feature: Example feature
  @demo
  Scenario: add Item to the cart
    Given I visit "https://www.saucedemo.com/"
    And I login with username "standard_user" and password "secret_sauce"
    When I add a random item to the shopping cart
    Then 1 item is added to the shopping cart