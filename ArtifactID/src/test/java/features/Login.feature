Feature: Sauce Labs Application Login


  
		@RegTest
	 Scenario: SwagLabs Login : Positive
    Given User is on SauceDemo home Page
    When User login into Application with "standard_user" and "secret_sauce"
    Then Products Home Page displayed is "true"
    And Logsout
  
		@NegTest
   Scenario: SwagLabs Login : Negative
    Given User is on SauceDemo home Page
    When User login into Application with "standard_user2" and "secret_sauce2"
    Then Products Home Page displayed is "false"
   