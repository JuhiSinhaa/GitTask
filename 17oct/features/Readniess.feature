@JS
Feature: Registration
  I want to register my myself on Demo Web Shop

  @gp
  Scenario: Do Register
    Given I hit the url "https://demowebshop.tricentis.com/register"
    And Enter  all the details
    Then I click on register button
    
    @gp1
  Scenario: Do Register
    Given I hit the url "https://demowebshop.tricentis.com/register"
    When click on login
    And enter credentials
    Then click on login button