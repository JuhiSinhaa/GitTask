@DemoWebShop
Feature: Add To Cart
  I want to add some product to cart

  @AddToCart
  Scenario: add 1st product to cart
    Given I hit the url "https://demowebshop.tricentis.com/register"
    When click on login
    And enter credentials
    Then click on login button
    And I click on Books
    And I select one book to the cart
    