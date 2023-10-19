@JS
Feature: add a gift card
  I want to add a gift card on Demo Web Shop
    
    @gp1
  Scenario: adding 1st gift card
    Given I hit the url "https://demowebshop.tricentis.com/register"
    When click on login
    Then add desktop
    And Logout from the application