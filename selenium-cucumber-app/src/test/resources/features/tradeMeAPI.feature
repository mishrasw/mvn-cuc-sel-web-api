Feature: Test Scenarios using  TradeMe API
    
@smoke
  Scenario Outline: Verify number of named cars using Trademe API
    Given I am sending <RequestType> request to <EndPoint>
    Then Verify number of named cars to equal <numberofNamedCars>
    
    Examples:
    |RequestType|EndPoint									|numberofNamedCars|
    |GET				|Categories/UsedCars.json	|78					 			|