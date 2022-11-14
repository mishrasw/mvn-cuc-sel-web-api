package steps;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.carsPage;
import pages.homePage;
import runner.TestRunner;

public class motorSteps extends TestRunner {

	private WebDriver driver=super.driver;
	private Logger logger = super.logger;
	private homePage home = new homePage();
	private carsPage cars = new carsPage();

	@Given("^I navigate to website and launch home page$")
	public void i_am_on_the_home_page() throws FileNotFoundException, IOException {
	   home.onHomePage(driver, logger);
	   logger.info("Successfully navigate to home page");
	}
	@When("^I navigate to cars tab and search for (.*?)$")
	public void i_navigate_to_motors_cars_tab(String make) {
	   home.navigateCarsPage(driver);
	   logger.info("Successfully navigate to car tab");
	   cars.searchByMake(driver, make);
	   logger.info("Successfully done search option ---> "+make);
	}
	@Then("^I verify number of named makes equal to (.*?)$")
	public void i_navigate_to_motors_cars_tab(int itemsCount) {
		home.navigateCarsPage(driver);
		logger.info("Successfully navigate to car tab");
		cars.verifyNumberOfNameMakes(driver, itemsCount);
		logger.info("##### Test Pass ###### Number of Named Cars on UI ---> "+itemsCount);
	}



}
