#Author: TradeMe car search test scenarios
Feature: Verify number of named cars in make dropdown
and number of number of cars for each Make type
	
@smoke
  Scenario Outline: Verify number of named cars in make dropdown
    Given I navigate to website and launch home page
    When I navigate to cars tab and search for <make>

   Examples:
    |make		|
    |Ferrari|
    |BMW		|
    
@smoke
  Scenario Outline: Verify number of named cars through API call
    Given I am sending <RequestType> request to <EndPoint>
    Then Verify number of named cars to equal <numberofNamedCars>
    
    Examples:
    |RequestType|EndPoint									|numberofNamedCars|
    |GET				|Categories/UsedCars.json	|78					 |