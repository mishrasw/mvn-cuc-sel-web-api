Feature: Test Scenarios for TradeMe Web Application
	
	@smoke
  Scenario Outline: Count number of Items in the named cars in the dropdown
    Given I navigate to website and launch home page
    Then I verify number of named makes equal to <items>

   Examples:
    |items		|
    |79				|
    
@smoke
  Scenario Outline: Search for named cars in make dropdown
    Given I navigate to website and launch home page
    When I navigate to cars tab and search for <make>

   Examples:
    |make		|
    |Ferrari|
    |BMW		|
    |Mazda	|
    |Honda	|
    