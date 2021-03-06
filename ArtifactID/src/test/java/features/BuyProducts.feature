Feature: Buy Products
  @RegTest
  Scenario: Add backPack to Cart and dont Checkout
  Given User is on SauceDemo home Page
  When User login into Application with "standard_user" and "secret_sauce" 
  Then Products Home Page displayed is "false"
  And User is able to add "Sauce Labs Backpack" to Cart
  And Logsout
  
  @SmokeTest 
  Scenario Outline: Add Bike Light to Cart and Checkout
    Given User is on SauceDemo home Page
    When User login into Application with "problem_user" and "secret_sauce"
    Then Products Home Page displayed is "false"
    And User is able to add "Sauce Labs Bike Light" to Cart
    And User Signs up using <FirstName> and <LastName> and <PostalCode>
    And Logsout
    
Examples:
|FirstName|LastName|PostalCode|
|TestF|TestL|999991|
|TestS|TestL|999992|
|TestT|TestL|999993|


