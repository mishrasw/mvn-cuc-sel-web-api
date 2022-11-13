package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
	
	protected WebDriver driver;

	private By motorsLink = By.xpath("//a[@routerlink='/motors']");
	private By carsTab = By.xpath("//*[@alt='Search all cars']");
	
	public void onHomePage(WebDriver driver, Logger logger) throws FileNotFoundException, IOException {
		this.driver = driver;
		Properties propVal = new Properties();
		propVal.load(new FileInputStream(System.getProperty("user.dir")+"\\Enviroment.properties"));
		driver.get(propVal.getProperty("AUT_URL").toString());
		logger.info("Launching URL - "+propVal.getProperty("AUT_URL").toString());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 	
		WebElement motorlinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(motorsLink));
	}
	
	public void navigateCarsPage(WebDriver driver) {
		this.driver = driver;
		driver.findElement(motorsLink).click();
		WebElement motorlinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(carsTab));
	}
	
}
